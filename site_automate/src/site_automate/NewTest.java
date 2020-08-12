package site_automate;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;

public class NewTest {
	private static final String Male = null;
	WebDriver driver;
	String path;
	String gender=Male;
	String count="Russian";
  @Test(priority=1)
  public void email() {
	  driver.findElement(By.id("email")).sendKeys("jaswalshhetal01@gmail.com");
	  driver.findElement((By.id("enterimg"))).click();
	  System.out.println("first test case passed");
	  		
  }
  @Test(priority = 2)
  public void form()
  {
	  driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("sheetal");
	  driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("jaswal");
	  driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("una");
	  driver.findElement(By.xpath("//input[@type='email']")).sendKeys("jaswalshhetal01@gmail.com");
	  driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9805260338");
	  System.out.println("second case passed");
	  		
  }
  @Test(priority = 3)
  public void button()
  {
	  List<WebElement> radio=driver.findElements(By.name("radiooptions"));
	  System.out.println("radio size is:"+radio.size());
	  for(int i=0;i<radio.size();i++)
	  {
		String gen= radio.get(i).getAttribute("value");
	
	  driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/label[1]/input")).click();
	  
	  }
	  System.out.println("third test pass");
  }
  @Test(priority=4)
  public void butto()
  
  {
	  driver.findElement(By.id("checkbox1")).click();
	 
	  
	  
	  
  }
  @Test(priority=5)
  public void language()
  {
	  System.out.println("TEST 5");
	//  Actions bg=new Actions((WebDriver) driver.findElement(By.xpath("//*[@id='msdd']")));
	//  bg.click().build().perform();
  //driver.findElement(By.xpath("//*[@id='msdd']")).click();
	//  driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[7]/div/multi-select/div[2]/ul/li[1]")).click();  
//	 //Actions act = new Actions((WebDriver) driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[7]/div/multi-select/div[2]/ul/li[1]")));
//	// act.click();
//			 List<WebElement> tr=driver.findElements(By.xpath("//li[@class='ng-scope']"));
//			 System.out.println(tr.size());
//			 for(int i=0;i<tr.size();i++)
//			 {
//				 String er=tr.get(i).getText();
				
  }

  @Test(priority=6)
  public void skill()
  {
	  Select s1=new Select(driver.findElement(By.id("Skills")));
	  s1.selectByIndex(5);
	
  }
  @Test(priority=7)
  public void country()
  {
	  Select s2=new Select(driver.findElement(By.id("countries")));
	  s2.selectByVisibleText("India");
	 driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
	 List<WebElement> count=driver.findElements(By.xpath("//li[@class='select2-results__option']"));
	 System.out.println(count.size());
	 driver.findElement(By.xpath("//*[@id='select2-country-results']/li[4]")).click();
	 
  }
  @Test(priority=8)
  public void dob()
  {
	  Select year=new Select(driver.findElement(By.id("yearbox")));
	  year.selectByValue("2003");
	  Select month=new Select(driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[11]/div[2]/select")));
	  month.selectByVisibleText("May");
	  Select day=new Select(driver.findElement(By.id("daybox")));
	  day.selectByIndex(5);
  }
  @Test(priority=9)
  public void password() throws InterruptedException
  {
	  driver.findElement(By.id("imagesrc")).sendKeys("C:\\Users\\asus\\Desktop\\Vaishnavi\\20200119_130654.jpg");
	  driver.findElement(By.id("firstpassword")).sendKeys("Sheetal@2018");
	  driver.findElement(By.id("secondpassword")).sendKeys("Sheetal@2018");
	  driver.findElement(By.id("submitbtn")).click();
	
  }
  @BeforeSuite
  public void beforeSuite() {
	  path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver", path);
	  driver=new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.get("http://demo.automationtesting.in/Index.html");
	  driver.manage().window().maximize();
	  
  }

  @AfterSuite
  public void afterSuite() {
  }

}
