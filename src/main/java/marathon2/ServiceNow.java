package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://dev200784.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("I-Ks*dzGjO63");
		driver.findElement(By.xpath("//button[@id='sysverb_login']")).click();
		Shadow obj = new Shadow(driver);
		obj.setImplicitWait(20);
		obj.findElementByXPath("//div[text()='All']").click();
		obj.setImplicitWait(10);
		obj.findElementByXPath("//span[text()='Service Catalog']").click();
		WebElement frame = obj.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();

		// Select Apple iPhone 13
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13 pro']")).click();
		driver.findElement(By.xpath("//label[@class='radio-label'][1]")).click();
		driver.findElement(By.xpath("//input[@id='IO:4afecf4e9747011021983d1e6253af34']")).sendKeys("99");

		WebElement monthDD = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
		Select sec = new Select(monthDD);
		sec.selectByValue("unlimited");

		driver.findElement(
				By.xpath("//label[@for='IO:d1b3f6fe9752cd1021983d1e6253afd2_6a64f2729792cd1021983d1e6253afdc']"))
				.click();
		driver.findElement(
				By.xpath("//label[@for='IO:86c4fa729792cd1021983d1e6253afd3_6055feb29792cd1021983d1e6253af71']"))
				.click();
		driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
		
		//Orderplaced

		WebElement element2 = obj.findElementByXPath("//div[@class='notification notification-success']");
		// driver.switchTo().frame(element2);
		String text = element2.getText();
		System.out.println(text);
		String text2 = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
		System.out.println("Request Number"+text2);
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snap/servicenow.png");
		FileUtils.copyFile(source, dest);
		
		
	}

}
