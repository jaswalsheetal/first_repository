package soft_assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class class_second_soft {
	WebDriver driver;
	String path;
  @Test
  public void test() {
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
	  SoftAssert ast=new SoftAssert();
	  ast.assertEquals(driver.getTitle(), "OrangeHRM");
	  ast.assertAll();
	  System.out.println("landing on a right page");
  }
  @BeforeSuite
  public void beforeSuite() {
	  path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", path);
	  driver=new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	 
	  driver.manage().window().maximize();
	
  }

}



