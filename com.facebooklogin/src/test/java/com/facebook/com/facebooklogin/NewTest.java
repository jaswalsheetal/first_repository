package com.facebook.com.facebooklogin;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class NewTest
{
public static WebDriver driver;

  @BeforeSuite
  public void beforeSuite() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
  }

}
