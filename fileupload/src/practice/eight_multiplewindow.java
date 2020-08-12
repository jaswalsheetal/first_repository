package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class eight_multiplewindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.popuptest.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/font[1]/b/a")).click();
		Thread.sleep(5000);
		Set<String> handler=driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		String parentid=it.next();
		System.out.println("parent window is:"+parentid);
		String childid=it.next();
		System.out.println("child id:"+childid);
		String ch=it.next();
		System.out.println("sheetal:"+ch);
		driver.switchTo().window(ch);
		
		System.out.println(driver.getTitle());
		
		

	}

}
