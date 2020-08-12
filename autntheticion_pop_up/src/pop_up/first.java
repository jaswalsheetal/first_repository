package pop_up;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	@BeforeSuite
		String path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.get("http://admn:admin@the-internet.herokuapp.com/basic_auth");
		

	}

}
