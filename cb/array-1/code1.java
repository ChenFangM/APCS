public class code1 {

	public static void main(String[] args) {

		int[] test = {};
		System.out.println(toString(test));

		// firstLast6
		int[] testa = {1, 2, 6};
		int[] testb = {6, 1, 2, 3};
		int[] testc = {13, 6, 1, 2, 3};
		System.out.println(firstLast6(testa));
		System.out.println(firstLast6(testb));
		System.out.println(firstLast6(testc));

		// sameFirstLast
		int[] testd = {1, 2, 3};
		int[] teste = {1, 2, 3, 1};
		int[] testf = {1, 2, 1};
		System.out.println(sameFirstLast(testd));
		System.out.println(sameFirstLast(teste));
		System.out.println(sameFirstLast(testf));

		// makePi
		System.out.println(toString(makePi()));

		// commonEnd
		int[] testg = {7, 3};
		int[] testh = {7, 3, 2};
		int[] testi = {1, 3};
		System.out.println(commonEnd(testd, testg));
		System.out.println(commonEnd(testd, testh));
		System.out.println(commonEnd(testd, testi));

		// sum3
		int[] testj = {5, 11, 2};
		int[] testk = {7, 0, 0};
		System.out.println(sum3(testd));
		System.out.println(sum3(testj));
		System.out.println(sum3(testk));

		// rotateLeft3
		int[] testl = {5, 11, 9};
		System.out.println(toString(rotateLeft3(testd)));
		System.out.println(toString(rotateLeft3(testl)));
		System.out.println(toString(rotateLeft3(testk)));

		// reverse3
		System.out.println(toString(reverse3(testd)));
		System.out.println(toString(reverse3(testl)));
		System.out.println(toString(reverse3(testk)));

		// maxEnd3
		int[] testm = {11, 5, 9};
		int[] testn = {2, 11, 3};
		System.out.println(toString(maxEnd3(testd)));
		System.out.println(toString(maxEnd3(testm)));
		System.out.println(toString(maxEnd3(testn)));

		// sum2
		int[] testo = {1, 1};
		int[] testp = {1, 1, 1, 1};
		System.out.println(sum2(testd));
		System.out.println(sum2(testo));
		System.out.println(sum2(testp));

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


/* firstLast 6
Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
*/
	public static boolean firstLast6(int[] nums) {
	  return nums[0] == 6 || nums[nums.length - 1] == 6;
	}

/* sameFirstLast
Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
*/
	public static boolean sameFirstLast(int[] nums) {
	  if (nums.length >= 1) {
	    return nums[0] == nums[nums.length - 1];
	  }
	  return false;
	}

/* makePi
Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
*/
	public static int[] makePi() {
	  int[] pi = {3, 1, 4};
	  return pi;
	}

/* commonEnd
Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
*/
	public static boolean commonEnd(int[] a, int[] b) {
	  boolean sameFirst = a[0] == b[0]; 
	  boolean sameLast = a[a.length - 1] == b[b.length - 1];
	  return sameFirst || sameLast;
	}

/* sum3
Given an array of ints length 3, return the sum of all the elements.
*/
	public static int sum3(int[] nums) {
	  return nums[0] + nums[1] + nums[2];
	}

/* rotateLeft3
Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
*/
	public static int[] rotateLeft3(int[] nums) {
	  int[] array = {nums[1], nums[2], nums[0]};
	  return array;
	}

/* reverse3
Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
*/
	public static int[] reverse3(int[] nums) {
	  int[] array = {nums[2], nums[1], nums[0]};
	  return array;
	}

/* maxEnd3
Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.
*/
	public static int[] maxEnd3(int[] nums) {
	  int max = Math.max(nums[0], nums[2]);
	  int[] array = {max, max, max};
	  return array;
	}

/* sum2
Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
*/
	public static int sum2(int[] nums) {
	  if (nums.length == 1) {
	    return nums[0];
	  } 
	  if (nums.length == 0) {
	    return 0;
	  }
	  return nums[0] + nums[1];
	}
	
}