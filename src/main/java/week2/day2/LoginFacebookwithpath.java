package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebookwithpath {

	public static void main(String[] args) {
		
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("testleaf.2023@gmail.com");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Tuna@321");
			driver.findElement(By.xpath("//button[@name='login']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'account')]")).click();
			String title = driver.getTitle();
			System.out.println(title);

		}

	}


