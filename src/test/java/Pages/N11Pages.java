package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.time.Duration;
import java.util.List;

public class N11Pages   {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By kategorilerButonu  = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Kategoriler\")");
    By apple = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Apple\")");
    By search = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Filtrele\")");
    By dahiliHafiza=MobileBy.AndroidUIAutomator("new UiSelector().text(\"Dahili Hafıza\")");
    By searchBar=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/et_attribute_search_bar\")");
    By apply = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Uygula\")");
    By model = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Model\")");
    By color = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Renk\")");
    By colorSelect = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Mavi\")");
    By hafiza = MobileBy.AndroidUIAutomator("new UiSelector().text(\"128 GB\")");
    By artiIsaret=MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivAddToBasket\")");
    By sonuclariGoster=MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sonuçları Göster\")");
    By sepeteEkle=MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sepete Ekle\")");
    By sepetiGoster=MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sepetim\")");
    By urunVarmi = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/basketItemProductLayout\")");





    public N11Pages(AppiumDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper=new ElementHelper(driver);
    }

    public void kategoriTiklama() {

        driver.findElement(kategorilerButonu).click();
    }

    public void elektronikTiklama() {
        List<WebElement> lisfOfElement=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivCategoryItem\")"));
        lisfOfElement.get(1).click();
    }

    public void telefonVeAksesuarSecimi() {

        List<WebElement> lisfOfElement=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivCategoryItem\")\n"));
        lisfOfElement.get(0).click();
    }

    public void cepTelefonuSecimi() {

        List<WebElement> lisfOfElement=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/ivCategoryItem\")"));
        lisfOfElement.get(0).click();
    }

    public void markaSecimi() {
        elementHelper.click(apple);
    }

    public void filtrelemeTiklama() {
        elementHelper.click(search);
    }

    public void filtrelemeYap() {
        elementHelper.click(dahiliHafiza);
        elementHelper.click(searchBar);
        elementHelper.sendKeys(searchBar,"128");
        List<WebElement> listOfElement=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/selectionStatusCB\")"));
        listOfElement.get(0).click();
        driver.findElement(apply).click();

        elementHelper.click(model);
        elementHelper.sendKeys(searchBar,"Iphone 13");
        listOfElement=driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.dmall.mfandroid:id/selectionStatusCB\")"));
        listOfElement.get(0).click();
        driver.findElement(apply).click();

        elementHelper.scrollUntilTextFound(color.toString());
        elementHelper.click(color);
        elementHelper.click(colorSelect);
        elementHelper.click(apply);




    }

    public void sonuclariGosterTiklama() {
        elementHelper.click(sonuclariGoster);
    }

    public void urunuSepeteEkleme() {
        driver.findElement(artiIsaret).click();
        elementHelper.click(colorSelect);
        elementHelper.click(hafiza);
        elementHelper.click(sepeteEkle);
    }

    public void sepeteGit() {
        elementHelper.click(sepetiGoster);
    }

    public void sepetKontrol() {
        elementHelper.click(urunVarmi);
    }
}
