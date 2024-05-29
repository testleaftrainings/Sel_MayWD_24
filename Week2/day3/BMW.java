package week2.day3;

public class BMW extends Car {
	
	public void carColour() {
		System.out.println("Black");

	}
	
	public static void main(String[] args) {
		BMW bm=new BMW();
		bm.carColour();
		bm.applyGear();
		bm.applyBrake();
		bm.soundHorn();
		
	}
	
	

}
