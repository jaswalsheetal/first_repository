package btes_testng_2nd;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;

public class NewTest {
	WebDriver driver;
	String actual="sheetal";
	String gettext;
  @Test(groups={"Smoke"})
  public void homepage() {
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
  }
  @Test(groups={"Sanity"})
  public void admin()
  {
	  driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	  
	 driver.findElement(By.id("menu_admin_Qualifications")).click();
	  driver.findElement(By.id("menu_admin_viewLicenses")).click();
  }
  @Test(groups={"Sanity"})
  public void add()
  {
	  driver.findElement(By.id("btnAdd")).click();
	  driver.findElement(By.xpath("//input[@name='license[name]']")).sendKeys("sheetal");
	  driver.findElement(By.xpath("//input[@name='btnSave']")).click();
	  gettext=driver.findElement(By.xpath("//*[@id='recordsListTable']/tbody/tr[2]/td[2]")).getText();
	  System.out.println(gettext);
	  if(actual.equalsIgnoreCase(gettext))
	  {
	  System.out.println("we are enter the correct name");
	  }
	  
	  else
	  {
		  System.out.println("not entering a correct name");
	  }
	  
  }  
  @Test(groups={"Sanity"})
  public void delete()
  {
	  driver.findElement(By.xpath("//*[@id='recordsListTable']/tbody/tr[2]/td[1]/input")).click();
	  driver.findElement(By.id("btnDel")).click();
	  System.out.println("name is deleted");
  }
  @BeforeSuite(groups={"Smoke"})
  public void beforeSuite() {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromed\\chromedriver.exe");
	  driver=new ChromeDriver();
		 driver.manage().deleteAllCookies();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	// driver.manage().deleteAllCookies();
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
  }

  @AfterSuite
  public void afterSuite() {
  }

}
