package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		driver.findElement(By.linkText("Tomorrow")).click();
		
		WebElement Result1 = driver.findElement(By.xpath("(//h5[@class='title'])[1]"));
		System.out.println("Printing " + Result1.getText());
		
		driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		
		WebElement Result2 = driver.findElement(By.xpath("//div[@class='text-grey']/small"));
		System.out.println("Printing " + Result2.getText());
		
		driver.findElement(By.xpath("(//button[contains(@class,'btn bus-info-btn')])[1]")).click();
		driver.findElement(By.xpath("//span[text()='U3']")).click();
		driver.findElement(By.xpath("//div[@class='label']/p[1]")).click();
		driver.findElement(By.xpath("//div[@class='label']/p[1]")).click();
		
		WebElement Result3 = driver.findElement(By.xpath("//span[text()='Seat Selected :']"));
		System.out.println("printing "+ Result3.getText());
		
		WebElement Result4 = driver.findElement(By.xpath("//span[text()='Base Fare :']"));
		System.out.println("printing "+ Result4.getText());
		

		String title = driver.getTitle();
		System.out.println(title);
		
		driver.quit();
		

	}

}
