package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Example3 {
	WebDriver driver;
	@Given("user navigates to TestMeApp")
	public void user_navigates_to_TestMeApp() {
		 System.out.println("user launched chrome browser and navigates to TestMeApp");
		    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		    driver=new ChromeDriver();
		    driver.get("http://newtours.demoaut.com");
	   
	}

	@When("user enters username And password")
	public void user_enters_username_And_password() {
		System.out.println("username entered is displayed");
		LoginPageObjects.un.sendKeys("mercury");
		
		System.out.println("password entered is displayed");
		LoginPageObjects.un.sendKeys("mercury");
	    
	}

	@Then("performs login")
	public void performs_login() {
		System.out.println("user clicked ok button");
		LoginPageObjects.un.click();
	    
	}


}
