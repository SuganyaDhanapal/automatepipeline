package Marathon3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditOpportunity extends BaseClass {
	
	
	@BeforeTest
	public void setValues() {
		fileName="EditOppo";
	}
	
	@Test(dataProvider = "sendData")

	public  void EditOppo(String oName, String date) throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//lightning-button[@class='slds-button slds-p-horizontal--small']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(5000);
		WebElement opportunities = driver.findElement(By.xpath("(//span[@class='slds-truncate'])[3]"));
		driver.executeScript("arguments[0].click();", opportunities);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys("oName",Keys.ENTER);
		//driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		WebElement drop =driver.findElement(By.xpath("//span[@class='slds-icon_container slds-icon-utility-down']"));
		driver.executeScript("arguments[0].click();", drop);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='slds-dropdown-trigger slds-dropdown-trigger_click slds-size_1-of-1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys(date);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@data-value='Needs Analysis']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Perception Analysis']")).click();
		
	WebElement delivaryStatus = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@data-value='--None--'])[3]")));
	driver.findElement(By.xpath("(//button[@data-value='--None--'])[3]")).click();
	
		driver.findElement(By.xpath("(//button[@data-value='--None--'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='In progress']")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("slds-textarea")).sendKeys("Salesforce");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alertdialog']")))
				.getText();
		System.out.println(text);
		driver.quit();
	
		
		
		
	}

}
