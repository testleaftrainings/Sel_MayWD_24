package week3.day1;

public class LearnStaticKeyword {
	
	
	//Variable
	
	int num=7;
	
	static String name="India";
	
	
	public void nonStaticMethod() {
		System.out.println(num);
		System.out.println(name);

	}
	
	
	public static void staticMethod() {
		
		System.out.println(name);
	}
	
	
	static {
		//System.out.println(num);
		System.out.println(name);
		staticMethod();
		//nonStaticMethod();  //Can not call non static method
	}
	
	{
		System.out.println(num);
		System.out.println(name);
		staticMethod();
		nonStaticMethod();
	}
	
	
	
	public static void main(String[] args) {
		
		LearnStaticKeyword lsk=new LearnStaticKeyword();
		
		System.out.println(lsk.num);
		
		System.out.println(name);
		
		}
	
}
