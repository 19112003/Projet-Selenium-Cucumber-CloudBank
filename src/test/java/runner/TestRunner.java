package runner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import manager.WebDriverSingleton;
import utils.EmailWithAttachment;
import utils.GenerateReport;

@CucumberOptions(
		features = "src/test/resources/Features/ProviderForm.feature", 
		glue = {"stepDefinitions"},
		monochrome = true,
		plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
)

public class TestRunner extends AbstractTestNGCucumberTests{
	 
	 WebDriver driver;
		
		@BeforeSuite
		public void setUp() throws IOException {

			driver = WebDriverSingleton.getInstance();
			driver.get("http://192.168.1.201:5303/cloudbank/index.bank");
			//driver.get("http://154.126.170.127:5303/cloudbank/index.bank");

		}
		
		@AfterSuite
		   
	    public void TeardownTest() { 
	      
			// WebDriverSingleton.destroy();
			//GenerateReport.generateReport();
			EmailWithAttachment.sendMail();
			
		}

}
