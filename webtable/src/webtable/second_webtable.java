package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class second_webtable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 String path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", path);
		 WebDriver driver =new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 String A="October";
		 driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		 driver.findElement(By.id("datepicker")).click();
		 driver.manage().window().maximize();
	WebElement first=	 driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
	String abc=first.getText();
	System.out.println(abc);
	boolean is=true;
	
	while(true)
	{
	if(abc.equals(A))
	{
break;
	}
	else
	{
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
		Thread.sleep(1000);
		
		
	
	driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[4]/a")).click();
	}
	
}}
}