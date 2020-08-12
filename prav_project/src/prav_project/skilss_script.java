package prav_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class skilss_script {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		String path;
		path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		 driver=new ChromeDriver();
		    driver.manage().deleteAllCookies();
		    driver.get("https://opensource-demo.orangehrmlive.com");
		    driver.manage().window().maximize();
		    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		    driver.findElement(By.id("btnLogin")).click();
		   
		    driver.findElement(By.linkText("Admin")).click();
		    driver.findElement(By.id("menu_admin_Qualifications")).click();
		    driver.findElement(By.id("menu_admin_viewSkills")).click();
		    driver.findElement(By.id("btnAdd")).click();
		    driver.findElement(By.id("skill_name")).sendKeys("demsyret");
		    driver.findElement(By.id("skill_description")).sendKeys("5 year experience");
		    driver.findElement(By.id("btnSave")).click();
		  
		    driver.findElement(By.xpath("//*[@id='recordsListTable']/tbody/tr[1]/td[1]/input")).click();
		    driver.findElement(By.id("btnDel")).click();
		    System.out.println("entry is deleted");
		    System.out.println("prabh script is done");
		  
		    driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers#");
		    //driver.findElement(By.id("btnCancel")).click();
		   
		 //sanju script qualifiaction education
		    
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
			
			//if(driver.findElement(By.xpath("//input[@type='checkbox']")).getAttribute("value").matches("5"));
			//{
			//driver.findElement(By.xpath("//input[@type='checkbox']")).click();}
			
			//sheetal script qualification licence
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
			  
			  
			  //ritu script language
			  //Qualifications
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
			    //   driver.close();
			  
			  //sahil script qualifications
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
