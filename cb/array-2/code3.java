public class code3 {

	public static void main(String[] args) {

		// // makeMiddle
		// System.out.println();
		// System.out.println();
		// System.out.println();

		// // plusTwo
		// System.out.println();
		// System.out.println();
		// System.out.println();

		// // swapEnds
		// System.out.println();
		// System.out.println();
		// System.out.println();

		// // midThree
		// System.out.println();
		// System.out.println();
		// System.out.println();

		// // maxTriple
		// System.out.println();
		// System.out.println();
		// System.out.println();

		// // frontPiece
		// System.out.println();
		// System.out.println();
		// System.out.println();

		// // unlucky1
		// System.out.println();
		// System.out.println();
		// System.out.println();

		// // make2
		// System.out.println();
		// System.out.println();
		// System.out.println();

		// // front11
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

/*

*/

}