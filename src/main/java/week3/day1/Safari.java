package week3.day1;

public class Safari extends Browser {
	public void takeSnap() {
		System.out.println("takesnap safari");
	}
	public void clearCookies() {
		System.out.println("clear cookies safari");
	}
	
	public static void main (String[] args) {
		
		Safari sfr = new Safari();
		sfr.takeSnap();
		sfr.clearCookies();
		sfr.openurl();
		sfr.closeBrowser();
		sfr.navigateBack();
	}
}
