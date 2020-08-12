package btes_testngseond;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class forgetpassword extends NewTest{
	@Test
	public void forget()
	{
		driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b")).click();
				
	}
	@Test
public void qualification()
{
	driver.findElement(By.xpath("//*[@id='menu_admin_Qualifications']")).click();


		  driver.findElement(By.id("menu_admin_viewLicenses")).click();
}
}
