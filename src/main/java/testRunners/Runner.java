package testRunners;


import io.appium.java_client.AppiumDriver;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import util.DriverFactory;

@CucumberOptions(
        features = {"src/test/java/Features"},
        glue = {"Stepdefinitions", "util"},
        tags = "",
        plugin = {
                "summary", "pretty", "html:Reports/CucumberReport/Reports.html",
        }

)

public class Runner extends AbstractTestNGCucumberTests {
    static AppiumDriver driver = DriverFactory.getDriver();

}
