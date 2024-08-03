package week3.day2.assignments;

public class DuplicateFinder {

	public static void main(String[] args) {
		String text = "Hydrabad";
		String[] words = text.split(" ");
		for (String word : words) {
			int count = 0;
			for (int i = 0; i < words.length - 1; i++) {
				if (word.equalsIgnoreCase(words[i])) {
					count++;
				}
			}
			if (count > 1) {
				text = text.replaceAll("(?i)\\b" + words[i] + "\\b", "x");
			}
		}
		System.out.println(text);
	}

}
