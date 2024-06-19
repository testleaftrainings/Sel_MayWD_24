package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage enterUsername() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesmanager");
         return this;
	}
	
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
        return this;
	}
	
	public WelcomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
        return new WelcomePage();
	}

}
