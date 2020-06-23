
public class ReverseString {
	// StringBuffer
	public static void stringBufferMethod(String word) {
		StringBuffer strbuffer = new StringBuffer(word);
		System.out.println(strbuffer.reverse());
	}

	// iterative
	public static void iterativeMethod(String word) {
		char[] stringArray = word.toCharArray();
		for (int i = stringArray.length - 1; i >= 0; i--) {
			System.out.print(stringArray[i]);
		}
	}

	// recursive
	public static String recursiveMethod(String word) {
		if ((null == word) || (word.length() <= 1)) {
			return word;
		}
		return recursiveMethod(word.substring(1)) + word.charAt(0);
	}

	public static void main(String[] args) {
		String word = "Hello";
		// stringBufferMethod(word);
		// iterativeMethod(word);
		System.out.println(recursiveMethod(word));
	}
}
