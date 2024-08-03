package week4.assignmentsWeek4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AmazonActions {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("onepluse 9 pro");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.RETURN);
		WebElement firstmobile = driver.findElement(By.xpath("//span[@class='a-price'][1]"));
		String firstMobileText = firstmobile.getText();
		//String replaceAll1 = firstMobileText.replaceAll("[^0-9]", "");
		//System.out.println("first price " + replaceAll1);
		System.out.println("firstmobileprice " + firstMobileText);
		Thread.sleep(3000);
		WebElement customerrating = driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']"));
		System.out.println("CustomerRating " + customerrating.getText());

		WebElement mobile = driver.findElement(By.xpath("//img[@class='s-image']"));
		driver.executeScript("arguments[0].click();", mobile);
		
		Thread.sleep(1000);
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snap/oneplus9pro.png");
		FileUtils.copyFile(source, dest);
		

		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>(windowHandles);

		driver.switchTo().window(handles.get(1));

		Thread.sleep(2000);

		// WebElement mobileprice2 = driver.findElement(By.xpath("//span[@class='a-price
		// a-text-price a-size-medium']"));
		// String mobileprice2Text = mobileprice2.getText();
		// String replaceAll = mobileprice2Text.replaceAll("[^0-9]", "");
		// System.out.println("2nd page "+ replaceAll);

		// float price2 = Float.parseFloat(firstMobileText.substring(1));
		// System.out.println("price2 " + mobileprice2Text);

		// if(replaceAll.contains(replaceAll1)) {
		// System.out.println("price matches in parent and child window");
		// }
		// else {
		// System.out.println("Price not matched");
		// }

		// System.out.println("cart page "+ replaceAll);
		driver.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(5000);

		WebElement carttotal = driver.findElement(By.xpath("//span[contains(@class,'a-size-mini a-color-price')]"));
		String cartsubtotal = carttotal.getText();
		System.out.println("Cart subTotal " + carttotal.getText());
	
		//String replaceAll2 = cartsubtotal.replaceAll("[^0-9]", "");
		//System.out.println("cartsubtotal" + carttotal.getText());

		if (cartsubtotal.contains(firstMobileText)) {
			System.out.println("price matches in parent and child window");
		} else {
			System.out.println("Price not matched");
		}

		driver.quit();
	}

}
