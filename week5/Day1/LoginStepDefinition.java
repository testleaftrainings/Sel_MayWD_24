package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import hooks.HooksImplementation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginStepDefinition  {
	public ChromeDriver driver;
	@Given("Launch the browser")
	public void launchBrowser() {
		driver =new ChromeDriver();
		driver.manage().window().maximize();

	}

	@And("Load the url")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}
	
   @And("Enter the username as {string}")
	public void enterUsername(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
}
	@And("Enter the password as {string}")
	public void enterPassword(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);
}
	
	@When("Click the login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		}
	@Then("It should navigate to the welcome page")
	public void navigateToNextPage() {
	String text = driver.findElement(By.xpath("//h2[text()='Welcome ']")).getText();
    if (text.contains("Welcome")) {
		System.out.println("Navigate to the welcome page");
	}
	
	else {
		System.out.println("Not logged in successful");
	}
		}
	
	@But("It should gives error message")
	public void it_should_gives_error_message() {
	  
		String text2 = driver.findElement(By.xpath("//p[contains(text(),'Errors Occurred')]")).getText();
		if (text2.contains("Errors")) {
			System.out.println("Error message displayed");
		}
		
		else {
			System.out.println("Error message not displayed");
		}
		
 }
	}
