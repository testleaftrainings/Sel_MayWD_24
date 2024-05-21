package week1.day2;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class LearnOperators {
	
	//Opertors in java
	//Arithmetic Operator - add, sub, mul, div, mod
	//Logic Operator      - and & or
	//Comparison operator - ==, <= , >=, !=
	//Increment & Decrement operator
	//Assignment Operator
	

	public static void main(String[] args) {
		//Assignment Operator
		
		int a=5;
	    System.out.println(a);
	    
	    a+=7;   //  a=a+7
	    
	    System.out.println(a);
	    
	    a-=3;   //a=a-3
	    System.out.println(a);
	    
	    a*=2;
	    System.out.println(a);
	    
	    a/=3;
	    
	    System.out.println(a);
	    
	    
	    System.out.println("-----------------");
	    
	    
	    //Arithmetic Operator
	    
	    //add
	    
	    int b=20;
	    int c=8;
	    System.out.println(b+c);
	    
	    
	    //Sub
	    System.out.println(b-c);
	    
	    //mul
	    System.out.println(b*c);
	    
	    //div
	    System.out.println(b/c);   //returns the quotient
	    
	    //mod   returns the remainder the operation
	    System.out.println(b%c);   
	    
	    System.out.println("----------------");
	    
	    //Comparison operator
	    // ==, <= , >=, !=
	    int s =12;
	    int m= 11;
	    System.out.println(s==m);
	    System.out.println(s<=m);
	    System.out.println(s>=m);
	    System.out.println(s!=m);
	    
	    System.out.println("----------------");
	    //Logical operator
	    //&&   ||
	    
	    System.out.println(s<=m && s>=m);
	    System.out.println(s<=m || s>=m);
	    
	    System.out.println("=============");
	    
	    //Increment and Decrement operator
	    // pre increment & post increment
	    // pre decrement & post decrement
	    
	    int p=7;
	    System.out.println(p++);
	    System.out.println(p);
	    System.out.println(++p);
	    System.out.println(p--);
	    System.out.println(p);
	    System.out.println(--p);
	    System.out.println(p);
	    
	    
	    
	    		
		
		
		

	}

}
