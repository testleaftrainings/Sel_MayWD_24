package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class LeadsPage extends ProjectSpecificMethods {
	
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
return new CreateLeadPage();
	}
	

}
