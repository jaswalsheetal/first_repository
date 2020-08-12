package dynamic_path;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class first_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//WebDriver driver=new ChromeDriver();
		
	//	System.out.print(driver.findElement(By.xpath("//input[@type='radio']")).getText());
		List<WebElement> drop=driver.findElements(By.className("_58mt"));
		for(int i=0;i<drop.size();i++)
		{
System.out.print(driver.findElement(By.xpath("//input[@type='radio']")).getText());
			System.out.println(drop.get(i).getText());
			//System.out.println(test);
			System.out.println(drop.get(i).getAttribute("value"));
		}
driver.close();
	}

	

	}


