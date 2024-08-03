package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amazonShoping {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for b");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='oys'])[1]")).click();
		Thread.sleep(3000);
		WebElement Result = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
		System.out.println("Total " + Result.getText());
		driver.findElement(By.xpath("(//span[text()='Skybags'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@id='p_89/Gear']/span[1]/a[1]/span[1]")).click();
		Thread.sleep(3000);
		WebElement featuredDD = driver.findElement(By.xpath("//select[@class='a-native-dropdown a-declarative']"));
		Thread.sleep(3000);
	    Select sec = new Select(featuredDD);
	    sec.selectByVisibleText("Newest Arrivals");
	    
	    WebElement Result1 = driver.findElement(By.xpath("(//span[contains(@class,'a-size-base-plus a-color-base')])[2]"));
		System.out.println("Description "+ Result1.getText());
		
		WebElement Result2 = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		System.out.println("Price "+ Result2.getText());
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.quit();
	}	
}
