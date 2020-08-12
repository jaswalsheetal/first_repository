package right_click;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class right_click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path=	System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://gojs.net/latest/samples/htmldragdrop.html");
		
		
		Set <Cookie> cookies=driver.manage().getCookies();
		System.out.println("cookies is:"+cookies.size());
		for(int i=0;i<cookies.size();i++)
		{
			System.out.println(cookies.getClass().getName()+":: "+cookies.getClass().getTypeName());
		}
		

	}

}
