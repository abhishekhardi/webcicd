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



public class BaseTest2 {
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
    
    // Login
    driver.findElement(By.xpath("//img[@alt='User Avatar']")).click();
    driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
    driver.findElement(By.xpath("//div[contains(@class,'mobileEmailSignUpBtn')]")).click();
    driver.findElement(By.xpath("//input[@name='email']")).clear();
    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test903@v.com");
    driver.findElement(By.xpath("//button[contains(@class,'jss747 jss749 undefined')]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='password']")).click();
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
    driver.findElement(By.xpath("//button[contains(@class,'jss747 jss749 undefined')]")).click();
    Thread.sleep(5000);
   
    RestAssured.baseURI="";
	Response res = RestAssured.given().get(url1);
	Response res1 = RestAssured.given().get(url2);
	System.out.println(res.asString());
	for (int i=0; i<3; i++){
	String Title = res.jsonPath().getString("trays["+i+"].title").toString();
	//Scroll tray
	WebElement element = driver.findElement(By.xpath("//h3[contains(text(),'"+Title+"')]"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	element.isDisplayed();
	Thread.sleep(1000); 
	
	
	//driver.ScrollToView(driver, driver.findElement(By.xpath("//h3[contains(text(),'"+Title+"')]")));
	if (Title.equalsIgnoreCase("Trending Now: Top Shows")){
	for (int j=0; j<3; j++){
		String meta = res1.jsonPath().getString("result["+j+"].fullTitle").toString();
		// validate the meta data
		driver.findElement(By.xpath("//h4[contains(text(),'"+meta+"')]")).isDisplayed();
		System.out.println("Contents in Trending Now: Top Shows are " +meta);
		// horizontal swipe
		
		
		
	// Logout
		/*driver.findElement(By.xpath("//div[contains(text(),'T')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Sign Out')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Sign Out')]")).click();
		*/
	}
	}
	System.out.println(Title);
	}
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

