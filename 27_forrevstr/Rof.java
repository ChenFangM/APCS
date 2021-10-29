/*
Temporary Team {Fang, Prattay, William}
APCS
HW 27 -- FOR the Love of Strings
2021-10-29
time spent:
*/

/*
DISCOVERIES
0: The non-static method .substring() can be used with one OR two parameters.
0.1: With one parameter, an int i, .substring() would return a string with all characters after the first i characters in the String instance.
0.2: With two parameters, int b and int i, .substring() would return a string with all the characters in between, inclusively the (b+1)th character and ith character in the String instance.

QCC
0: How can we use .substring() for practical purposes?
*/

public class Rof {

	public static void main(String[] args) {

		// test fenceF()
		System.out.println(fenceF(0));
		System.out.println(fenceF(1));
		System.out.println(fenceF(5));

		//test reverseF()
		System.out.println("stressed");
		System.out.println(reverseF("stressed"));

		//test reverseR()
		System.out.println("stressed");
		System.out.println(reverseR("stressed"));

	}

	public static String fenceF(int posts) {

		if (posts > 0) {
			String fence = "|";
			for (int i = 1; i < posts; i ++) {
				fence += "--|";
			}
			return fence;
		} else {
			return "";
		}

	}

	public static String reverseF(String s) {

		String rev = "";
		for (int i = 1; i <= s.length(); i ++) {
			rev += s.substring(s.length() - i, s.length() - i + 1);
		}
		return rev;

	}

	public static String reverseR(String s) {

		if (s.length() > 0) {
			return s.substring(s.length() - 1) + reverseR(s.substring(0, s.length() - 1));
		} else {
			return "";
		}

	}

}