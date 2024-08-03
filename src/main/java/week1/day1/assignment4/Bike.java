package week1.day1.assignment4;

public class Bike {
	public void applyBreak( ) {
		System.out.println("Applied Break");
		
	}
	
	public void soundHorn( ) {
		System.out.println("Sound Horn");
	}
	
	public static void main(String[] args) {
		Car car =new Car();
		car.soundHorn();
		car.applyBreak();
		
		Bike bike = new Bike();
		bike.soundHorn();
		bike.applyBreak();
	}

}
