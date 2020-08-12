package ing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assingment_btes {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromed\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		String username = null,password = null;
		FileInputStream file=new FileInputStream("C:\\Users\\asus\\Documents\\assingmentbtes.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheetAt(0);
		int row=sheet.getLastRowNum();
		int col=sheet.getRow(0).getLastCellNum();
		System.out.println(col);
		for(int i=1;i<=row;i++)
		{
			username=sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(username);
			password=sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(password);
			
		
		//	System.setProperty("webdriver.chrome.driver","C:\\chromed\\chromedriver.exe");
		//	WebDriver driver=new ChromeDriver();
		//	System.setProperty("webdriver.chrome.driver","C:\\chromed\\chromedriver.exe");

			
			driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
			driver.manage().window().maximize();
		
			driver.findElement(By.id("txtUsername")).sendKeys(username);
			
			driver.findElement(By.id("txtPassword")).sendKeys(password);
	
			driver.findElement(By.id("btnLogin")).click();
		
			
		}
			}}

		





