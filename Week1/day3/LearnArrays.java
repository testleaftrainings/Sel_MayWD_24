package week1.day3;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		
		
		//Store the same kind of data in a single variable
	
		
		
		//Exception in Array
		//ArrayIndexOutOfBoundsException
		
		
		//Declaration of Arrays
		//Using Array literal & Using Instantiation
		
		
		//Using array Instantiation
	
		 int[] num=new int[5];  
		 num[0]=80;   
		 num[1]=78;    
		 num[2]=90;    
		 num[3]=67;    
		 num[4]=80;    
		
		 
		 
		 
		     //Using array Literal      
			
		     //index         0   1 2  3  4     //index ends with length-1
			 int scores[]= {80,78,90,67,80};  //5
			 
			 //To get the length
			 //To store it in a local variable -> type ctrl+2 - Press L separately
			 int length = scores.length;
			 System.out.println("The length of the array is "+length);
			 
			 
			 //To retrieve the value 90
			 
			 System.out.println("The second index value "+scores[2]);
			 
			 
			 //Sorting    sorted in ascending order 67,78,80,80,90
			 
			 Arrays.sort(scores);
			 
			 
			 //To retrieve the Least score
			 System.out.println("The least value "+scores[0]);
			 
			 //To retrieve the Highest value
			 System.out.println("The highest value "+scores[length-1]);
			 
			 
			 //To retrieve all the values in array -> use for loop
			 
			 for (int i = 0; i < scores.length; i++) {
			 System.out.println("The array values are "+scores[i]);	
			  }
			 
			 
		}

}
