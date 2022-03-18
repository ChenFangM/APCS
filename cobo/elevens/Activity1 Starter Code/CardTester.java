/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card A = new Card("2", "Spades", 2);
		Card B = new Card("A", "Diamonds", 1);
		Card C = new Card("A", "Diamonds", 1);

		System.out.println(A);
		System.out.println(B);
		System.out.println(C);

		System.out.println(A.matches(B));
		System.out.println(B.matches(C));
	}
}
