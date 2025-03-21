Feature:Kullanici uygulama gorevini yerine getirir
  @teknosa
  Scenario: Kullanici uygulama uzerinde ilgili bolumu test eder
    Given Uygulama baslatilir
    When Ilk ekran bolumunden atlaya tiklanir
    When footer bolumunden "Kategoriler" bolumune tiklanir
    And kategoriler bolumunden kaydirarak "Ev ve Yaşam" bolumune tiklanir
    And acilan sayfadan "Aydınlatma" secimi yapilir
    And filtrele bolumune tiklanir
    Then Marka "Orbus" bolumunden marka secimi yapilir