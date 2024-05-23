package week1.day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		//Load the facebook application url
		
		//Launch the browser
		
		//Create an object for ChromeDriver class
		ChromeDriver driver=new ChromeDriver();
		
		
		//Load the url of facebook
		driver.get("https://www.facebook.com/");
		
		
		//Maximize the window
		driver.manage().window().maximize();
		
		
		//to get the title of page
		String titleOfPage = driver.getTitle();
		System.out.println(titleOfPage);
		
		//To close the browser
		
		//thread.sleep ->delays the execution time
		Thread.sleep(5000);
		//To close the current browser
		driver.close();
		
		
	}

}
