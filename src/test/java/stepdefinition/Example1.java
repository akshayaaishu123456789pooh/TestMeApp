package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Example1 {
	WebDriver driver;
	@Given("user launch chrome browser And enters an TestMeApp url")
	public void user_launch_chrome_browser_And_enters_an_TestMeApp_url() {
	    System.out.println("user launched chrome browser and navigates to TestMeApp");
	    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://newtours.demoaut.com");
	}

	@When("user enters a valid username in a username field")
	public void user_enters_a_valid_username_in_a_username_field() {
		System.out.println("username entered is displayed");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
	    
	}

	@When("user enters a valid password in a password field")
	public void user_enters_a_valid_password_in_a_password_field() {
		System.out.println("password entered is displayed");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mercury");
	    
	}

	@When("user clicks on OK button")
	public void user_clicks_on_OK_button() {
		System.out.println("user clicked ok button");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
	    
	}

	@Then("user verify the result")
	public void user_verify_the_result() {
		System.out.println("user verified the result");
	}

}
