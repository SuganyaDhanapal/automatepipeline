package week3.day2.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ajio {

	public static void main(String[] args) throws InterruptedException  {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div/input[@class='react-autosuggest__input react-autosuggest__input--open']"))
				.sendKeys("bags", Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(10000);
		
		//wait.
		
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(10000);
		
		WebElement Total = driver.findElement(By.xpath("//div[@class='length']//strong[1]"));
		System.out.println(Total.getText() + "Items Found");
		
		List<WebElement> allbrands = driver.findElements(By.xpath("//div[@class='brand']/strong"));
		//List<String> list = new ArrayList<String>();

		for (WebElement each : allbrands) {
			System.out.println(each.getText());
		}
		List<WebElement> allbags = driver.findElements(By.xpath("//div[@class='nameCls']"));

		//List<String> list1 = new ArrayList<String>();
		for (WebElement each : allbags) {
			System.out.println(each.getText());
		}

		//driver.quit();
	}

}
