package flipkart;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class awbdriiiiver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//*[@id='header']/nav/div/div[2]/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id='header']/nav/div/div[2]/ul/li[4]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id='Tabbed']/a/button")).click();
		
		String mainwindow=driver.getWindowHandle();
		System.out.println(mainwindow);
	System.out.println(driver.switchTo().window(mainwindow).getTitle());
		driver.manage().window().maximize();
		Set<String> set=driver.getWindowHandles();
		Iterator<String> itr=set.iterator();
		while(itr.hasNext());
		{
			String childwindow=itr.next();
			if(!mainwindow.equals(childwindow));
			{
				System.out.println(driver.switchTo().window(childwindow).getTitle());
				
			}
		}
				
		driver.close();
		

	}

}
