package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;
import pages.WelcomePage;

public class TC001_LoginFunctionality extends ProjectSpecificMethods{
	
	
	@Test
	public void runLogin() {
		LoginPage lp=new LoginPage();
          lp.enterUsername().enterPassword().clickLogin().verifyLogin();
          
          
          }
	
}
