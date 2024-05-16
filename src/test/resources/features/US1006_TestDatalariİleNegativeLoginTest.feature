

Feature: US1006 test datasi olarak verilen gecersiz bilgilerle giris yapilamaz



  Scenario: TC11 test datasi olarak verilen gecerli email ve gecersiz password ile giris yapilamamali

    Given kullanici "websiteUrl" anasayfaya gider
    Then account linkine tiklar
    And email olarak test datalarindan "websiteValidEmail" kullanir
    And password olarak test datalarindan "websiteInvalidPassword" kulllanir
    When Sign in butonuna basar
    Then giris yapilamadigini test eder
    And 3 saniye bekler
    And sayfayi kapatir




  Scenario: TC12 test datasi olarak verilen
  gecersiz email ve gecersiz password ile giris yapilamamali

    Given kullanici "websiteUrl" anasayfaya gider
    Then account linkine tiklar
    And email olarak test datalarindan "websiteInvalidEmail" kullanir
    And password olarak test datalarindan "websiteValidPassword" kulllanir
    When Sign in butonuna basar
    Then giris yapilamadigini test eder
    And 3 saniye bekler
    And sayfayi kapatir