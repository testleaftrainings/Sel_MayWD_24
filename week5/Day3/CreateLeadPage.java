package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {
	
	
	public CreateLeadPage enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        return this;
	}
	public CreateLeadPage enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vineeth");
         return this;
	}
	public CreateLeadPage enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajendran");
      return this;
	}
	public ViewLeadPage clickSubmitButton() {
		driver.findElement(By.name("submitButton")).click();
        return new ViewLeadPage();
	}
	
}
