import java.util.Random;

public class Arrays {

	public static void main(String[] args) {
		
		//powArray//

		double[] a = new double[5];
		a[0] = 0;
		a[1] = 1;
		a[2] = 2;
		a[3] = 3;
		a[4] = 25;
		double[] b = powArray(a, 2);
		System.out.println("a[]: " + java.util.Arrays.toString(a));
		System.out.println("b[]: " + java.util.Arrays.toString(b));
		
		//histogram//
		
		int numberOfCounters = 10;
		int[] scores = arrayRandom(200, numberOfCounters);
		System.out.println(java.util.Arrays.toString(scores));
		int[] counter = histogram(scores, numberOfCounters);
		for (int i = 0; i < numberOfCounters; i++) {
			System.out.println(i + " \t " + counter[i]);
		}

		//indexOfMax//
		int[] maxTest = new int[5];
		maxTest[0] = -30;
		maxTest[1] = -100;
		maxTest[2] = -9;
		maxTest[3] = 0;
		maxTest[4] = -25;
		System.out.println("Index of Max: " + indexOfMax(maxTest));
		
		//sieve//
		System.out.println("Sieve of Eratosthenes; Prime?");
		int integers = 21;
		boolean[] isPrime = sieve(integers);
		for (int k = 0; k < integers; k++) {
			System.out.println(k + " \t " + isPrime[k]);
		}
	}

	public static double power(double x, int n) {
		double powerProduct = 1;
		while (n != 0) {
			powerProduct = powerProduct * x;
			n = n - 1;
		}
		return powerProduct;	
	}

	public static double[] powArray(double[] a, int power) {
		double[] b = new double[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = power(a[i], power);
		}
		return b;
	}

	public static int[] arrayRandom(int length, int numberOfNumbers) {
		Random random = new Random();
		int[] scores = new int[length];
		int i = 0;
		while (i < length) {
			scores[i] = random.nextInt(numberOfNumbers);
			i++;
		}
		return scores;
	}

	public static int[] histogram(int[] scores, int numberOfCounters) {
		int[] counter = new int[numberOfCounters];
		for (int score : scores) {
			counter[score]++;
		}
		return counter;
	}

	public static int indexOfMax(int[] a) {
		int greatestNumber = a[0];
		int indexOfGreatest = 0;
		int index = 0;
		for (int number : a) {
			if (number > greatestNumber) {
				greatestNumber = number;
				indexOfGreatest = index;
			}
		index ++;
		}
		return indexOfGreatest;
	}

	public static boolean[] sieve(int n) {
		boolean[] isPrime = new boolean[n];
		isPrime[0] = false;
		if (n > 1) {
			isPrime[1] = false;
		for (int index = 2; index != n; index ++) {
			int isDivisible = 0;
			for (int divisor = 2; divisor != n; divisor ++) {
				if (divisor != index) {
					if (index % divisor == 0) {
						isDivisible ++;
					}
				}
				if (isDivisible > 0) {
					isPrime[index] = false;
				} else {
					isPrime[index] = true;
				}
			} 
		}
		}
		return isPrime;
	}

}