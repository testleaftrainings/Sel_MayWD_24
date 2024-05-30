package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinks {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//using tagname to get the links
		
		//using findElements to get the List of WebElements
		
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		
		int linkSize = totalLinks.size();
		
		System.out.println("Size of links: "+linkSize);
		
		
		//Creating empty list
		List<String> links=new ArrayList<String>();
		
		for (int i = 0; i < linkSize; i++) {
			String text = totalLinks.get(i).getText();
			
			links.add(text);
			
		}
		
		System.out.println(links);
		
		//Sorted order
		Collections.sort(links);
		System.out.println(links);
		
		}

}
