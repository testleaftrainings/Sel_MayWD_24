package week3.day1;

public class StaticHierarchy {
	
	public static void staticMethod() {
		System.out.println("Its from static method");

	}
	
	public void nonStaticMethod() {
		System.out.println("Its from non static method");

	}
	
	static {
		System.out.println("Its from static block");
	}
	
	{
		System.out.println("Its from non static block");
	}
	
	

	public static void main(String[] args) {
		StaticHierarchy sh=new StaticHierarchy();
		System.out.println("Its from main");
		staticMethod();
		sh.nonStaticMethod();
		

	}

}
