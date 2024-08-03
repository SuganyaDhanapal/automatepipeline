package challenge;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class NonRepeatingCharFinder {

	public static void main(String[] args) {
		String input1 = "leetcode";
		System.out.println(findFirstUniqueChar(input1));
		String input2 = "loveleetcode";
		System.out.println(findFirstUniqueChar(input2));
	}

	static int findFirstUniqueChar(String input) {
		int result = -1;
		char[] inputCharArr = input.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		HashMap<Character, Integer> pos = new HashMap<Character, Integer>();

		for (int i = 0; i < inputCharArr.length; i++) {
			Character key = inputCharArr[i];
			
			if (map.containsKey(key)) {
				int count = map.get(key);
				map.put(key, count + 1);
			} else {
				map.put(key, 1);
				pos.put(key, i);
			}
		}
		for (Character key : pos.keySet()) {
			int count = map.get(key);
			int indx = pos.get(key);
			if (count == 1 && (result == -1 || indx < result)) {
				result = indx;
			}
		}
		return result;
	}
}
