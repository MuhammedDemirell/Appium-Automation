package util;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    static AppiumDriver driver;
    static Properties properties;
    static DesiredCapabilities capabilities;

    public static AppiumDriver initializeDriver(String browser){
        properties = ConfigReader.getProperties();
        capabilities = new DesiredCapabilities();
        if(browser.equals("Android")){
            capabilities.setCapability("platformName" , "Android");
            capabilities.setCapability("udid" ,"emulator-5554" );
            capabilities.setCapability("appPackage" , "com.dmall.mfandroid");
            capabilities.setCapability("appActivity", "com.dmall.mfandroid.activity.base.NewSplash");

        }else if(browser.equals("IOS")){
            capabilities.setCapability("platformName" , "IOS");
            capabilities.setCapability("udid" ,"" );
            capabilities.setCapability("appPackage" , "");
            capabilities.setCapability("appCapability" , " ");
        }
        try {
            driver=new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        int impWait=Integer.parseInt(properties.getProperty("implicityWait"));

        driver.manage().timeouts().implicitlyWait(impWait, TimeUnit.SECONDS);

        return getDriver();
    }
    public static AppiumDriver getDriver(){
        return driver;
    }
}
