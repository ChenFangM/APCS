public class code1 {

	public static void main(String[] args) {

		// countEvens
		int[] testa = {2, 1, 2, 3, 4};
		int[] testb = {2, 2, 0};
		int[] testc = {1, 3, 5};
		System.out.println(countEvens(testa));
		System.out.println(countEvens(testb));
		System.out.println(countEvens(testc));

		// bigDiff
		int[] testd = {10, 3, 5, 6};
		int[] teste = {7, 2, 10, 9};
		int[] testf = {2, 10, 7, 2};
		System.out.println(bigDiff(testd));
		System.out.println(bigDiff(teste));
		System.out.println(bigDiff(testf));

		// centeredAverage
		int[] testg = {1, 2, 3, 4, 100};
		int[] testh = {1, 1, 5, 5, 10, 8, 7};
		int[] testi = {-10, -4, -2, -4, -2, 0};
		System.out.println(centeredAverage(testg));
		System.out.println(centeredAverage(testh));
		System.out.println(centeredAverage(testi));

		// sum13
		int[] testj = {1, 2, 2, 1};
		int[] testk = {1, 1};
		int[] testl = {1, 2, 2, 1, 13}; 
		System.out.println(sum13(testj));
		System.out.println(sum13(testk));
		System.out.println(sum13(testl));

		// sum67
		int[] testm = {1, 2, 2};
		int[] testn = {1, 2, 2, 6, 99, 99, 7};
		int[] testo = {1, 1, 6, 7, 2};
		System.out.println(sum67(testm));
		System.out.println(sum67(testn));
		System.out.println(sum67(testo));

		// frontPiece
		System.out.println();
		System.out.println();
		System.out.println();

		// unlucky1
		System.out.println();
		System.out.println();
		System.out.println();

		// make2
		System.out.println();
		System.out.println();
		System.out.println();

		// front11
		System.out.println();
		System.out.println();
		System.out.println();

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

/* countEvens
Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
*/
	public static int countEvens(int[] nums) {
	  int evens = 0;
	  for (int i = 0; i < nums.length; i ++) {
	    if (nums[i] % 2 == 0) {
	      evens ++;
	    }
	  }
	  return evens;
	}

/* bigDiff
Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.
*/
	public static int bigDiff(int[] nums) {
	  int max = nums[0];
	  int min = nums[0];
	  for (int i = 0; i < nums.length; i++) {
	    max = Math.max(max, nums[i]);
	    min = Math.min(min, nums[i]);
	  }
	  return max - min;
	}

/* centeredAverage
Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.
*/
	public static int centeredAverage(int[] nums) {
		int max = nums[0];
	  int min = nums[0];
	  int total = 0;
	  for (int i = 0; i < nums.length; i++) {
	    max = Math.max(max, nums[i]);
	    min = Math.min(min, nums[i]);
	    total += nums[i];
	  }
	  return (total - max - min)/(nums.length - 2);	  
	}

/* sum13
Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
*/
	public static int sum13(int[] nums) {
	  int sum = 0;
	  for (int i = 0; i < nums.length; i++) {
	    if (nums[i] == 13) {
	      i++;
	    } else {
	      sum += nums[i];
	    }
	  }
	  return sum;
	}

/* sum67
Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.
*/
	public static int sum67(int[] nums) {
	  int sum = 0;
	  if (nums.length == 0) {
	    return 0;
	  }
	  for (int i = 0; i < nums.length; i ++) {
	    if (nums[i] == 6) {
	      while (nums[i] != 7) {
	        i++;
	      }
	    } else {
	    sum += nums[i];
	    }
	  }
	  return sum;
	}

}