package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

public class LearnXpath {

	public static void main(String[] args) throws InterruptedException {
	    //Launch the browser
		  ChromeDriver driver=new ChromeDriver();
	
	    //To launch edge browser
	      EdgeDriver driver1=new EdgeDriver();
	
	    //To load the url
          driver.get("http://leaftaps.com/opentaps/control/main");
		
        //To maximise the window
	      driver.manage().window().maximize();
	
	    //Add implicit wait
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	 	// Locate the username text field
	       driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		
	    // enter the password in the password field
		   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		// Click on the Login button
		   driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
		
		
		
		

	}

}
