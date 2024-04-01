package stepDefinitions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import manager.WebDriverSingleton;
import pages.BoutonsNavigation;
import pages.CreateCompteGestionPage;

public class CreationCompteGestionSteps {
	
	WebDriver driver =  WebDriverSingleton.getInstance();
	CreateCompteGestionPage element = new CreateCompteGestionPage(driver);
	BoutonsNavigation btnNav = new BoutonsNavigation(driver);

			
				/**Create Management Account**/
	
	@And("user goes to the create management account form")
	public void user_goes_to_the_create_management_account_form() {
		
		System.out.println("Inside Step - user goes to the create management account form");
		System.out.println("Chargement des selecteurs");
        
        //Administration
        try {
            btnNav.clickOnBtnAdministration(); 

        } catch (Exception e) {
            System.out.println("Administration n'a pas été trouvé.");
        }
        
        //Gestion de nomenclature
        try {
        	btnNav.clickOnBtnGestionNomenclatures();

        } catch (Exception e) {
            System.out.println("Gestion de nomenclatures n'a pas été trouvé.");
        }
        
        
        //Compte de gestion 
        try {
        	btnNav.clickOnBtnCompteDeGestion();

        } catch (Exception e) {
            System.out.println("Compte de gestion n'a pas été trouvé.");
        }
        
         // Bref temps d'attente permettant aux éléments d'être chargés sur la page
		 try {
		     Thread.sleep(10000);
		 } catch (InterruptedException e) {
		     e.printStackTrace();
		 } 
		 
	}
	
	
	
	@When("user fill the management account form")
	public void user_fill_the_management_account_form() throws InterruptedException {
		 System.out.println("Inside Step - user fill the management account form");
		 
		 element.enterChapitre("401000");
		 element.getChapitre().sendKeys(Keys.TAB);
		 
		 Thread.sleep(2000);
		 
		 element.getCompte().sendKeys(Keys.TAB);
		 
		 element.enterIntitule("MAEVA SARL");
	}
	
	
	
	@And("validate the account informations")
	public void validate_the_informations() throws InterruptedException {
		System.out.println("Inside Step - validate the account informations");
		
		element.clickOnBtnValidation();
		Thread.sleep(2000);
		btnNav.clickOnBtnOK();
		
	}
	

	@Then("user exits the form")
	public void user_exits_the_form() {
		 System.out.println("Inside Step - user exits the form");
	}
	
	
	
	
	
	
	
	
}
