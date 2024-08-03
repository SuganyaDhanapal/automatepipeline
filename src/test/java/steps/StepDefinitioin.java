package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitioin {
	
	public ChromeDriver driver;

@Given("Launch the Browser")
public void launchBrowser() {
	driver = new ChromeDriver();
}



@And("Load the url")
public void loadURL() {
	driver.get("http://leaftaps.com/opentaps/control/main");
}

@And("Enter the username as {string}")
public void enterUsername(String uName) {
	driver.findElement(By.id("username")).sendKeys(uName);

}

@And("Enter the password as {string}")
public void enterPassword(String pWord) {
	driver.findElement(By.id("password")).sendKeys(pWord);
}

@When("Click on the Login button")
public void clickLoginButton() {
	driver.findElement(By.className("decorativeSubmit")).click();
}

@Then("HomePage should be displayed")
public void verifyHomePage() {

	String text = driver.findElement(By.tagName("h2")).getText();
	if (text.contains("Welcome")) {
		System.out.println("HomePage should be displayed");
	}
	else {
		System.out.println("HomePage is not displayed");
	}

}

@But("ErrorMessage should be displayed")
public void error_message_should_be_displayed() {
	String text = driver.findElement(By.id("errorDiv")).getText();
	if (text.contains("Errors")) {
		System.out.println("Error Message is displayed");
	}
	else {
		System.out.println("Error Message is not displayed");
	}
}



}