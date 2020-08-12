package com.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import com.HRM.TESTBASE.TESTBASE;
import com.pages.LOGINPAGE;



public class login_test extends TESTBASE {
	LOGINPAGE oo;
	String title;
	public login_test() throws IOException
	{
		super();
	}
@BeforeSuite
public void launch() throws IOException  
{
	initialization();
	oo = new LOGINPAGE();
}
@Test
public void  checktitle()
{
	title=oo.verifytitle();
}
@Test
public void login_details()
{
	oo.login();
}
}