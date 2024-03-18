package StepDefinitions;

import io.cucumber.java.en.*;

public class CreationFournisseurSteps {
	
	
	
	@Given("cloudbank is open")
	public void cloudbank_is_open() {
	   System.out.println("Inside Step - cloudbank is open");
		
	}

	@And("user goes to the creation provider form")
	public void user_goes_to_the_creation_provider_form() {
		System.out.println("Inside Step - user goes to the creation provider form");
	}

	@When("user fill the form")
	public void user_fill_the_form() {
		System.out.println("Inside Step - user fill the form");
	}

	@And("validate the informations")
	public void validate_the_informations() {
		System.out.println("Inside Step - validate the informations");
	}

	@Then("user can do something else")
	public void user_can_do_something_else() {
		System.out.println("Inside Step - user can do something else");
	}

}
