package facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class next {
public static void main(String arg[])
{
	String path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	WebDriver driver=new ChromeDriver();
	List<WebElement> drop=driver.findElements(By.xpath("//input[@type='radio']"));
	for(int i=0;i<drop.size();i++)
	{
		String test=drop.get(i).getText();
		System.out.println(test);
	}

}

}

