package week2.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
        driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
        driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Testleaf");
        driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Testleaf");
        driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("6.7M");
        WebElement industryDD = driver.findElement(By.name("industryEnumId"));
	    Select sec = new Select(industryDD);
	    sec.selectByIndex(3);
	    
	    WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
	    Select sec1 = new Select(ownershipDD);
	    sec1.selectByVisibleText("S-Corporation");
	    
	    WebElement sourceDD = driver.findElement(By.id("dataSourceId"));
	    Select sec2 = new Select(sourceDD);
	    sec2.selectByValue("LEAD_EMPLOYEE");
	    
	    WebElement marketingcampaignidDD = driver.findElement(By.id("marketingCampaignId"));
	    Select sec3 = new Select(marketingcampaignidDD);
	    sec3.selectByIndex(6);
	    
	    WebElement stateprovinceDD = driver.findElement(By.id("generalStateProvinceGeoId"));
	    Select sec4 = new Select(stateprovinceDD);
	    sec4.selectByValue("TX");
	    
	    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	    
		String title = driver.getTitle();
		System.out.println(title);

	}

}
