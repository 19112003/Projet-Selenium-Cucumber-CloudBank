package StepDefinitions;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pages.BoutonsNavigation;
import pages.CreationFournisseurPage;

public class CreationFournisseurSteps {
	
	WebDriver driver;
	CreationFournisseurPage elements = new CreationFournisseurPage(driver);
	
	
				/**Create Provider**/
	
	@Given("cloudbank is open")
	public void cloudbank_is_open() {
	   System.out.println("Inside Step - cloudbank is open");
		
	}

	@And("user goes to the creation provider form")
	public void user_goes_to_the_creation_provider_form() {
		
		BoutonsNavigation btnNav = new BoutonsNavigation(driver);
		
		System.out.println("Inside Step - user goes to the creation provider form");
		System.out.println("Chargement des selecteurs");
        
        //Administration
        try {
            btnNav.clickOnBtnAdministration(); 

        } catch (Exception e) {
            System.out.println("Administration n'a pas été trouvé.");
        }
        
      //Créations diverses
        try {
        	btnNav.clickOnBtnAutresCreations();

        } catch (Exception e) {
            System.out.println("Creation diverse n'a pas été trouvé.");
        }
        
        
        //Création fournisseur 
        try {
        	btnNav.clickOnBtnCreateProvider();

        } catch (Exception e) {
            System.out.println("Creation fournisseur n'a pas été trouvé.");
        }
        
	}
	

	@When("user fill the form")
	public void user_fill_the_form() throws InterruptedException {
		System.out.println("Inside Step - user fill the form");
		
		//Remplissage du nom
		elements.enterNom("MAEVA SARL");
		
		//Remplissage du pays
		elements.enterPays("Cameroun");
		elements.getPays().sendKeys(Keys.ENTER);
		
		//Remplissage de la ville
		elements.enterVille("YAOUNDE VI");
		
		//Remplissage du telephone
		elements.enterTelephone("699876906");
		
		//Remplissage du adresse
		elements.enterAdresse("vallee montee jouvence pres de l'ecole les Champions");
		
		//Remplissage du capital
		elements.enterCapital("50000000");
		
		//Remplissage du BP
		elements.enterBp("237");
		
		//Remplissage de la forme sociale
		elements.enterForme_sociale("etude avoca");
		Thread.sleep(1000);
		elements.getForme_sociale().sendKeys(Keys.TAB);
		
		//Remplissage de la categorie
		elements.enterCategorie("autres san");
		Thread.sleep(1000);
		elements.getCategorie().sendKeys(Keys.TAB);
		
				/**Ajout de compte**/
		 //Filtrage des comptes
		elements.enterCompte("*");
		elements.getCompte().sendKeys(Keys.TAB);
		
		elements.enterFiltre("401000027");
		Thread.sleep(5000);
		elements.getFiltre().sendKeys(Keys.TAB);
		elements.clickOnBtnValidationCompte();
		
				/**Ajout de dirigeant**/
		
		elements.clickOnBtnDirigeant1();
		
		//Element formulaire informations dirigeant 1
		elements.enterFirstname("MAEVA");
		elements.enterLastname("KOUOMO");
		
		//Valider dirigeant1   
		elements.clickOnBtnValidationDirigeant1();
		Thread.sleep(1000);
		
	}

	

	@And("validate the informations")
	public void validate_the_informations() throws InterruptedException {
		System.out.println("Inside Step - validate the informations");
		
		elements.clickOnBtnValidationForm();
		Thread.sleep(2000);
		elements.clickOnBtnOK();
		
	}
	
	
	@Then("user returns to the empty form")
	public void user_returns_to_the_empty_form() {
		System.out.println("Inside Step - user returns to the empty form");
	}
	
	
				/**Modify provider**/

	@When("user searches for the provider to modify")
	public void user_searches_for_the_provider_to_modify() throws InterruptedException {
		System.out.println("Inside Step - user searches for the provider to modify");
	
		//Aller sur la page de modification
		elements.clickOnBtnModificationForm();
		
		//Recherche du Fournisseur à modifier
		elements.enterCode("*");
		elements.getCode().sendKeys(Keys.ENTER);
	
		elements.enterFiltre("0003");
		Thread.sleep(3000);
		elements.getFiltre().sendKeys(Keys.TAB);
		elements.clickOnBtnValidationCompte();
		Thread.sleep(2000);
	}
	
	
	@And("modify the informations")
	public void modify_the_informations() throws InterruptedException {
		System.out.println("Inside Step - modify the informations");
		
		elements.getTelephone().clear();
		elements.enterTelephone("693490553");
		
		Thread.sleep(1000);
		
		elements.getCapital().clear();
		elements.enterCapital("60000000");
		
	}
	
	
	@And("save the informations")
	public void save_the_informations() throws InterruptedException {
		System.out.println("Inside Step - save the informations");
		
		elements.clickOnBtnSauvegarder();;
		Thread.sleep(2000);
		elements.clickOnBtnOK();
		
	}
	
	
				/**Duplicate provider**/
	
	@When("user searches for the provider to duplicate")
	public void user_searches_for_the_provider_to_duplicate() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
				/**View provider**/
	
	@When("user searches for the provider to view")
	public void user_searches_for_the_provider_to_view() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}	
	
	@And("view the informations of the provider")
	public void view_the_informations_of_the_provider() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
			/**Delete provider**/
	
	@When("user searches for the provider to delete")
	public void user_searches_for_the_provider_to_delete() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@And("validate the deletion of the provider")
	public void validate_the_deletion_of_the_provider() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	

}
