package week2.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGround {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   

		driver.findElement(By.className("ui-selectonemenu")).findElement(By.xpath("//option[text()='Selenium']"))
				.click();
		driver.findElement(By.xpath("//div[contains(@id, 'country')]")).click();
		driver.findElement(By.xpath("//li[@data-label='India']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(@id,'city') and @role='combobox']")).click();
		driver.findElement(By.xpath("//li[@data-label='Chennai']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Show Options']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@data-item-label='Selenium WebDriver']")).click();
		driver.findElement(By.xpath("//div[contains(@id,'lang')]")).click();
		driver.findElement(By.xpath("//li[@data-label='English']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Select Values']")).click();
		
		driver.findElement(By.xpath("//li[@data-label='Two']")).click();
		

	}

}
