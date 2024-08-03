package challenge;

public class HappyNumber {

	static boolean isHappyNumber(int num) {
		while (num > 9) {
			int sum = getSquareSum(num);
			num = sum;
		}
		if (num == 1) {
			return true;
		} else {
			return false;
		}
	}

	static int getSquareSum(int num) {
		int val = 0;
		while (num != 0) {
			int dig = num % 10;
			val += dig * dig;
			num /= 10;
		}

		return val;
	}

	public static void main(String[] args) {
		int num1 = 19;
		if (isHappyNumber(num1)) {
			System.out.println(num1 + " is Happy number");
		} else {
			System.out.println(num1 + " is not Happy number");
		}
		int num2 = 2;
		if (isHappyNumber(num2)) {
			System.out.println(num2 + " is Happy number");
		} else {
			System.out.println(num2 + " is not Happy number");
		}
	}

}
