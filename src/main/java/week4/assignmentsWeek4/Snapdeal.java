package week4.assignmentsWeek4;

import static org.testng.AssertJUnit.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement mensfashion = driver.findElement(By.xpath("//span[@class='labelIcon']/following-sibling::span[1]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(mensfashion).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		//Actions builder1 = new Actions(driver);
		//builder1.moveToElement(sportsshoe).perform();
		
		WebElement itemcount = driver.findElement(By.xpath("(//div[@class='child-cat-count '])[2]"));
		System.out.println("Total " + itemcount.getText());
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		Thread.sleep(3000);
		
	    List<WebElement> beforeSortPrice = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
	    List<Double> beforeSortPriceList = new ArrayList<Double>();
	    List<String> pricecompare = new ArrayList<String>();
	    for (int i =0;i<beforeSortPrice.size();i++) {
	    	String s = beforeSortPrice.get(i).getText();
	    	//System.out.println("beforeprice" + s );
	    	String replace1 = s.replace("^[0-9]","");
	    	System.out.println("price" + replace1);
	    }
		
		driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
	
		
	    driver.findElement(By.xpath("(//li[@data-index='1'])[2]")).click();
	    
	    List<WebElement> afterSortPrice = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
	    List<Double> afterSortPriceList = new ArrayList<Double>();
	    
	    
	    for (int j =0;j<afterSortPrice.size();j++) {
	    	String s1 = afterSortPrice.get(j).getText();
	    	//System.out.println("afterprice" + s1 );
	    	String replace2 = s1.replace("^[0-9]","");
	    	System.out.println("price" + replace2);
	    }
	   
	 
	 Collections.sort(pricecompare);

	 
	 
	 Assert.assertEquals(beforeSortPriceList,afterSortPriceList);
	  System.out.println("SortingMatches");
	  driver.findElement(By.xpath("//input[@name='fromVal']")).clear();
	  driver.findElement(By.xpath("//input[@name='fromVal']")).sendKeys("599");
	  driver.findElement(By.xpath("//input[@name='toVal']")).clear();
	  driver.findElement(By.xpath("//input[@name='toVal']")).sendKeys("700");
	  driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
	  
	  Thread.sleep(1000);
	  
	  driver.findElement(By.xpath("//label[@for='Color_s-White%20%26%20Blue']")).click();
	  
	  WebElement pricerange = driver.findElement(By.xpath("//a[@data-key='Price|Price']"));
	  System.out.println(pricerange.getText() + " filter one");
	  WebElement colorselected = driver.findElement(By.xpath("//a[@data-key='Color_s|Color']"));
	  System.out.println(colorselected.getText() + " filter two");
	  
	  WebElement firstproduct = driver.findElement(By.xpath("//div[@class='clearfix row-disc']"));
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(firstproduct).perform();
	  

	   driver.findElement(By.xpath("//div[contains(@class,'center quick-view-bar')]")).click();
	   
	   WebElement price = driver.findElement(By.xpath("//span[@class='payBlkBig']"));
	   System.out.println(price.getText() + " price after discuount");
	
	   WebElement discount = driver.findElement(By.xpath("//span[@class='percent-desc ']"));
	   System.out.println(discount.getText() + " price after discuount");
	   
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snap/snapdeal.png");
		FileUtils.copyFile(source, dest);
		driver.close(); 
}
}

