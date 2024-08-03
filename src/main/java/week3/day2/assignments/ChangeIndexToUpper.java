package week3.day2.assignments;

public class ChangeIndexToUpper {

	public static void main(String[] args) {
		String test = "changeme";
		char[] charArray = test.toCharArray();
		for (int i = charArray.length - 1; i >= 0; i--) {
			boolean isOdd = i % 2 == 1;
			if (isOdd) {
				charArray[i] = Character.toUpperCase(charArray[i]);
			}
		}
		
		String result = new String(charArray);
		System.out.println(result);
	}

}
