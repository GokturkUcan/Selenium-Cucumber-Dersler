package _webApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class websitePage {

    public websitePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//*[@class=\"menu-icon-text\"])[1]")
    public WebElement accountLink;

    @FindBy(xpath = "//*[@class=\"sign-up \"]")
    public WebElement signUpLink;

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    public WebElement firstNameBox;

    @FindBy(xpath = "//button[@id=\"btn-submit-form\"]")
    public WebElement signUpButton;

    @FindBy(xpath = "(//h3)[1]")
    public WebElement profileName;

    @FindBy(xpath = "(//span[@class=\"text-danger\"])[7]")
    public WebElement enterValidInformationText;

    @FindBy(xpath = "//input[@id=\"email\"]")
    public WebElement loginEmailBox;

    @FindBy(xpath = "//Button[@id=\"submitlogin\"]")
    public WebElement signInButton;




}
