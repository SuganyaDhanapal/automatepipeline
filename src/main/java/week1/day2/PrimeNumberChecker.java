package week1.day2;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		int num = 97;
		boolean isPrime = num != 0;

		if (num > 3) {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		if (isPrime)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
	}

}
