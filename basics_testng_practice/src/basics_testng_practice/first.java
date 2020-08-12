package basics_testng_practice;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class first extends NewTest {
	@Test
	public void name()
	{
		driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input")).sendKeys("sheetal");
		driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[2]/input")).sendKeys("jaswal");
	}
@Test
public void address()
{
	driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[2]/div/textarea")).sendKeys("una ");
}
@Test
public void email()
{
	driver.findElement(By.xpath("//*[@id='eid']/input")).sendKeys("jaswalshhetal01@gmail.com");
	
}
@Test
public void phone()
{
	driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[4]/div/input")).sendKeys("8288054185");
}
}
