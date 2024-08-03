package week4.day2;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement elescroll = driver.findElement(By.linkText("Conditions of Use & Sale"));
		Actions builder = new Actions(driver);
		builder.scrollToElement(elescroll).perform();
		String text = elescroll.getText();
		System.out.println(text);
		//to take printout
		driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snap/amazon.png");
		
		
		
		
		
		
		
	}

}
