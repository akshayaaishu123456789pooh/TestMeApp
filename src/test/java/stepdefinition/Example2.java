package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Example2 {
	@Given("user login")
	public void user_login() {
		System.out.println("user logged in");
	    
	}

	@When("user selects products using category")
	public void user_selects_products_using_category() {
		System.out.println("user selected a products using category");
	}

	@Then("verify the produt list")
	public void verify_the_produt_list() {
		System.out.println("user verified the product list");  
	}

	@When("user selects products using sub-category")
	public void user_selects_products_using_sub_category() {
		
System.out.println("user selected products using sub-category");
	}

	@When("user selects product using product search")
	public void user_selects_product_using_product_search() {
		
		System.out.println("user selected products using product search");
	}

	@Then("verify the produt list And closes the application")
	public void verify_the_produt_list_And_closes_the_application() {
		System.out.println("user verified the product list");
	   
	}

}
