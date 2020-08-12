package annitatation_facbook;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  WebDriver driver;
  @BeforeMethod
  public void beforeMethod() {
	 System.out.println("before method");
	  
  }
  @Test
  public void f() {
	  System.out.println("first test case");
	  driver.findElement(By.id("email")).sendKeys("9805260338");
	  System.out.println("first");
	  
	 
	  
	  
  }
  @Test
  public void f2() throws InterruptedException {
	  System.out.println("second test case test case");
	  driver.findElement(By.id("pass")).sendKeys("kangramaan");
	  System.out.println("second");
	  
	  driver.findElement(By.id("u_0_b")).click();
	  
	 
	  
	  
  }
  @Test
  public void f23() throws InterruptedException {
	  System.out.println("test2,searching a alement");
	  driver.findElement(By.xpath("//input[@type='search']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@type='search']")).sendKeys("gaurav patial");
	  driver.findElement(By.xpath("//*[@id='gaurav patial']/div/a/div/div[2]/span")).click();
	  
			  
  }
	
	 
	  
	  
  

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test");
	  System.out.println("path given");
	  System.setProperty("webdriver.chrome.driver", "C:\\chromed\\chromedriver.exe");
	   driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	 
	 
	  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite");
  }

}
