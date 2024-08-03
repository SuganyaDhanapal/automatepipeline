package week6.assignments1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead extends BaseClass {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("suganya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Dhanapal");
        
        WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
	    Select sec = new Select(sourceDD);
	    sec.selectByVisibleText("Employee");
	    
	    WebElement marketingcampaignidDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	    Select sec1 = new Select(marketingcampaignidDD);
	    sec1.selectByValue("9001");
	    
	    WebElement ownershipDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	    Select sec2 = new Select(ownershipDD);
	    sec2.selectByIndex(5);
	    	     	   	    
	    WebElement countryDD = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	    Select sec4 = new Select(countryDD);
	    sec4.selectByVisibleText("India");
	    
	    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	    
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();


	}

}
