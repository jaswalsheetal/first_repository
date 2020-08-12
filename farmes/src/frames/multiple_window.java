package frames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple_window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
String path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
System.setProperty("webdriver.chrome.driver", path);
WebDriver driver= new ChromeDriver();
driver.get("http://demo.automationtesting.in/Alerts.html");

	}

}
