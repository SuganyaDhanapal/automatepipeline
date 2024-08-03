package oops;

public class Car extends Vehicle {
	
	public void applyBrake() {
		if (brakeType == "Drum") {
			System.out.println("Applying drum brakes");
		} else {
			System.out.println("Applying normal brakes");
		}
	}
	
	@Override public void applyClutch() {
		super.applyClutch();
		System.out.println("Applying Car Clutch");
	}
}
