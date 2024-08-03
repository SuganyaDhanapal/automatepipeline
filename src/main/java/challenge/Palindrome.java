package challenge;

public class Palindrome {

	public static boolean palindrome(String word) {
		String trimmed = word.replaceAll("[ ,:]","");
		String reversed = "";
		int len = trimmed.length();

		char[] allChars = trimmed.toCharArray();
		for (int i = len - 1; i >= 0; i--) {
			reversed += allChars[i];
		}
		if (trimmed.equalsIgnoreCase(reversed)) {

			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: panama";
		String s1 = "race a car";
		String s2 = "";

		if (palindrome(s)) {
			System.out.println(s + " is palindrome");
		} else {
			System.out.println(s + " is not palindrome");
		}
		if (palindrome(s1)) {
			System.out.println(s1 + " is palindrome");
		} else {
			System.out.println(s1 + " is not palindrome");
		}
		if (palindrome(s2)) {
			System.out.println(s2 + " is palindrome");
		} else {
			System.out.println(s2 + " is not palindrome");
		}

	}

}
