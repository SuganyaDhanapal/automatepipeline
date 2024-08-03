package week3.assignments.four;

public class LoginTestData1 extends TestData {
	
	public void enterUsername() {
		
		System.out.println("entered User name 1");
		
	}
public void enterPassword() {
		
		System.out.println("entered Password1");
		
	}

public static void main(String[] args) {
	LoginTestData1 name = new LoginTestData1();
	name.enterCredentials();
	name.navigateToHomePage();
	name.enterUsername();
	name.enterPassword();
}

}
