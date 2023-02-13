package util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




import java.time.Duration;
import java.util.HashMap;

public class ElementHelper {

    AppiumDriver driver;
    WebDriverWait wait;
    Actions actions;

    public ElementHelper(AppiumDriver driver){
        this.driver=driver;
        this.wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        this.actions=new Actions(driver);
    }
    public WebElement presenceElement(By key){

        return wait.until(ExpectedConditions.presenceOfElementLocated(key));

    }
    public WebElement findElement(By key){
        WebElement element = presenceElement(key);
        return element;
    }
    public void click(By key){
        findElement(key).click();
    }
    public void sendKeys(By key , String text){
        findElement(key).sendKeys(text);
    }
    public void checkVisible(By key){
        wait.until(ExpectedConditions.presenceOfElementLocated(key));
    }

    public void scrollUntilTextFound(String text){
        while (!driver.findElements(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().textContains(\"" + text + "\"))")).isEmpty()) {
        }
    }



}
