package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div/div[2]/div[1]/input[2]")).sendKeys("D:\\20aprilbtes\\TEST4.class");
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div/div[2]/div[1]/input[1]")).sendKeys("D:\\string_javatpoint\\CHAR_STRING.class");
		driver.findElement(By.xpath("//*[@id='ng-app']/body/div/div[2]/div[1]/input[1]")).sendKeys("D:\\armstrong\\TEST2.java");

	}

}
