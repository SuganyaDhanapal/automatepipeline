package challenge;

public class FindMajorityNumber {

	static void findMajority(int arr[], int n) {
		int maxcount = 0;
		int index = -1;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			if (count > maxcount) {
				maxcount = count;
				index = i;
			}

		}
		if (maxcount > n / 2)
			System.out.println("Majority number "+arr[index]);
		else
			System.out.println("no majaority Element");
	}

	public static void main(String[] args) {
		int arr1[] = { 3, 2, 3 };
		int n = arr1.length;
		findMajority(arr1, n);
		
		int arr2[] = { 2, 2, 1, 1, 1, 2, 2 };
		int n1 = arr1.length;
		findMajority(arr2, n1);
	}

}
