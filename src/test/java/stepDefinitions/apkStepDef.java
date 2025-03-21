package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.Driver;

public class apkStepDef {

    @Given("Kullanici uygulamayi yukler")
    public void kullanici_uygulamayi_yukler() {
        Driver.getAndroidDriver();


    }




}