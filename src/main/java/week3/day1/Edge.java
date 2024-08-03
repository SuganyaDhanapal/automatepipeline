package week3.day1;

public class Edge extends Browser {
	public void readerMode() {
		System.out.println("readermode edge");
	}
	public void fullScreenMode() {
		System.out.println("full screen mode  edge");
	}
	
	public static void main (String[] args) {
		
		Edge ed = new Edge();
		ed.readerMode();
		ed.fullScreenMode();
		ed.openurl();
		ed.closeBrowser();
		ed.navigateBack();
	}

}
