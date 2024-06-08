package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSweetAlert {

	public static void main(String[] args) {
		//Launch Chrome browser
		ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		driver.get("https://www.leafground.com/alert.xhtml");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//Click the show button
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		
		//Dismiss the alert by normal click method
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		}

}
