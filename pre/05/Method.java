public class Methods {

    public static void main(String[] args) {
        boolean d = isDivisible(1, 3);
        System.out.println("isDivisible Test (f): " + d);
        boolean t = isTriangle(1, 2, 3);
		System.out.println("isTriangle Test (f): " + t);
		int a = ack(2, 2);
		System.out.println("Ackermann Test (7): " + a);
    }

    public static boolean isDivisible(int n, int m) {
        if (n % m == 0) {
            return true;
        } else {
        	return false;
        }
    }

	public static boolean isTriangle(int a, int b, int c) {
		if ((a < (b + c)) && (b < (a + c)) && (c < (b + a))) {
			return true;
		} else {
			return false;
		} 
	}

	public static int ack(int m, int n) {
		if ((m > 0) && (n > 0)) {
			return ack(m-1, ack(m, n-1));
		} else {
			if ((m > 0) && (n == 0)) {
				return ack(m-1, 1);
			} else {
				if (m == 0) {
					return n+1;
				}
			}
		}
		return 0;
	}

}