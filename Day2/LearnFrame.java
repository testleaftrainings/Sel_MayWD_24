package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		
		//Launch Chrome Browser
         ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		  driver.get("https://www.leafground.com/frame.xhtml");
		
		//maximize the window
	      driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Transfer the driver focus to frame 1
		driver.switchTo().frame(0);
		
		//Click the click button
		driver.findElement(By.id("Click")).click();

	}

}
