package radio_button;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class radio_button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	String path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("u_0_m")).sendKeys("sheetal");
	driver.findElement(By.id("u_0_o")).sendKeys("jaswal");
	driver.findElement(By.id("u_0_r")).sendKeys("9805260338");
	driver.findElement(By.id("u_0_w")).sendKeys("kangraman");
	Select select=new Select(driver.findElement(By.id("day")));
	select.selectByIndex(4);
	
	Select select1=new Select(driver.findElement(By.id("month")));
	select1.selectByIndex(4);
	
	Select select2=new Select(driver.findElement(By.id("year")));
	select2.selectByIndex(4);
	String a="2";
List<WebElement> radio=driver.findElements(By.xpath("//input[@type='radio']"));
System.out.println("radio size"+   radio.size());
for(int i=0;i<radio.size();i++)
{
	String value=radio.get(i).getAttribute("value");
	
	//String value=local.getAttribute("value");
	System.out.println(value);
	if(value.equals(a))
	radio.get(i).click();
	driver.quit();

}
	}

}
