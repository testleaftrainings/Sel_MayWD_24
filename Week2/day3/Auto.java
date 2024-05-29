package week2.day3;

public class Auto extends Vehicle {
	
	public void applyGear() {
		System.out.println("Apply Gear1");

	}
	
	
	public void autoNumber() {
		System.out.println("56432");

	}
	
	public static void main(String[] args) {
		
		Auto at=new Auto();
		at.autoNumber();
		at.applyBrake();
		at.soundHorn();
		
		}

}
