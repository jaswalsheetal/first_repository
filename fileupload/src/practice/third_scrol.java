package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class third_scrol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
JavascriptExecutor jse=(JavascriptExecutor) driver;
//jse.executeScript("window.scrollTo(0,1500)");
jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
