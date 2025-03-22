package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TeknosaPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class TeknosaStepDef {

    TeknosaPage teknosaPage=new TeknosaPage();

    @Given("Uygulama baslatilir")
    public void uygulama_baslatilir() {
        Driver.getAndroidDriver();
    }
    @When("Ilk ekran bolumunden atlaya tiklanir")
    public void ılk_ekran_bolumunden_atlaya_tiklanir() {
        teknosaPage.atlaButonu.click();
        ReusableMethods.bekle(2);

    }

    @When("bolumunden {string} bolumune tiklanir")
    public void bolumunden_bolumune_tiklanir(String string) {
        teknosaPage.kategorilerButonu.click();
        ReusableMethods.bekle(2);
    }


    @When("kategoriler bolumunden kaydirarak {string} bolumune tiklanir")
    public void kategoriler_bolumunden_kaydirarak_bolumune_tiklanir(String kategoriSecim) {
        ReusableMethods.dikeyKaydirma(Driver.getAndroidDriver(),0.80,0.20,0.50,100);
        ReusableMethods.bekle(2);
        ReusableMethods.scrollWithUiScrollableAndClick(kategoriSecim);


    }
    @When("acilan sayfadan {string} secimi yapilir")
    public void acilan_sayfadan_secimi_yapilir(String urun) {
        ReusableMethods.scrollWithUiScrollableAndClick(urun);
        ReusableMethods.bekle(3);

    }
    @When("filtrele bolumune tiklanir")
    public void filtrele_bolumune_tiklanir() {
        teknosaPage.FiltreleButonu.click();
        ReusableMethods.bekle(2);
    }
    @Then("Marka {string} bolumunden marka secimi yapilir")
    public void marka_bolumunden_marka_secimi_yapilir(String marka) {
        teknosaPage.markaButonu.click();
        ReusableMethods.bekle(3);
        teknosaPage.markaMetinYazmaKutusu.sendKeys(marka);
        ReusableMethods.bekle(3);
        teknosaPage.filtrelenmisMarkaKutusu.click();
        ReusableMethods.bekle(3);
        teknosaPage.SonuclariGosterButonu.click();
        ReusableMethods.bekle(3);
    }

    @When("siralama yapilirak {string} secilir")
    public void siralama_yapilirak_secilir(String siralamaSecimi) {
        teknosaPage.SiralaButonu.click();
        ReusableMethods.bekle(3);
        ReusableMethods.scrollWithUiScrollableAndClick(siralamaSecimi);
        ReusableMethods.bekle(3);
    }

    @Then("fiyatlarin artan duzende oldugu test edilir")
    public void fiyatlarin_artan_duzende_oldugu_test_edilir() {
        String artanDusukFiyat =teknosaPage.artanDusukFiyat.getText();
        artanDusukFiyat=artanDusukFiyat.replaceAll("\\D","");

        ReusableMethods.bekle(3);
        ReusableMethods.dikeyKaydirma(Driver.getAndroidDriver(),0.80,0.20, 0.50, 100);
        ReusableMethods.bekle(3);

        String artanYuksekFiyat =teknosaPage.artanYuksekFiyat.getText();
        artanYuksekFiyat=artanYuksekFiyat.replaceAll("\\D","");

        Assert.assertTrue(Integer.parseInt(artanYuksekFiyat)>Integer.parseInt(artanDusukFiyat));
    }

    @When("kategoriler bolumunden {string} bolumune tiklanir")
    public void kategoriler_bolumunden_bolumune_tiklanir(String kategori) {
        ReusableMethods.scrollWithUiScrollableAndClick(kategori);
        ReusableMethods.bekle(3);

    }

    @Then("Kullanici ekran fotografi almak icin {string}")
    public void kullanici_ekran_fotografi_almak_icin(String EkranGoruntusu) throws IOException {
        ReusableMethods.bekle(3);
        ReusableMethods.screenShotElement(EkranGoruntusu);

    }


}
