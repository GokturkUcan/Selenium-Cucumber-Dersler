package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class WebAppStepdefinitions {


    TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();

    @Given("kullanici testotomasyonu anasayfaya gider")
    public void kullanici_testotomasyonu_anasayfaya_gider() {
        Driver.getDriver().get("https://www.testotomasyonu.com");
    }
    @When("arama kutusuna phone yazip enter tusuna basar")
    public void arama_kutusuna_phone_yazip_enter_tusuna_basar() {
        testotomasyonuPage.aramaKutusu.sendKeys("phone"+Keys.ENTER);
    }
    @Then("arama sonucunda urun bulunabildigini test eder")
    public void arama_sonucunda_urun_bulunabildigini_test_eder() {
        Assert.assertTrue(testotomasyonuPage.bulunanSonucElementleriListesi.size() > 0);
    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.quitDriver();
    }


    @When("arama kutusuna {string} yazip enter tusuna basar")
    public void arama_kutusuna_yazip_enter_tusuna_basar(String webAranacakKelime) {

        testotomasyonuPage.aramaKutusu.sendKeys(ConfigReader.getProperty("webAranacakKelime")+Keys.ENTER);
    }

}
