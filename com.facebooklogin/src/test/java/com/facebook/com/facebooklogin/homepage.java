package com.facebook.com.facebooklogin;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class homepage extends NewTest{
  @Test
  public void name() {
	  driver.findElement(By.id("u_0_m")).sendKeys("sheetal");
	  driver.findElement(By.id("u_0_o")).sendKeys("jaswal");
	  
  }
  @Test
  public void mobile()
  {
	  driver.findElement(By.id("u_0_r")).sendKeys("9805865297");
  }
  @Test
  public void password()
  {
	  driver.findElement(By.id("password_step_input")).sendKeys("gmail@1223");
  }
  @Test
  public void dob()
  {
	  Select sel=new Select(driver.findElement(By.id("day")));
	  sel.selectByIndex(5);
	  Select sel1=new Select(driver.findElement(By.id("month")));
	  sel1.selectByIndex(7);
	  Select sel2=new Select(driver.findElement(By.id("year")));
	  sel2.selectByIndex(23);
  }
  @Test
  public void gender()
  {
	  driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/form/div[1]/div[6]/span/span[2]/input")).click();
  }
			  @Test
			  public void sigup()
			  {
				  driver.findElement(By.id("u_0_12")).click();;
			  }
	  
  
}