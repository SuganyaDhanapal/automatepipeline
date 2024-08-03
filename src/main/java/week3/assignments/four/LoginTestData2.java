package week3.assignments.four;

public class LoginTestData2 extends TestData{
public void enterUsername() {
		
		System.out.println("entered User name 2");
		
	}
public void enterPassword() {
		
		System.out.println("entered Password2");
		
	}

public static void main(String[] args) {
	LoginTestData2 name = new LoginTestData2();
	name.enterCredentials();
	name.navigateToHomePage();
	name.enterUsername();
	name.enterPassword();
}

}
