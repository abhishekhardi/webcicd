package com.webautomation;

import org.testng.annotations.Test;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;



public class BaseTest3 {
	public static  WebDriver driver;
	 public static String baseUrl = "https://www.voot.com";
	 public static String url1 = "https://psapi.voot.com/media/voot/v1/voot-web/view/my-voot?page=2&premiumTrays=false";
	 public static String  url2 = "https://psapi.voot.com/media/voot/v1/voot-web/content/specific/editorial?query=include:3c14b26015cfbbdc0250ea704f6ba25e&responseType=common";

	
	 @Test(priority=0)
	public void setup() throws IOException, InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver",".//Drivers/chromedriver.exe");
	driver= new ChromeDriver();
	ChromeOptions options = new ChromeOptions();	
	driver.manage().window().maximize();
	options.addArguments("--disable-notifications");
	// launch Fire fox and direct it to the Base URL
    driver.get(baseUrl);
    Thread.sleep(2000);
    
   
    driver.quit();
    
}
	/*@Test(priority=0)
	public void setup1() 
	{
	System.setProperty("webdriver.gecko.driver",".//Drivers/geckodriver1.exe");
	driver= new FirefoxDriver();
		
	driver.manage().window().maximize();
	
	// launch Fire fox and direct it to the Base URL
    driver.get(baseUrl);
       
}*/
}

