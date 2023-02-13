package Stepdefinitions;

import Pages.N11Pages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.Test;
import util.DriverFactory;

public class N11StepDefinitions {

    N11Pages n11Pages = new N11Pages(DriverFactory.getDriver());

    @When("kategorilere tiklanir")
    public void kategorilereTiklanir() {
        n11Pages.kategoriTiklama();
    }

    @When("Elektronik tiklanir")
    public void elektronikTiklanir() {
        n11Pages.elektronikTiklama();
    }

    @When("TelefonVeAksesuarlari Secilir")
    public void telefonveaksesuarlariSecilir() {
        n11Pages.telefonVeAksesuarSecimi();
    }

    @When("Cep Telefonu Seçlir")
    public void cepTelefonuSeçlir() {
        n11Pages.cepTelefonuSecimi();
    }

    @When("Marka Secilir")
    public void markaSecilir() {
        n11Pages.markaSecimi();
    }

    @When("Filtreleme Tiklanir")
    public void filtrelemeTiklanir() {
        n11Pages.filtrelemeTiklama();
    }

    @When("Filtreleme Yaplir")
    public void filtrelemeYaplir() {
        n11Pages.filtrelemeYap();
    }

    @When("SonuclariGostere Tiklanir")
    public void sonuclarigostereTiklanir() {
        n11Pages.sonuclariGosterTiklama();
    }

    @When("Urun Sepete Eklenir")
    public void urunSepeteEklenir() {
        n11Pages.urunuSepeteEkleme();
    }

    @When("Sepetime Gidilir")
    public void sepetimeGidilir() {
        n11Pages.sepeteGit();
    }


    @Then("Sepete Urun Geldigi Kontrol Edilir")
    public void sepeteUrunGeldigiKontrolEdilir() {
        n11Pages.sepetKontrol();
    }
}
