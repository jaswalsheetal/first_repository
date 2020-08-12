package practice;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;
import com.tigervnc.vncviewer.FileUtils;

public class ninth {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='header']/nav/div/div[2]/ul/li[4]/a")).click();
		
		driver.findElement(By.xpath("//*[@id='header']/nav/div/div[2]/ul/li[4]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='Multiple']/button")).click();
		Thread.sleep(5000);
		Set<String> handler=driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		String parent=it.next();
		System.out.println(parent);
		Thread.sleep(5000);
		String child=it.next();
		System.out.println(child);
		driver.switchTo().window(child);
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Home")));
		TakesScreenshot ts=(TakesScreenshot) driver;
	File source=	ts.getScreenshotAs(OutputType.FILE);
	Files.copy(source,new File("./SC/facebook.png"));


	}

}
