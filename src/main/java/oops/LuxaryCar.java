package oops;

public class LuxaryCar extends Car {
	@Override public void applyBrake() {
		super.applyBrake();
		System.out.println("Applying luxary brakes");
	}
	
	@Override public void applyClutch( ) {
		super.applyClutch();
		System.out.println("Applying luxary clutch");
	}
}
