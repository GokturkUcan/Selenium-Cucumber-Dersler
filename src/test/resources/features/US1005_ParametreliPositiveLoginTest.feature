

Feature: US1005 kullanici testdatasi olarak verilen gecerli bilgilerle giris yapar


  Scenario: TC10 gecerli test datalari ile giris yapilabilmeli

    Given kullanici "websiteUrl" anasayfaya gider
    Then account linkine tiklar
    And email olarak test datalarindan "websiteValidEmail" kullanir
    And password olarak test datalarindan "websiteValidPassword" kulllanir
    Then Sign in butonuna basar
    And basarili olarak giris yapildigini test eder
    And sayfayi kapatir