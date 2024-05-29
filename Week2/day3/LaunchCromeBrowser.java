package week2.day3.polymorphism;

public class LaunchCromeBrowser extends LaunchEdgeBrowser{
	
	
	public void launchBrowser() {
		System.out.println("Chrome browser launched successfully");

	}
	
	
	public static void main(String[] args) {
		LaunchCromeBrowser crm=new LaunchCromeBrowser();
		crm.launchBrowser();
		
		LaunchEdgeBrowser edge=new LaunchEdgeBrowser();
		edge.launchBrowser();
		
	}
	

}
