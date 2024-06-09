package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragAndDrop {

	public static void main(String[] args) {
		 //Launch Chrome Browser
        ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		  driver.get("https://jqueryui.com/droppable/");
		
		//Maximize the window
	      driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Switch to frame
		driver.switchTo().frame(0);
		
		//Find the Source element
		WebElement source = driver.findElement(By.id("draggable"));
		
		//Find the target the element
		WebElement target = driver.findElement(By.id("droppable"));
		
		
		//Instantiate the Actions Class
		Actions act=new Actions(driver);
		
		//To perform dragAndDrop
		act.dragAndDrop(source, target).perform();
		
		}

}
