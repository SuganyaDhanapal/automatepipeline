package challenge;

public class DistinctElementTwo {

	static boolean isNumberMatches(int[] nums, int k) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+ 1; j < nums.length; j++) {
				if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
					return true;
				} 
			}

		}

		return false;
	}

	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 1 };
		int k = 3;
		System.out.println(isNumberMatches(number, k));

		int[] number2 = { 1, 0, 1, 1 };
		int k2 = 1;
		System.out.println(isNumberMatches(number2, k2));
		
		int[] number3 = { 1, 2, 3, 1, 2, 3 };
		int k3 = 2;
		System.out.println(isNumberMatches(number3, k3));
	}

}
