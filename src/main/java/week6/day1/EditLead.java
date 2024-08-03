package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class EditLead extends BaseClass {
	
	public String[][] sendData() {
	
		String[][] data = new String [3][2];
		
		data[0][0]="99";
		data[0][1]="TCS";
		
		data[1][0]="98";
		data[1][1]="CTS";
		
		data[2][0]="97";
		data[2][1]="Hurix";
		
		
		return data;
	}
	
	
	
	@Test(dataProvider = "sendData")

	public  void editlead(String pNo, String cN) throws InterruptedException {
		
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("pNo");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("cN");
		driver.findElement(By.name("submitButton")).click();
		driver.close();
}
}






