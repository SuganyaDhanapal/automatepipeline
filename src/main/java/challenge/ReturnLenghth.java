package challenge;

public class ReturnLenghth {

	public static void main(String[] args) {

		String s1 = "Hello World";
		System.out.println("Last word length for string \"" + s1 + "\" is " + calcLastWordLen(s1));
		
		String s2 = "fly me to the moon";
		System.out.println("Last word length for string \"" + s2 + "\" is " + calcLastWordLen(s2));
		
		String s3 = "luffy is still joyboy";
		System.out.println("Last word length for string \"" + s3 + "\" is " + calcLastWordLen(s3));

	}

	static int calcLastWordLen(String str) {
		int count = 0;
		String[] words = str.split(" ");
		String lastWord = words[words.length - 1];
		count = lastWord.length();
		
		return count;
	}
}
