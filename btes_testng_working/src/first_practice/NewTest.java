package first_practice;

import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;

public class NewTest {
   WebDriver driver;
  String path;
  @BeforeSuite
  public void beforeSuite() {
	  path=System.getProperty("user.dir")+"driver//chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", path);
	driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  
  }

  @AfterSuite
  public void afterSuite() {
	  driver.close();
  }

}
