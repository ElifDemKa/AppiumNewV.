package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TeknosaPage;
import utilities.Driver;
import utilities.ReusableMethods;

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
    @When(" bolumunden {string} bolumune tiklanir")
    public void footer_bolumunden_bolumune_tiklanir(String string) {
        teknosaPage.kategorilerButonu.click();
        ReusableMethods.bekle(2);


    }
    @When("kategoriler bolumunden kaydirarak {string} bolumune tiklanir")
    public void kategoriler_bolumunden_kaydirarak_bolumune_tiklanir(String kategoriSecim) {


    }
    @When("acilan sayfadan {string} secimi yapilir")
    public void acilan_sayfadan_secimi_yapilir(String string) {

    }
    @When("filtrele bolumune tiklanir")
    public void filtrele_bolumune_tiklanir() {

    }
    @Then("Marka {string} bolumunden marka secimi yapilir")
    public void marka_bolumunden_marka_secimi_yapilir(String string) {

    }
}
