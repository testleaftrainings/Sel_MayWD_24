package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeaftapCreateLead {

	public static void main(String[] args) {
        
		
		//Launch the browser
		  ChromeDriver driver=new ChromeDriver();
		
		//Load the url
	      driver.get("http://leaftaps.com/opentaps/control/main");
		
	      //Maximize the window
	    driver.manage().window().maximize();
		
		//Enter username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		

		//Click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click crmsfa
	    driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click leads
		driver.findElement(By.linkText("Leads")).click();
		
		//click create lead button
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//Enter first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");
		
		//Enter last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
		
		
	    //To handle the dropdown
		
		//By Index
		
	   WebElement dropdown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
	   //Instantiate Select class
	   Select sel1=new Select(dropdown1);
	
	   sel1.selectByIndex(1);
	
	   //By value
	
	   WebElement dropdown2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	
	   Select sel2=new Select(dropdown2);
	
	   sel2.selectByValue("CATRQ_CARNDRIVER");
	
	
	  //By text
	
	
	    WebElement dropdown3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
	
		Select sel3=new Select(dropdown3);
		
		sel3.selectByVisibleText("Health Care");
		
		//Click create lead submit button
		driver.findElement(By.name("submitButton")).click();
		
	}

}



