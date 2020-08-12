package homepgae;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepage {
	public static WebElement main(WebDriver driver)
	{
		WebElement element =driver.findElement(By.name("q"));
		return element;
	}
	public static WebElement main1(WebDriver driver)
	{
		WebElement element =driver.findElement(By.name("btnK"));
		return element;
	}

}
