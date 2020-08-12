package STEP_DEFINATION;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loggggggin {
	public static WebDriver driver;
	@Given("user is onn login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	    
	}
	@Then("user enter {string} in username feild and {string} in password feild")
	public void user_enter_in_username_feild_and_in_password_feild(String uname, String pass) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
	    
	}

	@Then("clicks on the login button")
	public void clicks_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	  driver.findElement(By.id("btnLogin")).click();
	  System.out.println("at homepage");
	}

}
