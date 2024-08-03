package marathon2;

import static org.testng.AssertJUnit.assertEquals;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class TestcaseOne {

	public static void main(String[] args) throws InterruptedException {
	ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.tatacliq.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement brands = driver.findElement(By.xpath("//div[text()='Brands']"));
		Actions builder = new Actions(driver);
		builder.moveToElement(brands).perform();
		Thread.sleep(3000);
		WebElement wanda = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(wanda).perform();
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		Thread.sleep(3000);
		WebElement sortDD = driver.findElement(By.tagName("select"));
		Thread.sleep(3000);
	    Select sec = new Select(sortDD);
	    sec.selectByVisibleText("New Arrivals");
	    driver.findElement(By.xpath("//div[text()='Men']")).click();
	    Thread.sleep(2000);
        List<WebElement> price = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
        for (WebElement each : price) {
            
            String watchprice = each.getText();            
            System.out.println("watchprice "+watchprice);
            
       		

	}
        
        WebElement firstwatchprice = driver.findElement(By.xpath("//div[@class='ProductDescription__priceHolder'][1]"));
        String firstwatchpriceText = firstwatchprice.getText();
		System.out.println("firstwatchprice " + firstwatchpriceText);
		
        Thread.sleep(2000);
        WebElement watch = driver.findElement(By.xpath("//div[@class='ProductModule__imageAndDescriptionWrapper']"));
        driver.executeScript("arguments[0].click();",watch );
                
        
        Set<String> windowHandles = driver.getWindowHandles();//pWindowHandle,childWindowHandle
        List<String> handles = new ArrayList<String>(windowHandles);
		driver.switchTo().window(handles.get(1));
        
        WebElement firstwatchpricetwo = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']"));
        String firstwatchpricetwoText = firstwatchpricetwo.getText();
		System.out.println("firstwatchpricetwo " + firstwatchpricetwoText);
		
		if(firstwatchpricetwoText.contains(firstwatchpriceText)) {
			System.out.println("price matches in parent and child window");
		}
		else {
			System.out.println("Price not matched");
		}
        
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		
		WebElement cartcount = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']"));
		String cartcountText = cartcount.getText();
		System.out.println("item in cart count " + cartcountText);
		
		driver.close(); 
		driver.switchTo().window(handles.get(0)); 
		driver.close();
}
	
	
}
