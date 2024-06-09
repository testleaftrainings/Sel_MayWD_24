package week3.day3;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnExplicitWait {

	public static void main(String[] args) {
		
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		
         //Load the URL
		driver.get("https://leafground.com/waits.xhtml");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Instantiate the WebDriverWait class
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		
		//Write the explicit for the element to be clickable
		WebElement firstElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click']")));
		
		//Click the element
		firstElement.click();
		
		//Write the explicit for the element to be visible
	      WebElement until = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		
	    //Check whether the element is displayed or not
	      boolean displayed = until.isDisplayed();
	      System.out.println(displayed);
		
		
	}

}
