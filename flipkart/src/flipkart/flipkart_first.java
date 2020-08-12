package flipkart;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_first {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
String path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
System.setProperty("webdriver.chrome.driver", path);
WebDriver driver= new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();

driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sanitizer");
driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
Thread.sleep(9000);

List<WebElement> count=driver.findElements(By.xpath("//a[@class='_2cLu-l']"));
System.out.println(count.size());
for(int i=0;i<count.size();i++)
{
	String countt=count.get(i).getText();
	System.out.println(countt);
}

}}