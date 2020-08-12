package driver2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import homepage2.homepage2;

public class driver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
homepage2 obj=new homepage2(driver);
obj.txtuser("9805260338");
obj.txtpass("kangramaan");
obj.login();
	}

}
