package qualification_script;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class qualification_script extends driver {
	
//  @Test
//  //public void login() {
//	  
//	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//	    driver.findElement(By.id("btnLogin")).click();
  //}
  @Test
  public void qualification_skilss()
  {
	  driver.findElement(By.linkText("Admin")).click();
	    driver.findElement(By.id("menu_admin_Qualifications")).click();
	    driver.findElement(By.id("menu_admin_viewSkills")).click();
	    driver.findElement(By.id("btnAdd")).click();
	    driver.findElement(By.id("skill_name")).sendKeys("demsvyeret");
	    driver.findElement(By.id("skill_description")).sendKeys("5 year experience");
	    driver.findElement(By.id("btnSave")).click();
	  
	    driver.findElement(By.xpath("//*[@id='recordsListTable']/tbody/tr[1]/td[1]/input")).click();
	    driver.findElement(By.id("btnDel")).click();
	    System.out.println("entry is deleted");
	    System.out.println("prabh script is done");
	  
	    
  }
 @Test
 public void qualification_education()
 {
	  driver.findElement(By.linkText("Qualifications")).click();
		
		//click on Education
		driver.findElement(By.linkText("Education")).click();
		
		// Add Qualification
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("education_name")).sendKeys("Bca");
		driver.findElement(By.id("btnSave")).click();
		
		// Delete data
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		if(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected()==true)
		{
		System.out.println("successfull");
		}
		driver.findElement(By.id("btnDel")).click(); 
		System.out.println("entry is deleted");
		System.out.println("sanju script done");
 }
 @Test
 public void qualifiaction_licence()
 {
	 driver.findElement(By.id("menu_admin_Qualifications")).click();
	  driver.findElement(By.id("menu_admin_viewLicenses")).click();
	  driver.findElement(By.id("btnAdd")).click();
	  driver.findElement(By.xpath("//input[@name='license[name]']")).sendKeys("sheetal");
	  driver.findElement(By.xpath("//input[@name='btnSave']")).click();
//	String  gettext=driver.findElement(By.xpath("//*[@id='recordsListTable']/tbody/tr[2]/td[2]")).getText();
//	  System.out.println(gettext);
	  driver.findElement(By.xpath("//*[@id='recordsListTable']/tbody/tr[2]/td[1]/input")).click();
	  driver.findElement(By.id("btnDel")).click();
	  System.out.println("name is deleted");
	  System.out.println("sheetal script is done");
	  
	 
 }
 @Test
 public void qualification_language() throws InterruptedException
 {
	 driver.findElement(By.linkText("Qualifications")).click();

	  //Languages
	  driver.findElement(By.linkText("Languages")).click();

	  // Add
	  driver.findElement(By.id("btnAdd")).click();
	  driver.findElement(By.id("language_name")).sendKeys("English");
	  driver.findElement(By.id("language_name")).sendKeys("French");
	  driver.findElement(By.id("btnSave")).click();

	      //Delete
	       driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	  if(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected()==true)
	  {
	  System.out.println("successfull");
	       }
	  driver.findElement(By.id("btnDel")).click();
	       
	  Thread.sleep(3000);
	  System.out.println("ritu script done");
 }
 @Test
 public void qualifiaction_membership()
 {
	 driver.findElement(By.linkText("Qualifications")).click();
		driver.findElement(By.id("menu_admin_membership")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("btnCancel")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("membership_name")).sendKeys("abcdegff");
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectAll']")).click();
		driver.findElement(By.xpath("//*[@id='btnDelete']")).click();
		driver.findElement(By.id("dialogDeleteBtn")).click();
		System.out.println("sahil script");
		
 }
		    
  }


