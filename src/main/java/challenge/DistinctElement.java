package challenge;

public class DistinctElement {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 1 };
		if (distinct(arr1)) {
			System.out.println("arr1 is distinct");
		} else {
			System.out.println("arr1 is not distinct");
		}
		int[] arr2 = { 1, 2, 3, 4, };
		if (distinct(arr2)) {
			System.out.println("arr2 is distinct");
		} else {
			System.out.println("arr2 is not distinct");
		}
		int[] arr3 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		if (distinct(arr3)) {
			System.out.println("arr3 is distinct");
		} else {
			System.out.println("arr3 is not distinct");
		}
	}

	static boolean distinct(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					return false;
				}
			}
		}
		return true;
	}
}
