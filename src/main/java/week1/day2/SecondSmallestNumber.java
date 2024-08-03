package week1.day2;

import java.util.Arrays;

public class SecondSmallestNumber {

	public static void main(String[] args) {

		int arr[] = { 23, 45, 67, 32, 89, 22 };
		Arrays.sort(arr);
		System.out.println("Second Smallest Number " + arr[1]);

	}

}
