package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fifeth {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		List<WebElement> first=driver.findElements(By.tagName("a"));
		System.out.println("no of links are:"+first.size());
		for(int i=0;i<first.size();i++)
		{
			WebElement link=first.get(i);
			String url=link.getAttribute("href");
			System.out.println(url);
			URL link1=new URL(url);
			
		 	HttpURLConnection httpcon=(HttpURLConnection) link1.openConnection();
			httpcon.connect();
			int rescode=httpcon.getResponseCode();
			if(rescode>=400)
			{
				System.out.println("not valid:"+url);
			}
			else
			{
				
			
			
				System.out.println("valid:"+url);
			
		}
	
				}
	}

}
