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

public class sixth {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String path=System.getProperty("user.dir")+"//driver//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		Thread.sleep(5000);
		for(int i=0;i<links.size();i++)
		{
			WebElement list=links.get(i);
			String url=list.getAttribute("href");
			URL link=new URL(url);
			HttpURLConnection first=(HttpURLConnection) link.openConnection();
			first.connect();
			int res=first.getResponseCode();
			if(res>=400)
			{
				System.out.println("invalid url:"+url);
			}
			else
			{
				System.out.println("valid url:"+url);
			
			}
		}
	}

}
