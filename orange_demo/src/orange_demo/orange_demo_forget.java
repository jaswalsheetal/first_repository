package orange_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orange_demo_forget {
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\chromed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin12");
	driver.findElement(By.id("btnLogin")).submit();
	driver.findElement(By.linkText("Forgot your password?")).click();
	String url="https://opensource-demo.orangehrmlive.com/index.php/auth/requestPasswordResetCode";
String currenturl=driver.getCurrentUrl();
if(url.equals(currenturl))
{ 
	System.out.println("we are the right page");
}
else
{
	System.out.println("we are at the wrong page");
}

	}

}
