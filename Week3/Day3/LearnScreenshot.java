package week3.day3;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshot {

	public static void main(String[] args) throws IOException {
		
		  //Launch Chrome Browser
            ChromeDriver driver=new ChromeDriver();
		
		  //Load the url
		    driver.get("https://leafground.com/waits.xhtml");
		
		  //maximize the window
	        driver.manage().window().maximize();
	      
	      //To add implicit wait
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      
	      //To take the screenshot of entire page
	      
	      //There are three steps to do
	      
	      //Step1: use getScreenshot method to assign the output type
	        File source = driver.getScreenshotAs(OutputType.FILE);
	      
	      //Step2: Add the destination path of the file
	        File destination=new File("./snap/framepage.png");
	    
	      //Step3: Use copyFile method to connect source with destination
	        FileUtils.copyFile(source, destination);
	      
	      //To take the screenshot of a WebElement
	        
	      //Find the element in the dom page and assign it to variable
	      WebElement iAmAboutHideWE = driver.findElement(By.xpath("//span[text()='I am about to hide']"));
	      
	      //Step:1 Use the element variable in getScreenshot method
          File source1 = iAmAboutHideWE.getScreenshotAs(OutputType.FILE);
	      
	      //Step2:Add the destination path of the file
	      File destination1=new File("./snap/iAmAboutHideWE.png");
	      
	      //Step3: Use copyFile method to connect source with destination
	      FileUtils.copyFile(source1, destination1);
	      
	   }

}
