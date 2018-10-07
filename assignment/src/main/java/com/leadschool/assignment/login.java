package com.leadschool.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
	
	public static void logintest(WebDriver driver,String username,String password) throws Exception
	{
	
	driver.findElement(By.cssSelector(Setup.getproperty("signin_selector"))).click();;
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath(Setup.getproperty("email_selector"))).sendKeys(username);
	driver.findElement(By.xpath(Setup.getproperty("continue_selector"))).click();
	driver.findElement(By.id(Setup.getproperty("password_selector"))).sendKeys(password);
	driver.findElement(By.id(Setup.getproperty("submit_selector"))).click();
	}

}
