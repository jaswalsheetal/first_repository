package facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook_assingment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", path);
		 WebDriver driver =new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.name("firstname")).sendKeys("sheetal");
		 driver.findElement(By.name("lastname")).sendKeys("jaswal");
		 driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		 driver.findElement(By.name("reg_passwd__")).sendKeys("dfdghdhdhdhdhd");
		 Select s1=new Select( driver.findElement(By.id("day")));
		 s1.selectByIndex(5);
		 List<WebElement> l1=s1.getOptions();
		 for(int i=0;i<l1.size();i++)
		 {
			System.out.println( l1.get(i).getText());
		 }
		 Select s2=new Select( driver.findElement(By.id("month")));
		 s2.selectByIndex(5);
		 List<WebElement> l2=s2.getOptions();
		 for(int i=0;i<l2.size();i++)
		 {
			System.out.println( l2.get(i).getText());
		 }
		 Select s3=new Select( driver.findElement(By.id("year")));
		 s3.selectByIndex(7);
		 
		 List<WebElement> l3=s3.getOptions();
		 for(int i=0;i<l3.size();i++)
		 {
			System.out.println( l3.get(i).getText());
		 }
		
driver.findElement(By.id("u_0_7")).click();
driver.findElement(By.id("u_0_12")).click();
	}

}
