package flipkart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//*[@id='header']/nav/div/div[2]/ul/li[3]/a")).click();
		List<WebElement> first= driver.findElements(By.xpath("//div[@tabindex='0']"));

		for(int i=0;i<first.size();i++)
		{
		
			System.out.print(first.get(i).getText());
		}
	

	}

}
