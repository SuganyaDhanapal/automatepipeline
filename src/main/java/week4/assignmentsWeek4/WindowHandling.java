package week4.assignmentsWeek4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>(windowHandles);

		driver.switchTo().window(handles.get(1));
		String childtitle = driver.getTitle();
		System.out.println("childwindow " + childtitle);

		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		Thread.sleep(1000);
		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String> handles3 = new ArrayList<String>(windowHandles3);

		driver.switchTo().window(handles3.get(0));
		String childtitle3 = driver.getTitle();
		System.out.println("childwindow " + childtitle3);

		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> handles2 = new ArrayList<String>(windowHandles2);

		driver.switchTo().window(handles2.get(1));
		String childtitle2 = driver.getTitle();
		System.out.println("childwindow " + childtitle2);

		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();
		Set<String> windowHandles4 = driver.getWindowHandles();
		List<String> handles4 = new ArrayList<String>(windowHandles4);

		driver.switchTo().window(handles2.get(0));
		String childtitle4 = driver.getTitle();
		System.out.println("childwindow " + childtitle4);

		driver.findElement(By.linkText("Merge")).click();
		Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		simpleAlert.accept();
		Thread.sleep(2000);
		Set<String> windowHandles5 = driver.getWindowHandles();
		List<String> handles5 = new ArrayList<String>(windowHandles5);

		driver.switchTo().window(handles2.get(0));
		String childtitle5 = driver.getTitle();
		System.out.println("childwindow " + childtitle5);
		driver.quit();

	}

}
