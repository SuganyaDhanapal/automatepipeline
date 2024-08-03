package week1.day2.assignment6;

public class PalindromeChecker {

	public static void main(String[] args) {

		int num = 34343;
		int reverseNum = 0;
		int tempNum = num;
		for (int i = 0; tempNum > 0; i++) {
			int reminder = tempNum % 10;
			tempNum = tempNum / 10;
			reverseNum = (reverseNum * 10) + reminder;
		}
		if (num == reverseNum) 
			System.out.println("Palindrome Number");
		else
			System.out.println("Not Palindrome Number");
	}
}
