package week3.day2.assignments;

import java.util.Arrays;
import java.util.List;

public class ListIntersection {

	public static void main(String[] args) {
		List<Integer> firstList = Arrays.asList(3, 2, 11, 4, 6, 7);
		List<Integer> secondList = Arrays.asList(1, 2, 8, 4, 9, 7);
		
		for(Integer fe : firstList) {
			for(Integer se : secondList) {
				if (fe == se) {
					System.out.println(fe);
				}
			}
		}
	}
}
