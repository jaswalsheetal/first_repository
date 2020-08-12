package basics_testng_practice;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class second extends NewTest {
	@Test
	public void gender()
	{
		driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[1]/input")).click();
	}

}
