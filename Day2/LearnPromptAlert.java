package week3.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnPromptAlert {

	public static void main(String[] args) throws InterruptedException {
		        
		        //Open Chrome Browser
				ChromeDriver driver=new ChromeDriver();
				
				//Load the url
				driver.get("https://www.leafground.com/alert.xhtml");
				
				//maximize the window
				driver.manage().window().maximize();
				
				//Click the show button
				driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
				
			   //Transfer the driver focus to alert box	
			   Alert promptAlert = driver.switchTo().alert();
			
			   //Passing the value in text field in alert box
			   promptAlert.sendKeys("Vineeth Rajendran");
			
			   //Accept the alert
			   promptAlert.accept();
			
			
	}

}
