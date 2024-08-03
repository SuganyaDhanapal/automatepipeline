package challenge;

public class UniqueNumberFinder {

	public static void main(String[] args) {
		int[] arr1 = { 2, 2, 1 };
		findUnique(arr1);
		int[] arr2 = { 4, 1, 2, 1, 2 };
		findUnique(arr2);
		int[] arr3 = { 1 };
		findUnique(arr3);
	}

	static void findUnique(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean isUnique = true;
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					isUnique = false;
					break;
				}
			}
			if (isUnique) {
				System.out.println(arr[i] + " is unique");
			}
		}
	}

}
