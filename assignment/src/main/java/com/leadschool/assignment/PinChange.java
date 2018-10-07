package com.leadschool.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import junit.framework.Assert;

public class PinChange {
	
	public static void pincode(WebDriver driver,String pincode) throws Exception
	{
	driver.findElement(By.id("nav-global-location-slot")).click();
	Thread.sleep(3000L);
	driver.findElement(By.xpath("//*[@id='GLUXChangePostalCodeLink']")).click();;
	driver.findElement(By.xpath("//*[@id='GLUXZipUpdateInput']")).clear();
	driver.findElement(By.xpath("//*[@id='GLUXZipUpdateInput']")).sendKeys(pincode);
    driver.findElement(By.xpath("//*[@id='GLUXZipUpdate']/span/input")).click();
     driver.findElement(By.xpath("//*[@id='a-popover-2']/div/div[2]/span/span/span/button")).click();
     
}
}
