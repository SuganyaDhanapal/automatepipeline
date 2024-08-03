package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPrompt {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']")).click();
		Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		simpleAlert.sendKeys("name");
		simpleAlert.accept();
		String name = driver.findElement(By.id("confirm_result")).getText();
		if(name.contains("entered")) {
		System.out.println("Alert handled");
		
		}
	}

}
