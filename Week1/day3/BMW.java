package week1.day3;

public class BMW {
	
	public void applyBrake() {
	System.out.println("Apply brake");

	}

	

	public static void main(String[] args) {
		//Create object for Car class in BMW class
		Car obj=new Car();
		obj.carColour();
		BMW obj1=new BMW();
		obj1.applyBrake();

	}

}
