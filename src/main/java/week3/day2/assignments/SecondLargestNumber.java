package week3.day2.assignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 2, 11, 4, 6, 7);
		Collections.sort(list);
		
		System.out.println(list.get(list.size() - 2));
	}

}
