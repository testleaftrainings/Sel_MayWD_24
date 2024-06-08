package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSimple {

	public static void main(String[] args) throws InterruptedException {
		
		//Open Chrome Browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://www.leafground.com/alert.xhtml");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Click on the show button
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		
		
		//Transfer driver focus to alert
		Alert simpleAlert = driver.switchTo().alert();
		
		//Accept the alert
		simpleAlert.accept();
		
		}

}
