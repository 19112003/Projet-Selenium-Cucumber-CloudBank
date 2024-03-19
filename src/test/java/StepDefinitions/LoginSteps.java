package StepDefinitions;

import managers.WebDriverSingleton;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pages.LoginPage;
public class LoginSteps {
	
	WebDriver driver = WebDriverSingleton.getInstance();
	private LoginPage login;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("Inside Step - user is on login page");
	    
	}

	

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String id, String pswd) throws InterruptedException {
		System.out.println("Inside Step - user enters username and password");
		
		login = new LoginPage(driver);
		
		login.enterId(id);
		login.enterPassword(pswd);
		
		Thread.sleep(1000);
	}
	

	@And("clicks on validate button")
	public void clicks_on_validate_button() {
		System.out.println("Inside Step - clicks on validate button");
		
		//login.clickOnBtnValidation();
	}
	

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("Inside Step - user is navigated to the home page");
	} 

}
