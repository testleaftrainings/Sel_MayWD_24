package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class WelcomePage extends ProjectSpecificMethods {
	
public WelcomePage verifyLogin() {
		String verifyLogin = driver.findElement(By.xpath("//h2[text()='Welcome ']")).getText();
if (verifyLogin.contains("Welcome")) {
	System.out.println("Login succesful");
}

else {
	System.out.println("Not logged in");
}
return this;
	}
	
	public MyHomePage clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();

	}

}
