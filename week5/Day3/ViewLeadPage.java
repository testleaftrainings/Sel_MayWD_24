package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
	
	public void verifyLeads() {
		String leadFirstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (leadFirstName.equals("Vineeth")) {
			System.out.println("Lead is created");
		}
		
		else {
			System.out.println("Lead not created");
		}

	}
	
}
