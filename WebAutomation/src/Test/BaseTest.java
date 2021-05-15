package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;
//Opening the website

public class BaseTest {
	public static  WebDriver driver;
	 public static String baseUrl = "https://demoqa.com/profile";
	 
	@BeforeClass
	 public void setup() throws IOException, InterruptedException 
		{
		System.setProperty("webdriver.chrome.driver",".//Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		ChromeOptions options = new ChromeOptions();	
		driver.manage().window().maximize();
		options.addArguments("--disable-notifications");
		// launch Fire fox and direct it to the Base URL
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get(baseUrl);
	    Thread.sleep(2000);
		}

	@AfterClass
	 public void teardown(){
	  driver.manage().deleteAllCookies();
	  driver.close();
	 }
}



