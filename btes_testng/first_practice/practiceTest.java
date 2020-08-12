package first_practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

public class practiceTest {
	WebDriver driver;
	  String path;
  @BeforeSuite
  public void beforeSuite() {
	  path=System.getProperty("user.dir")+"driver//chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", path);
	  driver.get("https://opensource-demo.orangehrmlive.com/");
  }

  @AfterSuite
  public void afterSuite() {
	  driver.close();
  }

}
