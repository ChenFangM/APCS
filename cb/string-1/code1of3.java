public class code1of3 {

	public static void main(String[] args) {

		// helloName
		System.out.println(helloName("Bob"));
		System.out.println(helloName("Alice"));
		System.out.println(helloName("X"));

		// makeAbba
		System.out.println(makeAbba("Hi", "Bye"));
		System.out.println(makeAbba("Yo", "Alice"));
		System.out.println(makeAbba("What", "Up"));

		// makeTags
		System.out.println(makeTags("i", "Yay"));
		System.out.println(makeTags("i", "Hello"));
		System.out.println(makeTags("cite", "Yay"));

		//makeOutWord
		System.out.println(makeOutWord("<<>>", "Yay"));
		System.out.println(makeOutWord("<<>>", "WooHoo"));
		System.out.println(makeOutWord("[[]]", "word"));

		// extraEnd
		System.out.println(extraEnd("Hello"));
		System.out.println(extraEnd("ab"));
		System.out.println(extraEnd("Hi"));

		// firstTwo
		System.out.println(firstTwo("Hello"));
		System.out.println(firstTwo("abcdefg"));
		System.out.println(firstTwo("ab"));

		// // firstHalf
		// System.out.println();
		// System.out.println();
		// System.out.println();

		// // withoutEnd
		// System.out.println();
		// System.out.println();
		// System.out.println();

		// // comboString
		// System.out.println();
		// System.out.println();
		// System.out.println();

		// // nonStart
		// System.out.println();
		// System.out.println();
		// System.out.println();

		// // left2
		// System.out.println();
		// System.out.println();
		// System.out.println();

	}

/* helloName
Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
*/
	
	public static String helloName(String name) {
		return "Hello " + name + "!";
	}

/* makeAbba
Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
*/

	public static String makeAbba(String a, String b) {
		return a + b + b + a;
	}

/* makeTags
The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surrounds the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>". 
*/

	public static String makeTags(String tag, String word) {
		return "<" + tag + ">" + word + "</" + tag + ">";
	}
/* makeOutWord
Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
*/

	public static String makeOutWord(String out, String word) {
		String head = out.substring(0, 2);
		String tail = out.substring(2, 4);
		return head + word + tail;
	}

/* extraEnd
Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.
*/
	
	public static String extraEnd(String str) {
		String last2 = str.substring(str.length() - 2, str.length());
		return last2 + last2 + last2;
	}

/* firstTwo
Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". 
Note: str.length() returns the length of a string.
*/

	public static String firstTwo(String str) {
		if (str.length() == 0) {
			return "";
		}
		if (str.length() <= 2) {
			return str;
		}
		return str.substring(0, 2);
	}

/*

*/



/*

*/



/*

*/



/*

*/



/*

*/



}