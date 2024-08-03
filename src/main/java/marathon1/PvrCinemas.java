package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PvrCinemas {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	
		driver.findElement(By.xpath("//img[@alt='Chennai']")).click();
		
		driver.findElement(By.xpath("//span[@class='icon-glow cursor_pointer']//div[1]")).click();
	
		driver.findElement(By.xpath("//a[@class='ng-star-inserted']")).click();
		
		
		WebElement cityDD = driver.findElement(By.xpath("//select[@name='city']"));
		Select sec = new Select(cityDD);
		sec.selectByVisibleText("Chennai");
		
		WebElement genreDD = driver.findElement(By.xpath("//select[@name='genre']"));
		Select sec1 = new Select(genreDD);
		sec1.selectByVisibleText("ANIMATION");
		
		WebElement languageDD = driver.findElement(By.xpath("//select[@name='lang']"));
		Select sec2 = new Select(languageDD);
		sec2.selectByVisibleText("ENGLISH");
		
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-submit')]")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//img[@src='https://originserver-static1-uat.pvrcinemas.com/app/movies/1/402x516/HO00018056.jpg?v=12']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		
		Thread.sleep(3000);
		WebElement cinemaDD = driver.findElement(By.id("cinemaName"));
		Select sec3 =new Select(cinemaDD);
		sec3.selectByVisibleText("PVR Heritage RSL ECR Chennai");
				
		driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='main-calendar-days']")));
		driver.findElement(By.xpath("(//span[@class='day-unit ng-star-inserted'])[1]")).click();
	
		WebElement timeDD = driver.findElement(By.xpath("//select[@name='timings']"));
		Select sec4 =new Select(timeDD);
		sec4.selectByVisibleText("09:00 AM - 12:00 PM");
		
		WebElement noOfTickets = driver.findElement(By.xpath("//input[@name='noOfTickets']"));
		noOfTickets.clear();
		noOfTickets.sendKeys("4");
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Test123@gmail.com");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("1234567893");
		
		WebElement fbDD = driver.findElement(By.xpath("//select[@name='food']"));
		Select sec5 =new Select(fbDD);
		sec5.selectByVisibleText("Yes");
		
		
		driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("test");
		driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@class='btn already-member' and text()='CANCEL'])[2]")).click();
		
		driver.findElement(By.xpath("//button[@class='swal2-close']")).click();

		String title = driver.getTitle();
		System.out.println(title);
			
		driver.quit();
	}

}
