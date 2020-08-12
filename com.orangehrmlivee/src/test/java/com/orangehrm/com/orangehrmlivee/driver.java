package com.orangehrm.com.orangehrmlivee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;


	public class driver {
		public static WebDriver driver;
	public static 	String path;
	  
	  @BeforeSuite
	  public void beforeSuite() {
		  path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			 driver=new ChromeDriver();
			    driver.manage().deleteAllCookies();
			    driver.get("https://opensource-demo.orangehrmlive.com");
			    driver.manage().window().maximize();
			  
			}
			    
	  }




