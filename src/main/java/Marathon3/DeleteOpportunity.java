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



public class DeleteOpportunity extends BaseClass {
	
	@BeforeTest
	public void setValues() {
		fileName="DeleteOppo";
	}
	
	@Test(dataProvider = "sendData")

	
	public  void DeleteOppo(String oName) throws InterruptedException {
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//lightning-button[@class='slds-button slds-p-horizontal--small']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(5000);
		WebElement opportunities =  driver.findElement(By.xpath("(//span[@class='slds-truncate'])[3]"));
		driver.executeScript("arguments[0].click();", opportunities);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys("oName",Keys.ENTER);
		//driver.findElement(By.xpath("//input[@name='Opportunity-search-input']")).sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		WebElement drop = driver.findElement(By.xpath("//span[@class='slds-icon_container slds-icon-utility-down']"));
		driver.executeScript("arguments[0].click();", drop);
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Delete']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		//Alert simpleAlert = driver.switchTo().alert();
		//simpleAlert.accept();
		String text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alertdialog']")))
				.getText();
		System.out.println(text);
		
		driver.quit();

		
		

}
}
