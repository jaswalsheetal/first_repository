package facebook;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class dropdown_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
