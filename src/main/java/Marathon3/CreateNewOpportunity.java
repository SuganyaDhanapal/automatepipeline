package Marathon3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateNewOpportunity extends BaseClass {
	
	@BeforeTest
	public void setValues() {
		fileName="CreateNewOppo";
	}
	
	@Test(dataProvider = "sendData")

	public  void CreateNewOpportunityone (String oName, String amount , String date) throws InterruptedException {
		
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
		driver.findElement(By.xpath("//div[@title='New']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("oName");
		WebElement opportunity = driver.findElement(By.xpath("//input[@name='Name']"));
		String s=opportunity.getText();
		System.out.println(s);
		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("amount");
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).click();
		Thread.sleep(1000);

	

		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys(date);

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input slds-input_faux')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//lightning-base-combobox-item[@data-value='Needs Analysis']")).click();

		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();

		String text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='alertdialog']")))
				.getText();
		System.out.println(text);

		driver.quit();
	}

}
