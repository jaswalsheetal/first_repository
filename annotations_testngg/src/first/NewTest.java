package first;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("beforesuite");
	}
	@BeforeTest()
	public void beforesyite()
	{
	System.out.println("before test");
	
	}
	@BeforeClass
	
		public void classs()
		{
			System.out.println("before class");
		}
	@BeforeMethod
	public void method()
	{
		System.out.println("before method");
	}
  @Test
  public void f() {
	  System.out.println("test case1");
  }
  @AfterMethod
  public void am()
  {
	  System.out.println("after methd");
  }
  @AfterClass
  public void ac()
  {
	  System.out.println("after class");
  }
  @AfterTest
  public void AT()
  {
	  System.out.println("after test");
	  
	  
  }
  @AfterSuite
  public void vc()
  {
	  System.out.println("after suite");
  }
}
