package week4.assignmentsWeek4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAssignment {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame("iframeResult");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Alert simpleAlert = driver.switchTo().alert();

		simpleAlert.sendKeys("ironman");
		simpleAlert.accept();
		String name = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(name);
		if (name.contains("name")) {
			System.out.println("Alert handled");
		}
		//driver.quit();
	}
}
