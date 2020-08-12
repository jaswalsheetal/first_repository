package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRM.TESTBASE.TESTBASE;

public class LOGINPAGE extends TESTBASE  {

@FindBy(id="txtUsername")
WebElement uname;
@FindBy(id="txtPassword")
WebElement pass;
@FindBy(id="btnLogin")
WebElement button;
@FindBy(linkText="Forgot your password?")
WebElement forget;

public LOGINPAGE() throws IOException {
	PageFactory.initElements(driver, this);
	// TODO Auto-generated constructor stub
}
	
	public void login()
	{
		uname.sendKeys(prop.getProperty("username"));
		pass.sendKeys(prop.getProperty("password"));
		button.click();
	}
	public String verifytitle()
	{
		
		return driver.getTitle();
	}
}