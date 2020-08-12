package radio_button;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class second_chance {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
	String path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String a="1";
	String b="2";
	
	List<WebElement> radio=driver.findElements(By.xpath("//input[@type='radio']"));
	for(int i=0;i<radio.size();i++)
	{
		 String vlue=radio.get(i).getAttribute("name");
		//String value=local.getAttribute("value");
		System.out.println(vlue);
		if(vlue.equals(a))
		{
			radio.get(i).click();
			Thread.sleep(3000);
		}
		
		else if(vlue.equals(b))
		{
			radio.get(i).click();
			Thread.sleep(2000);
		}
	
	
	}
	

	}

}
