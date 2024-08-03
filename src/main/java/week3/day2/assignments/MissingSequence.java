package week3.day2.assignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingSequence {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 10, 6, 8);
		Collections.sort(list); // 1, 2, 3, 4, 6, 8, 10
		for (Integer item : list) {
			int curIndex = list.indexOf(item);
			if (curIndex < list.size() - 1) {
				int nextItem = list.get(curIndex + 1);
				if (item + 1 != nextItem) {
					System.out.println(item + 1);
				}
			}
		}
	}

}
