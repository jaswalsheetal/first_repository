package drop_down_9july;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class drop {

	public static void main(String[] args) {
		// 
		System.setProperty("webdriver.gecko.driver","C:\\chromed\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		//Actions act=new Actions(driver);
		driver.switchTo().frame(2);
		Actions act=new Actions(driver);
	WebElement A=	driver.findElement(By.xpath("//*[@id='gallery']/li[1]/img"));
	WebElement B=  driver.findElement(By.xpath("//*[@id='trash']"));
	act.dragAndDrop(A, B).build().perform();
	WebElement C=driver.findElement(By.xpath("//*[@id='gallery']/li[2]/img"));
	WebElement D=  driver.findElement(By.xpath("//*[@id='trash']"));
	act.dragAndDrop(C, D).build().perform();

	}

}
