package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class seveneth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='post-2669']/div[2]/div/div/div[1]/p/iframe")));
		Actions act=new Actions(driver);
		

			
				
		WebElement first=driver.findElement(By.xpath("//*[@id='gallery']/li[1]"));
		
				
		WebElement second=driver.findElement(By.xpath("//*[@id='trash']"));
		WebElement third=driver.findElement(By.xpath("//*[@id='gallery']/li[1]"));
		act.dragAndDrop(first, second).release().build().perform();
	//	WebElement third=driver.findElement(By.xpath("//*[@id='gallery']/li[1]"));
		act.dragAndDrop(third, second).build().perform();

	}

}
