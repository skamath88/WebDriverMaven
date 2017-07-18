package com.test.WebDriverMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver browser = null;
	
	@BeforeMethod
	public void testsetup(){
		System.setProperty("webdriver.chrome.driver", "C:/Users/Satish Kamat/workspace1/chromedriver.exe");
		browser = new ChromeDriver();
		browser.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test
	public void doLogin() throws InterruptedException{
		browser.navigate().to("http://gmail.com");
		browser.findElement(By.id("identifierId")).sendKeys("skamath88@gmail.com");
		browser.findElement(By.id("identifierNext")).click();
		browser.findElement(By.name("password")).sendKeys("oislayer");
		Thread.sleep(5000L);
	}
	
	
	@AfterMethod
	public void testDown() {
		browser.quit();
	}

}
