package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		WebDriver driver = new ChromeDriver();
driver.get("https://mypage.rediff.com/login/dologin");
//driver.findElement(By.id("txtlogin")).sendKeys("sheetal");
driver.findElement(By.xpath("//input[@type='submit']")).click();
Thread.sleep(5000);
Alert al=driver.switchTo().alert();
String abc=al.getText();
System.out.println(abc);
al.accept();
	}

}
