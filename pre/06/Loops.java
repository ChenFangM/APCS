import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		
		// Power //
		
		Scanner in = new Scanner(System.in);
		System.out.print("Base: ");
		double b = in.nextDouble();
		System.out.print("Power: ");
		int n = in.nextInt();
		double answer = power(b, n);
		System.out.println(b + " ^ " + n + " = " + answer);
		
		// Factorial //

		System.out.print("Factorial: ");
		int f = in.nextInt();
		int factorial = factorial(f);
		System.out.println("Factorial " + f + " = " + factorial);
		
		// e^x //	
		
		System.out.print("e to the power of: ");
		double x = in.nextDouble();
		System.out.print("Number of terms for approximation: ");
		int i = in.nextInt();
		check(x, i);
		System.out.println("~ More Checks ~");
		System.out.print("Number of terms for approximation: ");
		i = in.nextInt();
		int k = 1;
		double xValue = 0.1;
		while (k != 5) {
			check(xValue, i);
			xValue = xValue * 10;
			k += 1;
		}
		xValue = -0.1;
		while ((k >= 5) && (k < 9)) {
			check(xValue, i);
			xValue = xValue * 10;
			k += 1;
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

	public static int factorial(int f) {
		int factor = 1;
		int factProduct = 1;
		while (f != 0) {
			factProduct = factProduct * factor;
			f = f - 1;
			factor = factor + 1;
		}
		return factProduct;
	}

	public static double myexp(double x, int n) {
		double summation = 1;
		int k = 1;
		while (k != n) {
			summation = summation + (power(x, k)) / (factorial(k));
			k = k + 1;
		}
		return summation;
	}

	public static void check(double x, int n) {
		System.out.println("Exp Check: " + x + "\t" + myexp(x, n) + "\t" + Math.exp(x));
	}

}