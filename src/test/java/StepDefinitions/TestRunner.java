package StepDefinitions;

import java.io.IOException;
import java.time.Duration;

import managers.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/Features", 
		glue = {"StepDefinitions"},
		tags = "@login or @createProvider",
		monochrome = true,
		plugin = {"pretty", "html:target/HtmlReports/cucumber_reports.html"}
)

public class TestRunner extends AbstractTestNGCucumberTests{
	 
	 WebDriver driver;
	
	@BeforeSuite
	public void setUp() throws IOException {

		WebDriverSingleton.getInstance();
		//driver.get("http://192.168.1.201:5303/cloudbank/index.bank");
		driver.get("http://154.126.170.127:5303/cloudbank/index.bank");

	}
	
	/**@AfterSuite
	   
    public void TeardownTest() { 
        WebDriverSingleton.destroy();
    } **/

}
