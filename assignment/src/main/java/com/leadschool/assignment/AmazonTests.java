package com.leadschool.assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import junit.framework.Assert;

public class AmazonTests {

	public static void main(String[] args) throws Exception {
		WebDriver driver=Setup.webdriversetup();
		Setup.launchurl(driver);
		
		//Validate sign-in link is working
		WebElement signin =driver.findElement(By.cssSelector("a[id='nav-link-yourAccount']"));
		String link=signin.getAttribute("href");
		WebDriver driver1=new ChromeDriver();
		driver1.get(link);
		driver1.close();
		driver1.quit();
		
		//Get the number of banners on the home page(slider promotions on top)
		String selector = Setup.getproperty("caraousel_selector");
		List<WebElement> caraouselitems=driver.findElements(By.cssSelector(selector));
		System.out.println(caraouselitems.size());
		
		//Validate login flow with correct details.
		String user=Setup.getproperty("username");
		String pass=Setup.getproperty("password");
		login.logintest(driver,user,pass);
		
		//Validate the pincode change flow
		PinChange.pincode(driver, "400098");
		
		//quit driver
		driver.close();
		driver.quit();
	}

}
