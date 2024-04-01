package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import manager.WebDriverSingleton;
import pages.BoutonsNavigation;
import pages.LoginPage;
public class LoginSteps {
	
	WebDriver driver =  WebDriverSingleton.getInstance();
	LoginPage login;
	BoutonsNavigation btnNav = new BoutonsNavigation(driver);
	
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
		
		login.clickOnBtnValidation();
		
//		//Si une connexion deja active
//		if(driver.getPageSource().contains("Utilisateur déjà connecté sur le systeme.")) {
//			
//		   System.out.println("Utilisateur déjà connecté sur le systeme.");
//		   btnNav.clickOnBtnOuiExitForm();
//		   
//		   //Bref temps d'attente permettant aux éléments d'être chargés sur la page
//		   Thread.sleep(3500);
//		  
//		   //Reconnexion
//		   login.enterId(id);
//		   login.enterPassword(pswd);
//			
//		   Thread.sleep(1000);
//  	}
	}
	

	@Then("user is navigated to the home page and logout")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
		
		System.out.println("Inside Step - user is navigated to the home page");
		Thread.sleep(2000);
		
		try {
            btnNav.clickOnBtnLogout(); 

        } catch (Exception e) {
            System.out.println("Bouton logout n'a pas été trouvé.");
        }
	} 

}
