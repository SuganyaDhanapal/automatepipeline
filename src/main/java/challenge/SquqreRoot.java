package challenge;

public class SquqreRoot {

	public static void main(String[] args) {
		int x = 4;
		double s = squareRoot(x);
		System.out.println("Square root of " + x + " is " + (int) Math.floor(s));

		x = 8;
		s = squareRoot(x);
		System.out.println("Square root of " + x + " is " + (int) Math.floor(s));
	}

	static double squareRoot(int x) {
		double sr = x / 2;
		double temp;
		do {
			temp = sr;
			sr = (temp + x / temp) / 2;
		} while (temp - sr != 0);
		return sr;
	}

}
