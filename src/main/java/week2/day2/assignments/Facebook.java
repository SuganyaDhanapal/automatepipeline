package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Testone");
		driver.findElement(By.name("lastname")).sendKeys("TWO");
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']"));
		driver.findElement(By.id("password_step_input")).sendKeys("Test123!@");
		WebElement dayDD = driver.findElement(By.id("day"));
		Select sec = new Select(dayDD);
		sec.selectByVisibleText("10");
		
		WebElement monthDD = driver.findElement(By.id("month"));
		Select sec1 = new Select(monthDD);
		sec1.selectByVisibleText("Dec");
		
		WebElement yearDD = driver.findElement(By.id("year"));
		Select sec2 = new Select(yearDD);
		sec2.selectByVisibleText("1981");
		
		driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).click();
		
		

	}

}
