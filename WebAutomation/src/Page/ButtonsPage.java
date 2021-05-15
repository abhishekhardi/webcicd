package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Test.BaseTest;

public class ButtonsPage  {
private WebElement element;
WebDriver driver;

public ButtonsPage(WebDriver driver) {
	this.driver = driver;
}
	//public String Elements1 = "//div[contains(text(),'Elements')]";
	public final WebElement Elements1() {
		element = driver.findElement(By.xpath("//div[contains(text(),'Elements')]"));
		return element;
	}
	
	public final WebElement buttons() {
		return element = driver.findElement(By.xpath("//span[contains(text(),'Buttons')]"));
	}
	public final WebElement Clickbtn() { 
		return element = driver.findElement(By.xpath("//button[text()='Click Me']"));
	}
	public final WebElement Clickbtnmsg() {
		return element = driver.findElement(By.xpath("//p[@id='dynamicClickMessage']"));
	}
	public final WebElement rightclick() {
		return element = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
	}
	public final WebElement rightclickmsg() { 
		return element = driver.findElement(By.xpath("//p[@id='rightClickMessage']"));
	}
	public final WebElement doubleclick() {
		return element = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
	}
	public final WebElement doubleclickmsg() {
		return element = driver.findElement(By.xpath("//p[@id='doubleClickMessage']"));
	}

	


}
