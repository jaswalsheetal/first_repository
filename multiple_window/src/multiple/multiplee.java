package multiple;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class multiplee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\chromed\\chromedriver.exe");
	//	WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","C:\\chromed\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='Tabbed']/a/button")).click();
		Set<String> handle=driver.getWindowHandles();
		Iterator<String> it=handle.iterator();
		String parent=it.next();
		System.out.println(parent);
		String child=it.next();
		System.out.println(child);
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		Actions act=new Actions(driver);
		act.click(driver.findElement(By.xpath("//*[@id='container']/header/div/div/div[2]/ul/li[2]/a"))).build().perform();
		act.click(driver.findElement(By.xpath("//*[@id='container']/header/div/div/div[2]/ul/li[2]/ul/li[1]/a"))).build().perform();
		driver.findElement(By.xpath("//*[@id='sidebar-menu']/ul/li[1]")).click();
		
	}

}
