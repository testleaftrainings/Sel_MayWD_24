package week4.day2;

import org.testng.annotations.Test;

public class LearnPriority {
	
	@Test(priority=1)    //This method will execute according to the priority given                       
	public void addReceipient() {
		System.out.println("Receipient added");

	}
	
	@Test(priority=2)   //composeMail method will execute before clickSend method as per ASCII order
	public void composeMail() {             
		System.out.println("Composed");

	}
	@Test           //Default priority value is Zero                        
	public void login() { 
		System.out.println("Logged in");
	}                                              
	@Test(priority=2)  //clickSend method will execute before composeMail method as per ASCII order.                     
	public void clickSend() {
		System.out.println("Clicked");

	}
	
	@Test(priority=-1,enabled=false)   //This method will not be executed since enabled=false
	public void addattachment() {
		System.out.println("attachment added");

	}
}
