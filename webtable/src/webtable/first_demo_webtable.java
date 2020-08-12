package webtable;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class first_demo_webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", path);
		 WebDriver driver =new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.id("btnLogin")).click();
		 driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b")).click();
	List<WebElement> lsit= driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr[1]/td"));
	for(int i=0;i<lsit.size();i++) 
	{
		System.out.print(lsit.get(i).getText()+" ");
	}
	
	System.out.println();
		
		
	
	}
	

}
