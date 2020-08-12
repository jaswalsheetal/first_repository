package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import Pages.homepage;
public class driver_class {
	public static void main(String arg[])
	{@FindBy()
		System.setProperty("webdriver.chrome.driver", "C:\\chromed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();;
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		homepage.t
		
}

}
