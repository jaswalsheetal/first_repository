package com.orangehrm.com.orangehrmlivee;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class homepage extends driver{
	@Test
	public void login() {	
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");		  
  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
}
	@Test
	public void User() {
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Admin");
		Select user_role = new Select(driver.findElement(By.id("searchSystemUser_userType")));
		user_role.selectByVisibleText("Admin");
		Select status = new Select(driver.findElement(By.id("searchSystemUser_status")));
		status.selectByVisibleText("Enabled");
		driver.findElement(By.id("searchBtn")).click();
		driver.findElement(By.id("resetBtn")).click();
		}
	@Test
	public void Job_Title() {
		// click on Admin linkText
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		// click on Job linkText
		driver.findElement(By.linkText("Job")).click();
		// click on JobTitles linkText
		driver.findElement(By.linkText("Job Titles")).click();
		// click on Add Button
		driver.findElement(By.id("btnAdd")).click();
		// click on Cancel Button
		driver.findElement(By.id("btnCancel")).click();
		// Again click on Add Button
		driver.findElement(By.id("btnAdd")).click();
		// Entering details of job title
		driver.findElement(By.id("jobTitle_jobTitle")).sendKeys("Anillll bansal");
		// Entering details of jobDescription
		driver.findElement(By.id("jobTitle_jobDescription")).sendKeys(
		" System quality by identifying issues and common patterns, and developing standard operating procedures  improvement, making designing and implementing systems");
		/*
		* // Add the file WebElement UploadElement =
		* driver.findElement(By.id("jobTitle_jobSpec"));
		* UploadElement.sendKeys("uploadElement.sendKeys(E:\\newhtml.html)");
		* driver.findElement(By.id("file")).click();
		* driver.findElement(By.name("jobTitle[jobSpec]")).click();
		*/

		// Entering Note
		driver.findElement(By.id("jobTitle_note")).sendKeys("Devlopers always giver our Best");
		// Click on Save Button
		driver.findElement(By.id("btnSave")).click();

		// Tick
		// driver.findElement(By.id("ohrmList_chkSelectAll")).click();
		// click randomly
		driver.findElement(By.linkText("CEO")).click();
		// Edit the existing information
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("jobTitle_jobTitle")).sendKeys("gys hsd");
		// Entering details of jobDescription
		// driver.findElement(By.id("jobTitle_jobDescription")).sendKeys( "Job
		// description by Manish Verma");

		// Entering Note
		// driver.findElement(By.id("jobTitle_note")).sendKeys("do good");

		// driver.findElement(By.id("btnSave")).click();
		// driver.findElement(By.id("jobTitle_note")).clear();
		// driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("btnCancel")).click();
		driver.findElement(By.id("ohrmList_chkSelectAll")).click();
		driver.findElement(By.id("btnDelete")).click();
		driver.findElement(By.xpath("//*[@id=\"deleteConfModal\"]/div[3]/input[2]")).click();

		}
	@Test
	public void Employment_Status() {
		driver.findElement(By.id("menu_admin_Job")).click();
		driver.findElement(By.id("menu_admin_employmentStatus")).click();

		driver.findElement(By.name("btnAdd")).click();
		// driver.findElement(By.id("btnCancel")).click();
		driver.findElement(By.name("empStatus[name]")).sendKeys("atul");
		driver.findElement(By.id("btnCancel")).click();

		driver.findElement(By.id("ohrmList_chkSelectAll")).click();
		driver.findElement(By.id("btnDelete")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/div[3]/input[2]")).click();
		driver.findElement(By.id("ohrmList_chkSelectAll")).click();

}
	@Test
	public void Job_Categories() {
		driver.findElement(By.id("menu_admin_Job")).click();
		driver.findElement(By.linkText("Job Categories")).click();
		driver.findElement(By.name("btnAdd")).click();
		driver.findElement(By.id("btnCancel")).click();
		// driver.findElement(By.name("jobCategory[name]")).sendKeys("SDET");
		// driver.findElement(By.name("btnSave")).click();

		driver.findElement(By.id("ohrmList_chkSelectAll")).click();
		// driver.findElement(By.id("ohrmList_chkSelectRecord_11")).click();
		driver.findElement(By.id("btnDelete")).click();
		driver.findElement(By.xpath("//*[@id=\'deleteConfModal\']/div[3]/input[2]")).click();
		// driver.findElement(By.className("btn")).click();
		driver.findElement(By.id("ohrmList_chkSelectAll")).click();
}
	@Test
	public void Workshift() {
		driver.findElement(By.linkText("Admin")).click();
		// click on Job
		driver.findElement(By.linkText("Job")).click();
		// click on WorkShift
		driver.findElement(By.linkText("Work Shifts")).click();
		// click on add button
		driver.findElement(By.name("btnAdd")).click();
		// Enter Shift name
		driver.findElement(By.id("workShift_name")).sendKeys("night072");
		// Enter Work Hours
		driver.findElement(By.name("workShift[workHours][from]")).sendKeys("08:00");
		driver.findElement(By.name("workShift[workHours][to]")).sendKeys("11:00");
		// Click on Available employee
		driver.findElement(By.id("workShift_availableEmp")).sendKeys("Test Dinusha");
		// click on add button
		driver.findElement(By.linkText("Add >>")).click();
		// click on save button
		driver.findElement(By.id("btnSave")).click();
		// click on check box...
		driver.findElement(By.id("ohrmList_chkSelectAll")).click();
		// driver.findElement(By.id("btnDelete")).click();
		// driver.findElement(By.id("btnCancel")).click();
		// Delete on Workshift..
		driver.findElement(By.id("btnDelete")).click();
		driver.findElement(By.xpath("//*[@id=\"deleteConfModal\"]/div[3]/input[2]")).click();
		}
	@Test

	public void Organization_Structure() {
	driver.findElement(By.linkText("Organization")).click();
	driver.findElement(By.linkText("Structure")).click();
	driver.findElement(By.id("btnEdit")).click();

	// driver.findElement(By.linkText("OrangeHRM (Pvt) Ltd")).click();
	driver.findElement(By.className("addButton")).click();
	driver.findElement(By.id("txtUnit_Id")).sendKeys("xyz");
	driver.findElement(By.name("txtName")).sendKeys("OrangeHRM (Pvt) Ltd");
	driver.findElement(By.id("txtDescription")).sendKeys("hrm is automation based project");
	driver.findElement(By.id("btnSave")).click();
	// driver.findElement(By.id("btnCancel")).click();

	driver.findElement(By.id("treeLink_addChild_4")).click();
	driver.findElement(By.name("txtUnit_Id")).sendKeys("9090");
	driver.findElement(By.name("txtName")).sendKeys("Sales");
	driver.findElement(By.name("txtDescription")).sendKeys("sales is use for sale the items");
	driver.findElement(By.id("btnSave")).click();

	driver.findElement(By.id("treeLink_addChild_5")).click();
	driver.findElement(By.name("txtUnit_Id")).sendKeys("5656");
	driver.findElement(By.name("txtName")).sendKeys("Administration");
	driver.findElement(By.name("txtDescription")).sendKeys("hrm is automation based project");
	driver.findElement(By.id("btnSave")).click();
	// driver.findElement(By.id("btnCancel")).click();

	driver.findElement(By.id("treeLink_addChild_6")).click();
	driver.findElement(By.name("txtUnit_Id")).sendKeys("Demo");
	driver.findElement(By.name("txtName")).sendKeys("It");
	driver.findElement(By.name("txtDescription")).sendKeys("hrm is automation based project");
	driver.findElement(By.id("btnSave")).click();
	// driver.findElement(By.id("btnCancel")).click();

	driver.findElement(By.id("treeLink_addChild_7")).click();
	driver.findElement(By.name("txtUnit_Id")).sendKeys("a234d");
	driver.findElement(By.name("txtName")).sendKeys("Finance");
	driver.findElement(By.name("txtDescription")).sendKeys("hrm is automation based project");
	driver.findElement(By.id("btnSave")).click();
	// driver.findElement(By.id("btnCancel")).click();
	// for Done
	driver.findElement(By.id("btnEdit")).click();
	}

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
//		String  gettext=driver.findElement(By.xpath("//*[@id='recordsListTable']/tbody/tr[2]/td[2]")).getText();
//		  System.out.println(gettext);
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
			driver.findElement(By.id("membership_name")).sendKeys("abercdegff");
			driver.findElement(By.id("btnSave")).click();
			driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectAll']")).click();
			driver.findElement(By.xpath("//*[@id='btnDelete']")).click();
			driver.findElement(By.id("dialogDeleteBtn")).click();
			System.out.println("sahil script");
			
	 }
			    
	  }







