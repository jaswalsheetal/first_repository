package face;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class first {
//String name,surname,mobile,pass,date,month,year;
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		FileInputStream file=new FileInputStream("C:\\Users\\asus\\Documents\\facebbokassingnment.xlsx");
		XSSFWorkbook book=new XSSFWorkbook(file);
		XSSFSheet sheet=book.getSheetAt(0);
		int row=sheet.getLastRowNum();
		System.out.println(row);
		for(int i=1;i<=row;i++)
		{
		String	name=sheet.getRow(i).getCell(0).getStringCellValue();
		System.out.println(name);
		String surname=sheet.getRow(i).getCell(1).getStringCellValue();
		System.out.println(surname);
	int mobile=(int) sheet.getRow(i).getCell(2).getNumericCellValue();
	System.out.println(mobile);
	String pass=sheet.getRow(i).getCell(3).getStringCellValue();
System.out.println(pass);
int date=(int) sheet.getRow(i).getCell(4).getNumericCellValue();
System.out.println(date);
String month=sheet.getRow(i).getCell(5).getStringCellValue();
System.out.println(month);
int year=(int) sheet.getRow(i).getCell(6).getNumericCellValue();
System.out.println(year);
		driver.findElement(By.id("email")).sendKeys(name);
		driver.findElement(By.id("pass")).sendKeys(surname);
		driver.findElement(By.id("u_0_b")).click();
			System.out.println("done");
		}

	}

}
