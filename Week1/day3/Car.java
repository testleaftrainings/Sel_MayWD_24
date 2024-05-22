package week1.day3;

public class Car {
	
	
	public void carName() {
		
		System.out.println("Audi");
	}
	
	
	public String carColour() {
		
		return "Black";
		
		}
	 
	
	public int noOfSeats() {
		return 7;

	}
	
	
	
	public boolean isAttractive() {
		
		return true;

	}
	
	
	public static void main(String[] args) {
		
		//Syntax for creating object
		//ClassName objectName=new ClassName();
		
		Car obj=new Car();
		obj.carName();
		System.out.println(obj.carColour());
		System.out.println(obj.isAttractive());
		System.out.println(obj.noOfSeats());
		
	}
	
}
