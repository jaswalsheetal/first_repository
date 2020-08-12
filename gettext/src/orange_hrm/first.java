package orange_hrm;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class first {



// TODO Auto-generated method stub
public void add()
{
System.setProperty("webdriver.chrome.driver","D:\\chromed\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");

driver.findElement(By.id("txtUsername")).sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin12");
driver.findElement(By.id("btnLogin")).submit();
System.out.println(driver.findElement(By.xpath("//*[@id='spanMessage']")).getText());
}

public static void main(String arg[])
{
first obj = new first();
obj.add();
}
}

