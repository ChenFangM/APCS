/*
Team ___ {Fang, Sophia, and duckies}
APCS
HW25 -- Do I repeat myself?
2021-10-27
time spent: 0.5 hr
*/

/*
DISCOVERIES
0: Recursion in a method, fenceR(), calls upon itself to preform a command repeatedly. 
1: Infinite recursion when run in the terminal returns nothing because the function doesn't stop to return.
1.1: The terminal displays nothing, and doesn't allow you to type anything until the function is ended forcefully.

QCC
0: Is there any reason you would use a recursion over a loop?

*/


public class Repeater {

	public static String fenceW(int numPosts) {
	
		String fence = "";
		if (numPosts > 0) {
			fence = "|";
			while ((numPosts - 1) > 0) {
				fence += "--|";
				numPosts += -1;
			} 
		}
		return fence;

	}


	public static String fenceR(int numPosts) {
		
		if (numPosts > 0) {
			if (numPosts > 1) {
				return (fenceR(numPosts - 1) + "--|");
			} else {
				return "|";
			}
		} else {
			return "";
		}

	}


	public static void main(String[] args) {

	//test fenceW
	System.out.println(fenceW(1));
	System.out.println(fenceW(2));
	System.out.println(fenceW(3));
	//test fenceR
	System.out.println(fenceR(1));
	System.out.println(fenceR(2));
	System.out.println(fenceR(3));

	}

}
