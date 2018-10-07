package com.leadschool.assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {
public static WebDriver driver;
	
	public static WebDriver webdriversetup() {
		  System.setProperty("webdriver.chrome.driver", "/Users/supriya/Downloads/chromedriver_mac64/chromedriver" );
		  return (driver=new ChromeDriver());
		  }
	
	
	public static void launchurl(WebDriver driver)
	{
		driver.get("https://www.amazon.in");
	    driver.manage().window().maximize();
	}
	 
	 public static WebElement findelementbyxpath(String xpathlocation)
	 {
		 WebElement element =driver.findElement(By.xpath(xpathlocation));
		 return element;
	 }
	 
	  public static void driverquit(WebDriver driver) {
		  driver.close();
		   driver.quit();
	  }
	  
	  public static String getproperty(String propertyname) throws Exception
	  {
		 File filename=new File("login.properties");
		 FileInputStream fileInput = new FileInputStream(filename);
		 Properties properties = new Properties();
		 properties.load(fileInput);
		 fileInput.close();
		 String value = properties.getProperty(propertyname);
		return value;
		}
		 
	  
	
}
