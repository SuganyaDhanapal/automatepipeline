package week4.day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintUnique {

	public static void main(String[] args) {
		String name  = "google";
		char[] n=name.toCharArray();
		Set<Character> unique = new LinkedHashSet<Character>();
		for (int i = 0; i < n.length; i++) {
			  unique.add(n[i]);
	}
		System.out.println(unique);
	}
}
