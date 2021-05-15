package Test;

import org.testng.annotations.Test;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import org.testng.annotations.Listeners;
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Page.ButtonsPage;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.Argument;

@Listeners(Utilities.ListenersWeb.class)	
public class ButtonsTest extends BaseTest{
	
	
	// Buttons Clicking
@Test
public void ValidateButtons() throws InterruptedException{
	
	ButtonsPage bp = new ButtonsPage(driver);
	Actions actions = new Actions(driver);	
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	bp.Elements1().click();;
	WebElement element = bp.buttons();
	js.executeScript("arguments[0].scrollIntoView(true);", element);
	element.click();
	Thread.sleep(2000);
	
	//Click
	bp.Clickbtn().click();
	bp.Clickbtnmsg().isDisplayed();
	
	//Right Click
	WebElement RightClick = bp.rightclick();
	actions.contextClick(RightClick).perform();
	bp.rightclickmsg().isDisplayed();

	// Double Click
	WebElement DoubleClick = bp.doubleclick();
	actions.doubleClick(DoubleClick).perform();
	bp.doubleclickmsg().isDisplayed();
	Thread.sleep(5000);
  }
}