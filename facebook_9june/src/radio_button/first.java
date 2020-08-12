package radio_button;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromed\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		List<WebElement> gender=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(gender.size());
		
		for(int i=0;i<gender.size();i++)
		{
			String gend=gender.get(i).getAttribute("name");
		
		System.out.println(gend);
			
	}	
		Select select=new Select(driver.findElement(By.xpath("//*[@id='day']")));
		List<WebElement> date=select.getOptions();
		for(int i=0;i<date.size();i++)
		{
			String down=date.get(i).getText();
			System.out.println(down);
		}
		String A="JAN";
		Select select1=new Select(driver.findElement(By.xpath("//*[@id='month']")));
		List<WebElement> month=select1.getOptions();
				for(int i=0;i<month.size();i++)
				{
					String dwn=month.get(i).getText();
					System.out.println(dwn);
				
				if(A.equalsIgnoreCase(dwn))
				{
					month.get(i).click();
				}
				
			
}}}
