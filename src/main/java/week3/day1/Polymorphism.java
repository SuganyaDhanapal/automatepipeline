package week3.day1;



public class Polymorphism {
	
	public void reportStep(String msg, String status) {
		System.out.println(msg + " "+ status);
	}

	public void reportStep
	
	(String msg, String status, boolean snap) {
		System.out.println(msg);
		System.out.println(status);
		System.out.println(snap);
	}

	public static void main(String[] arg) {
		Polymorphism plm = new Polymorphism();
		plm.reportStep("Hello", "new");
		plm.reportStep("Helo", "new", true);
	}

}

