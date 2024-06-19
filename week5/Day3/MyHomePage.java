package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	
	public LeadsPage clickLead() {
		driver.findElement(By.linkText("Leads")).click();
return new LeadsPage();
	}
	
}
