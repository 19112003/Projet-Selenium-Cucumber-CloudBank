package runner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import manager.WebDriverSingleton;

@CucumberOptions(
		features = "src/test/resources/Features", 
		glue = {"StepDefinitions"},
		tags = "@login",
		monochrome = true,
		plugin = {"json:target/cucumber.json"}
)

public class TestRunner extends AbstractTestNGCucumberTests{
	 
	 WebDriver driver;
		
		@BeforeSuite
		public void setUp() throws IOException {

			driver = WebDriverSingleton.getInstance();
			driver.get("http://192.168.1.201:5303/cloudbank/index.bank");
			//driver.get("http://154.126.170.127:5303/cloudbank/index.bank");

		}
		
		/**@AfterSuite
		   
	    public void TeardownTest() { 
	        WebDriverSingleton.destroy();
	    } **/

}
