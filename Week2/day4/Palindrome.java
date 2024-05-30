package week2.day4;

public class Palindrome {
	
	
	//What is palindrome
	//What are the requirements -variables
	
	//Logic
	
	// 12121        12121%10  =1         12121%10       
    // 1212         1212%10   =2
	// 121          121%10   =1
	// 12           12%10   =2
	// 1            1%10  =1
	public static void main(String[] args) {
		int input=12121;
		int output=0;
		int remainder;
		int temp=input;
		
		while(input>0) {
			
			remainder=input%10;            //rem =12121%10 =1      //1212%10=2   //121%10=1        //12%10=2                      //1%10=1
			
			output=(output*10)+remainder;  //out (0*10)+1  =1      //(1*10)+2=12  //(12*10)+1=121  //(121*10)+2=1210+2=1212       //(1212*10)+1=12120+1=12121
			
			input=input/10;                //12121/10      =1212   //1212/10 =121  //121/10=12     //12/10=1                      //1/10=0
			
		}
		
		//output at final iteration=12121
		//input at final iteration=0
		//temp=12121
		if (temp==output) {
			System.out.println("It a palindrome");
		}
		else {
			System.out.println("It nots a palindrome");
		}

	}

}
