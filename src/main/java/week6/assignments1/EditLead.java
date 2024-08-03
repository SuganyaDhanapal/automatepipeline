package week6.assignments1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Sug");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@class='x-grid3-row-table']")));
		
				
		
		driver.findElement(By.linkText("Edit")).click();
		WebElement companyNameInput = driver.findElement(By.id("updateLeadForm_companyName"));
		companyNameInput.clear();
		companyNameInput.sendKeys("fast");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		
		WebElement companyNameElement = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
		String text = companyNameElement.getText();
		System.out.println(text);
		
		if (text.contains("fast")) 
		System.out.println("Text is verified");
		else
			System.out.println("Text not updated");
		
		
		driver.quit();
		
	}

}
