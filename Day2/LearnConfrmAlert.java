package week3.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnConfrmAlert {

	public static void main(String[] args) throws InterruptedException {
		
		//Open Chrome Browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://www.leafground.com/alert.xhtml");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//Click the show button
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		
		//Transfer the driver focus to alert
		Alert confirmAlert = driver.switchTo().alert();
		
	    //Getting text from the alert
		String confirmAlertText = confirmAlert.getText();
		System.out.println(confirmAlertText);
		
		//Dismiss the alert
		confirmAlert.dismiss();
		
	}

}
