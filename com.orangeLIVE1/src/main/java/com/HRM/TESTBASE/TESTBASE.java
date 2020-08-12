package com.HRM.TESTBASE;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TESTBASE {
	public static WebDriver driver;
	public static Properties prop;
	public TESTBASE() throws IOException
	{
		 
			FileInputStream ip;
			try {
				ip = new FileInputStream("D:\\automation_1june\\com.orangeLIVE1\\src\\main\\java\\com\\configuration\\confiq.properties");
				prop = new Properties();
				prop.load(ip);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	public static void initialization()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
	}

}
