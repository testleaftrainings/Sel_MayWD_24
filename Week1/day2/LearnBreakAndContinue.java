package week1.day2;

public class LearnBreakAndContinue {

	public static void main(String[] args) {
		// Break-breaks the loop and comes out
		// Continue -Skips the current iteration 

		//break statement
		  for (int i = 1; i <=10; i++) 
		  { 
			  if(i==5) {
			   break; 
			  } 
			  System.out.println(i);
		  }
		 
		//continue statement	
			for (int i = 1; i <=10; i++) {
				if(i==5) {
					continue;
				}
				System.out.println(i);
			}
		
	}

}
