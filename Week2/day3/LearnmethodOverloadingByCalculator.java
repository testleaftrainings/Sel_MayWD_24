package week2.day3.polymorphism;

public class LearnmethodOverloadingByCalculator {
	
	//add functionality of calculator
	
	
	public void add(int num1,float num2) {
		
		System.out.println(num1+num2);
	}
	
	
	public void add(int num1,int num2) {
		System.out.println(num1+num2);
		
	}
	
	
    public void add(int num1,int num2,int num3) {
    	System.out.println(num1+num2+num3);
		
	}
    
    
public void add(float num1,float num2) {
		
	System.out.println(num1+num2);
	}

public static void main(String[] args) {
	LearnmethodOverloadingByCalculator calc=new LearnmethodOverloadingByCalculator();
	
	calc.add(4.5F, 5.5F);
	calc.add(7, 1.5F);
	calc.add(10, 10);
	calc.add(12, 12, 6);
}

	
	}
