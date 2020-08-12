package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import homepage.homepage;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\chromed\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		// driver.manage().deleteAllCookies();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		// PageFactory.initElements(driver, homepage.class);
		 homepage obj=new homepage(driver);
obj.username.sendKeys("Admin");
obj.password.sendKeys("admin123");
obj.login.click();
	}

}
