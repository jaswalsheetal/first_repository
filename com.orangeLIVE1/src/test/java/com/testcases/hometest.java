package com.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.HRM.TESTBASE.TESTBASE;
import com.pages.LOGINPAGE;

import java.io.IOException;

import org.testng.annotations.Test;

import HOMEPAGE.HOMEPAGEE;

public class hometest extends login_test {
HOMEPAGEE ooo;
	public hometest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
@BeforeClass
public void ty() throws IOException

{
	ooo=new HOMEPAGEE();
}
	
@Test
	public void user()
	{
		ooo.homes();
	}

}