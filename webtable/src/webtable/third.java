package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class third {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 String path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", path);
		 WebDriver driver =new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.get("https://cosmocode.io/automation-practice-webtable/");
		 driver.manage().window().maximize();
		Thread.sleep(5000);
	List<WebElement> li=driver.findElements(By.xpath("//table[@id='countries']/tbody/tr"));
	System.out.println(li.size());
	for(int i=0;i<li.size();i++)
	{
	String yu=	li.get(i).getText();
	System.out.println(yu);
		
	}
	}

}
