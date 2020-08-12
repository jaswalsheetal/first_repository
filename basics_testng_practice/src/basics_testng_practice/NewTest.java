package basics_testng_practice;

import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class NewTest {
 WebDriver driver;
 String path;
  @BeforeSuite
  public void beforeSuite() {
	  path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", path);
	   driver=new ChromeDriver();
	   driver.manage().deleteAllCookies();
	   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	   driver.get("http://demo.automationtesting.in/Register.html");
  }

  @AfterSuite
  public void afterSuite() {
	  driver.quit();
  }

}
