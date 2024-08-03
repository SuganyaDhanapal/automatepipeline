package week1.day2;

public class Browser {

	  String launchBrowser (String browserName){
	  
		
		System.out.println("Browser launched Successfully");
		return browserName;
	}
	 void loadUrl() {
		 
		System.out.println("Applicaiton url lodded succesfully");
		
	}
	 
	 
	 public static void main(String[] args) {
		 Browser a1=new Browser();
		 System.out.println(a1.launchBrowser("edge"));
		 a1.loadUrl();
		 
	 }

}
