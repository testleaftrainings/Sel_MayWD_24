package week2.day3;

public class Car extends Vehicle {
	

	public void applyGear() {
		System.out.println("Apply Gear2");

	}
	
	public static void main(String[] args) {
		Car obj=new Car();
		obj.applyGear();
		obj.applyBrake();
		obj.soundHorn();
	
	}
	
}
