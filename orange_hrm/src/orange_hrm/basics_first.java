package orange_hrm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class basics_first {
	WebDriver driver;
	public void disp()
	{
		System.setProperty("webdriver.chrome.driver","D:\\chromed\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/features/");
		String Title=driver.getTitle();
		System.out.println(Title);
		int lentitle=driver.getTitle().length();
		System.out.println(lentitle);
		String currenturl=driver.getCurrentUrl();
		System.out.println(currenturl);
		int len=driver.getCurrentUrl().length();
		System.out.println(len);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#header-navbar > ul.nav.navbar-nav.navbar-right.extended-nav > li:nth-child(1) > a")).click();
		driver.findElement(By.id("Form_submitForm_FirstName")).sendKeys("sheetal jaswal");
		driver.findElement(By.name("LastName")).sendKeys("jaswal");
		driver.findElement(By.name("CompanyName")).sendKeys("bebotechnology");
		driver.findElement(By.name("Contact")).sendKeys("9805260338");
	driver.findElement(By.name("JobTitle")).sendKeys("traine");
	driver.findElement(By.id("Form_submitForm_Email")).sendKeys("jaswalshhetal01@gmail.com");
	driver.findElement(By.id("Form_submitForm_Comment")).sendKeys("nothing");
	Select select = new Select(driver.findElement(By.id("Form_submitForm_NoOfEmployees")));
	select.selectByIndex(3);
	Select country=new Select(driver.findElement(By.id("Form_submitForm_Country")));
	country.selectByValue("India");
	Select state = new Select(driver.findElement(By.id("Form_submitForm_State")));
	state.selectByIndex(3);
	driver.findElement(By.name("action_request")).submit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		basics_first obj = new basics_first();
		obj.disp();
		

	}

}
