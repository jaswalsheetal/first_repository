package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook_demo {
	String path;
	WebDriver driver;
	public void disp()
	{
		path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @id='u_0_m']")).sendKeys("sheetal");
		driver.findElement(By.cssSelector("input#u_0_o")).sendKeys("jaswal");
		driver.findElement(By.id("u_0_r")).sendKeys("9805865298");
		driver.findElement(By.id("u_0_w")).sendKeys("sheetal@174");
		Select select=new Select(driver.findElement(By.id("day")));
		select.selectByValue("14");
		Select select1=new Select(driver.findElement(By.id("month")));
		select1.selectByIndex(9);
		Select select2=new Select(driver.findElement(By.id("year")));
		select2.selectByVisibleText("2000");
		driver.findElement(By.id("u_0_7")).click();
		driver.findElement(By.id("u_0_13")).click();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		facebook_demo obj = new facebook_demo();
		obj.disp();
	}

}
