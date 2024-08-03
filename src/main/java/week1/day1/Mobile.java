package week1.day1;

public class Mobile {
	
	public void makeCall( ) {
		String mobileModel="Apple";
		float mobileWeight = 30.1f;
		System.out.println("Mobile Model"+mobileModel);
		System.out.println("Mobile Weight"+mobileWeight);
	}
	
	public void sendMsg() {
		boolean isFullCharged=true;
		int mobileCost=70000;
		System.out.println("Charge Status"+isFullCharged);
		System.out.println("Mobile Cost"+mobileCost);
	}

	public static void main(String[] args) {
		
		System.out.println("This is my Mobile");
		Mobile obj =new Mobile();
		obj.makeCall();
		obj.sendMsg();
		

	}

}
