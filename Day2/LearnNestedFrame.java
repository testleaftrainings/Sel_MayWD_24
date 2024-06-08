package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {

	public static void main(String[] args) {
		
	      //Launch Chrome Browser	
          ChromeDriver driver=new ChromeDriver();
		
		  //Load the url
		   driver.get("https://www.leafground.com/frame.xhtml");
		
		  //maximize the window
		  driver.manage().window().maximize();
		
		  //Add implicit wait
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//enter into the parent frame by webelement
		
		//WebElement frameElement = driver.findElement(By.xpath(" //h5[contains(text(),'Inside Nested frame')]/following::iframe"));
		
		//driver.switchTo().frame(frameElement);
		
		//enter into the parent frame by index
		driver.switchTo().frame(2);
		
		//enter into the nested frame
		driver.switchTo().frame("frame2");
		
		driver.findElement(By.id("Click")).click();
		
		//Transfer the driver focus to immediate parent frame
		driver.switchTo().parentFrame();
		
		
		//Transfer the driver focus to main page
		driver.switchTo().defaultContent();
		
			
	}

}
