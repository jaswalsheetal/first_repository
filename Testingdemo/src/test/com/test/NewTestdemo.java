package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTestdemo {
  @Test
  public void f() {
	  System.out.println("test");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("hf");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("ddd");
	  
	  
  }

}
