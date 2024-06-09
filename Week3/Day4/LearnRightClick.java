package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnRightClick {

	public static void main(String[] args) {
		 //Launch Chrome Browser
        ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		  driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		//Maximize the window
	      driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//Find the element
		WebElement rightClickElement = driver.findElement(By.xpath("//span[text()='right click me']"));
		
        //Instantiate the Actions Class
		Actions builder=new Actions(driver);
		
		//To perform the Right click action
		builder.contextClick(rightClickElement).perform();
	
	}

}
