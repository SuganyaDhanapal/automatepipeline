package week1.day2;
import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {

		int arr[] = { 1, 4,3,2,8, 6, 7 };
		Arrays.sort(arr);
		for (int i=0; i<arr.length;i++) {
			if (arr[i]!=i+1) {
				System.out.println("MissingNumber"+(i+1));
				break;
			}
		}
	}
}
