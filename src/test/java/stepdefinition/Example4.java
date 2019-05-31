package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Example4 {
	@Given("user loggin to TestMeApp")
	public void user_loggin_to_TestMeApp() {
		System.out.println("User logged into TestMeApp");
	  
	}

	@When("user selects a product as {string}")
	public void user_selects_a_product_as(String string) {

		System.out.println("User selects a product"+string);
	  
	}

	@When("user clicks on add to cart")
	public void user_clicks_on_add_to_cart() {

		System.out.println("User clicked add to product");
	  
	    
	}

	@When("user clicks on cart link")
	public void user_clicks_on_cart_link() {

		System.out.println("User clicks on cart link");
	  
	  
	}

	@When("user provides a quantity as {int}")
	public void user_provides_a_quantity_as(Integer int1) {

		System.out.println("User provides a quantity"+int1);
	  
	}

	@When("user proceed checkout")
	public void user_proceed_checkout() {

		System.out.println("User proceed to checkout");
	  
	  
	}

	@Then("verify the product review and payment page")
	public void verify_the_product_review_and_payment_page() {

		System.out.println("User reviewed the product and payment page");
	  
	
	}

}
