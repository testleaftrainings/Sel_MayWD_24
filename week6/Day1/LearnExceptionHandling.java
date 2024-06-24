package week6.day1;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		// Exceptions
		
		//NoSuchElementException
		//ArrayIndexOutOfBoundException
		//NullPointerException
		//InvalidSelectorException
		
		
		int x=10;
		int y=10;
		
		int[] number= {7,14,21};  //0  1   2
		
		
		try {
			System.out.println(x/y);  // 10/2
			
		} 
		
		catch (ArithmeticException e) {
			
			if (y==0) {
				System.out.println(x/1);
			}
		}
		
		try {
			
			System.out.println(number[3]);
		}
		
		finally {
			
			System.out.println(100);
		}
		
		
		

	}

}
