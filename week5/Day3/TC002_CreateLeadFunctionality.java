package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;
import pages.WelcomePage;

public class TC002_CreateLeadFunctionality extends ProjectSpecificMethods{
	
	
	@Test
	public void runCreateLead() {
		LoginPage lp=new LoginPage();
          lp.enterUsername()
          .enterPassword()
          .clickLogin()
          .clickCRMSFA()
          .clickLead()
          .clickCreateLead()
          .enterCompanyName()
          .enterFirstName()
          .enterLastName()
          .clickSubmitButton()
          .verifyLeads();
          
          }
	
}
