package Marathon3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	
		
		public RemoteWebDriver driver ;
		public String fileName;
		public WebDriverWait wait;
		@Parameters({"browser","url","username","password"})
		@BeforeMethod
		public void preCondition(String browser,String url,String uName,String pWord) {
			
			if (browser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("edge")) {
				driver=new EdgeDriver();
			}	
			else if(browser.equalsIgnoreCase("firefox")) {
				driver=new FirefoxDriver();
			}
	
	
	
			
			driver.manage().window().maximize();
			driver.get(url);
			//options.addArguments("--disable-notifications");
			 wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uName);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pWord);
			driver.findElement(By.xpath("//input[@id='Login']")).click();
			
		}
		

		@DataProvider(indices= 1)
		public String[][] sendData() throws IOException { 
			
			return ReadExcelDataIntegration.readExcel(fileName);
	         

		}
		
		@AfterMethod
		public void postCondition() {
			driver.quit();

		}

}
