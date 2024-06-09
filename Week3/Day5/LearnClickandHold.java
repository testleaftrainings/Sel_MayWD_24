package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnClickandHold {

	public static void main(String[] args) {
		 //Launch Chrome Browser
        ChromeDriver driver=new ChromeDriver();
		
		//Load the URL
		  driver.get("https://jqueryui.com/selectable/");
		
		//Maximize the window
	      driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Switch to frame
		driver.switchTo().frame(0);
		
		//Find Element 1:
		WebElement element1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		
		//Find Element 2:
		WebElement element2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		
		//Instantiate the Actions Class
		Actions act=new Actions(driver);
		
		//To perform multiple selection
		act.clickAndHold(element1).clickAndHold(element2).perform();
		
       }

}
