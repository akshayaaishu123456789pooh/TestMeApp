package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Example5 {
	WebDriver driver;
	@Given("user launching TestMeApp")
	public void user_launching_TestMeApp() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    driver.findElement(By.linkText("SignIn")).click();
	  	}

	@When("user enters username as {string} And enter password as {string}")
	public void user_enters_username_as_And_enter_password_as(String un, String psd) {
		LoginPageObjects lp=new LoginPageObjects(driver);
		lp.un.sendKeys(un);
		lp.psd.sendKeys(psd);
	 
	}

	@Then("clicks ok")
	public void clicks_ok() {
		LoginPageObjects lp=new LoginPageObjects(driver);
		lp.ok.click(); 
	   
	}

	@Then("verify login result")
	public void verify_login_result() {
	 
	}


}
