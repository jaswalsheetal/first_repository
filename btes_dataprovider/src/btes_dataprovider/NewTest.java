package btes_dataprovider;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class NewTest {
	WebDriver driver;
	String path;
	@DataProvider(name="loginn")
	public Object[][] demo()
	{
		Object[][] userdata=new Object[3][2];
		
		userdata[0][0]="admin2";
		userdata[0][1]="admin123";
		
		userdata[1][0]="adminr";
		userdata[1][1]="admin123";
		
		userdata[2][0]="Admin";
		userdata[2][1]="admin123";
		return userdata;
	}
  @Test(dataProvider="loginn")
  public void login(String username,String password) throws InterruptedException {
	  driver.findElement(By.id("txtUsername")).sendKeys(username);
	  driver.findElement(By.id("txtPassword")).sendKeys(password);
	  driver.findElement(By.id("btnLogin")).click();
	 // driver.navigate().back();
	  System.out.println(driver.getTitle());
	 
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

  @AfterSuite
  public void afterSuite() {
  }  

}
