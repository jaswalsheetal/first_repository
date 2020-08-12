package STEP_DEFINATION;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import cucumber.api.java.en.Then;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;

public class steplogin {
	WebDriver driver;
	@Given("^user is on login page$")
	public void user_is_on_login_page(){
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
  }

@Then("user enter {string} in username textfeild and {string}")
public void user_enter_username_in_username_textfeild_and_password(String user,String pass) {

  
	  driver.findElement(By.id("txtUsername")).sendKeys(user);
	  driver.findElement(By.id("txtPassword")).sendKeys(pass);
	  driver.findElement(By.id("btnLogin")).click();

  }



  
	   


@Then("user enter password in password textfeild")
public void user_enter_password_in_password_textfeild() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("user clicks on Login button")
public void user_clicks_on_Login_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("user is on Homepage")
public void user_is_on_Homepage() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}




}