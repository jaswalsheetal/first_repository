package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://tus.io/demo.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("js-file-input")).sendKeys("C:\\Users\\asus\\Desktop\\Vaishnavi\\20200302_175325.jpg");
	

	}

}
