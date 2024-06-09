package week3.day1;

public final class LearnFinal1 {
	
	public final void finalMethod() {
		System.out.println("Final method");

	}
	
	
	public static void main(String[] args) {
		
		
		int number=21;
		
		final int num=7;
		
		number=number+20;
		
		//num=num+20;
		//Final variable cannot be changed
		 System.out.println(number);

	}

}
