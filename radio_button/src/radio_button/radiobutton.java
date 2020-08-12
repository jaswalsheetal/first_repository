package radio_button;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\chromed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	String path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
	//	System.setProperty("webdriver.chrome.driver", path);
	//	WebDriver driver=new ChromeDriver();
		List<WebElement> drop=driver.findElements(By.xpath("//input[@type='radio']"));
		for(int i=0;i<drop.size();i++)
		{
			String test=drop.get(i).getText();
			System.out.println(test);
		}

	}

}
