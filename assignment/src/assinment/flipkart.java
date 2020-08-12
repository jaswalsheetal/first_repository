package assinment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String path=	System.getProperty("user.dir")+"//driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	WebDriver driver =new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
	 List<WebElement> link=driver.findElements(By.tagName("a"));
	 System.out.println(link.size());
	 for(int i=0;i<link.size();i++)
	 {
		System.out.println( link.get(i).getText());
		System.out.println(link.get(i).getAttribute("href"));
		 
	 }


	}

}
