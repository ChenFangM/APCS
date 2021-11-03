/*
Team ___ {Fang, Sophia}
APCS
HW29 -- Which way do you roll?
2021-11-03
time spent: 1 hr
*/

/*
DISCOVERIES
0: The main method MUST have the a String[] (not any other primitive datatypes or arrays) as the argument.
	0.1: The terminal will return "Error: Main method not fount in class [className]..." if you try running the class.
1: Since the datatype int is 32-bit, it can only hold a total of 2^32 numerical values (-2,147,483,648 to 2,147,483,647). 
	1.1: This means that Integer.parceInt() will not work with Strings containing values outside the int range.
	1.2: When 2491273112 was inputted, the terminal returned... 
		"Exception in thread "main" java.lang.NumberFormatException: For input string: "2491273112"
	        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	        at java.base/java.lang.Integer.parseInt(Integer.java:652)
	        at java.base/java.lang.Integer.parseInt(Integer.java:770)
	        at Commafier.main(Commafier.java:15)"

QCC
0: Is it possible to commafy a double value with an unknown number of decimal places?
*/


public class Commafier {

	public static void main(String[] args) {

		int[] uncommafied = new int[args.length];
		for (int i = 0; i < args.length; i ++) {
			uncommafied[i] = Integer.parseInt(args[i]);
		}

		if (args.length == 0) {

			// testing commafyR
			System.out.println(commafyR(1));
			System.out.println(commafyR(10));
			System.out.println(commafyR(101));
			System.out.println(commafyR(1000));
			System.out.println(commafyR(12345));

			// testing commafyF
			System.out.println(commafyF(1));
			System.out.println(commafyF(10));
			System.out.println(commafyF(101));
			System.out.println(commafyF(1000));
			System.out.println(commafyF(12345));
		
		} else {

			for (int i = 0; i < args.length; i ++) {
				System.out.println(commafyR(uncommafied[i]));
			}

		}


	}

	public static String commafyR(int num) {

		String s = Integer.toString(num);

		if (s.length() <= 3) {
			return s;
		} else {
			return commafyR(Integer.parseInt(s.substring(0, s.length() - 3))) + "," + s.substring(s.length() - 3);
		}

	}

	public static String commafyF(int num) {

		String s = Integer.toString(num);
		String commafied = "";

		for (int i = s.length(); i > 3; i = i - 3) {

			if (commafied.equals("")) {
				commafied = s.substring(i - 3);
			}

			commafied = "," + commafied;
			s = s.substring(0, i - 3);

		}	
		commafied = s + commafied;

		return commafied;

	}

}