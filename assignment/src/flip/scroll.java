package flip;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String path=	System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
	WebElement ert=	driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div/div/div[2]/a[1]/img"));
	act.doubleClick(ert).build().perform();
	
		//JavascriptExecutor JSE=(JavascriptExecutor) driver;
		//JSE.executeScript("window.scrollTo(0,1500)");
		//WebElement first=driver.findElement(By.xpath("//h2[text()='Best of Electronics']"));
		//JSE.executeScript("window.scrollTo(0,document.body.scrollHeight)");

	}

}
