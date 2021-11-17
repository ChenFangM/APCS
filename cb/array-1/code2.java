public class code2 {

	public static void main(String[] args) {

		// // middleWay
		// System.out.println();
		// System.out.println();
		// System.out.println();

		// // makeEnds
		// System.out.println();
		// System.out.println();
		// System.out.println();

		// // has23
		// System.out.println();
		// System.out.println();
		// System.out.println();

		// // no23
		// System.out.println();
		// System.out.println();
		// System.out.println();

		// // makeLast
		// System.out.println();
		// System.out.println();
		// System.out.println();

		// // double23
		// System.out.println();
		// System.out.println();
		// System.out.println();

		// // fix23
		// System.out.println();
		// System.out.println();
		// System.out.println();

		// // start1
		// System.out.println();
		// System.out.println();
		// System.out.println();

		// // biggerTwo
		// System.out.println();
		// System.out.println();
		// System.out.println();

	}

/* toString
Returns string form of an array.
*/
	public static String toString(int[] array) {
		String set = "{";
		for (int i = 0; i < array.length; i++) {
			set += array[i] + ", ";
		}
		if (set.length() > 1) {
			return set.substring(0, set.length() - 2) + "}";
		} 
		return set + "}";
	}

/* middleWay

*/

}