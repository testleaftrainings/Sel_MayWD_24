package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {
	
	    public static void main(String[] args) {
		
	    //Launch Chrome Browser
        ChromeDriver driver=new ChromeDriver();
		
		//Load the url
		  driver.get("https://leafground.com/window.xhtml");
		
		//Maximize the window
	      driver.manage().window().maximize();
		
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//Use getWindowHandle method to get the address of current opened window
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		//To click the open button
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		//driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		//To getTitle of the parent window
		String parentTitle = driver.getTitle();
		System.out.println("Parent: "+parentTitle);
		
		//use getWindowHandles to get the address of all opened window
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		//To interact with element in the child window
		//WebElement findElement = driver.findElement(By.xpath("//span[text()='Hari Radhakrishnan']"));
		//System.out.println(findElement.getText());
		
		//Convert set into list
		List<String> allWindows=new ArrayList<String>(windowHandles);
		
		//switch to child window
		driver.switchTo().window(allWindows.get(1));
		
		//To get the title of the child window
		String childTitle = driver.getTitle();
		System.out.println("Child:"+childTitle);
		
		//To close the current opened window
		driver.close();
		
		//To switch the driver focus to the parent
		driver.switchTo().window(allWindows.get(0));
		
		//To get the title of the parent window
		String title2 = driver.getTitle();
		System.out.println("Parent:"+title2);
		
		}

}
