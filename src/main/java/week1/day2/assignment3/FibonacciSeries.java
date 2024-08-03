package week1.day2.assignment3;

public class FibonacciSeries {

	public static void main(String[] args) {
		int firstNum = 0;
		int secondNum = 1;
		int range = 8;
		System.out.print("input(range): " + range);
		System.out.print(" output: " + firstNum + ", " + secondNum);

		for (int i = 3; i <= range; i++) {
			int sum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;
			System.out.print(", " + sum);
		}

	}

}
