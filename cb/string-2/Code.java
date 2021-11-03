public class Code {

	public static void main(String[] args) {

		// doubleChar
		System.out.println(doubleChar("The"));
		System.out.println(doubleChar("AAbb"));
		System.out.println(doubleChar("Hi-There"));

		// countHi
		System.out.println(countHi("abc hi ho"));
		System.out.println(countHi("ABChi hi"));
		System.out.println(countHi("hihi"));

		// catDog
		System.out.println(catDog("catdog"));
		System.out.println(catDog("catcat"));
		System.out.println(catDog("1cat1cadodog"));

		// countCode
		System.out.println(countCode("aaacodebbb"));
		System.out.println(countCode("codexxcode"));
		System.out.println(countCode("cozexxcope"));

		// endOther
		System.out.println(endOther("Hiabc", "abc"));
		System.out.println(endOther("AbC", "HiaBc"));
		System.out.println(endOther("abc", "abXabc"));

		// xyzThere
		System.out.println(xyzThere("abcxyz"));
		System.out.println(xyzThere("abc.xyz"));
		System.out.println(xyzThere("xyz.abc"));

	}

/* double Char
Given a string, return a string where for every char in the original, there are two chars.
*/
	
	public static String doubleChar(String str) {
		String word = "";
		for (int i = 0; i <= str.length() - 1; i ++) {
			word += str.substring(i, i + 1) + str.substring(i, i + 1);
		}
		return word;
	}

/* countHi
Return the number of times that the string "hi" appears anywhere in the given string.
*/
	
	public static int countHi(String str) {
		int numHi = 0;
		for (int i = 0; i <= str.length() - 2; i ++) {
			String isHi = str.substring(i, i + 2);
			if (isHi.equals("hi")) {
				numHi ++;
			}
		} 
		return numHi;
	}

/* catDog
Return true if the string "cat" and dog appear the same number of times in the given string.
*/

	public static boolean catDog(String str) {
		int numCat = 0;
		int numDog = 0;
		for (int i = 0; i <= str.length() - 3; i ++) {
			String threeChar = str.substring(i, i + 3);
			if (threeChar.equals("cat")) {
				numCat ++;
			}
			if (threeChar.equals("dog")) {
				numDog ++;
			}
		}
		return numCat == numDog;
	}

/* countCode
Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
*/

	public static int countCode(String str) {
		int numCode = 0;
		for (int i = 0; i <= str.length() - 4; i ++) {
			String twoChar = str.substring(i, i + 2);
			String fourthChar = str.substring(i + 3, i + 4);
			if (twoChar.equals("co") && (fourthChar.equals("e"))) {
				numCode ++;
			}
		}
		return numCode;
	}

/* endOther
Given two strings, return true if either of the strings appear at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
Note: str.toLowerCase() returns the lowercase version of a string.
*/

	public static boolean endOther(String a, String b) {
  
  		String longer = "";
  		String shorter = "";
		if (a.length() >= b.length()) {
			longer = a;
			shorter = b;
		} else {
			longer = b;
			shorter = a;
		}
		String endOfLong = longer.substring(longer.length() - shorter.length(), longer.length());
		return (endOfLong.toLowerCase()).equals(shorter.toLowerCase());
	}

/* xyzThere
Returns true is the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
*/

	public static boolean xyzThere(String str) {

		if (str.length() < 4) {
			return str.equals("xyz");
		}
		String threeChar = "";
		for (int i = 0; i <= str.length() - 3; i++) {
			threeChar = str.substring(i, i + 3);
			if (threeChar.equals("xyz")) {
			  if (i == 0) {
			    return true;
			  } else {
			    if (!((str.substring(i - 1, i)).equals("."))) {
	          return true;
			    }
			  }
			}
		}
		return false;
	}

}
