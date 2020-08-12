package radio_button;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String path=	System.getProperty("user.dir")+"//driver//chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.alprusams.com/");
	driver.findElement(By.id("u_0_m")).sendKeys("sheetal");
	driver.findElement(By.id("u_0_o")).sendKeys("jaswal");
	driver.findElement(By.id("u_0_r")).sendKeys("98052603dg");
	driver.findElement(By.id("u_0_w")).sendKeys("*********");
	Select select=new Select(driver.findElement(By.id("day")));
	List<WebElement> drop=select.getOptions();
	for(int i=0;i<drop.size();i++)
	{
		String down=drop.get(i).getText();
		System.out.println(down);
		String mont="3";
		if(down.equalsIgnoreCase(mont))
		{
			drop.get(i).click();
		}
		
	}
	
	Select select1=new Select(driver.findElement(By.id("month")));
	List<WebElement> month=select1.getOptions();
	for(int i=0;i<month.size();i++)
	{
		String drop1=month.get(i).getText();
		String mon="jan";
		if(drop1.equalsIgnoreCase(mon))
		{
			month.get(i).click();
		}
		
		
	}
Select select2=new Select(driver.findElement(By.id("year")));
List<WebElement> year=select2.getOptions();
for(int i=0;i<year.size();i++)
{
	String drop3=year.get(i).getText();
	System.out.println(drop3);
	String yeaar="1995";
	if(yeaar.equalsIgnoreCase(drop3))
	{
		year.get(i).click();
	}
	
	

}
List<WebElement> gender=driver.findElements(By.xpath("//input[@type='radio']"));
for(int i=0;i<gender.size();i++)
{
	String allgender=gender.get(i).getAttribute("value");
	System.out.println(allgender);
	String sex="1";
	if(allgender.equalsIgnoreCase(sex))
	{
	gender.get(i).click();
	}
driver.findElement(By.xpath("//*[@id='reg_pages_msg']/a")).click();
driver.manage().deleteAllCookies();
driver.navigate().back();
driver.close();
}

	}


}
