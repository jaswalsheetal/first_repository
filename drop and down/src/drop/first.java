package drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class first {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	String path=	System.getProperty("user.dir")+"//driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	
	driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
	Actions act=new Actions(driver);
	WebElement first=driver.findElement(By.id("draggable"));
	Thread.sleep(5000);
	WebElement second=driver.findElement(By.id("droptarget"));
	Thread.sleep(5000);
	act.dragAndDrop(first, second).build().perform();
	}

}
