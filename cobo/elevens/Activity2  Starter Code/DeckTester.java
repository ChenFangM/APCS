/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"2", "A", "K"};
		String[] suits = {"Spades", "Hearts", "Clubs"};
		int[] pointValues = {2, 1, 13};
		Deck A = new Deck(ranks, suits, pointValues);
		for (int i = ranks.length; i >= 0; i--) {
			System.out.println("------------------------------------------------------");
			System.out.println( "DECK OF LENGTH " + i + " toString method: " + A.toString() );
			System.out.println("------------------------------------------------------");
			System.out.println( "DECK OF LENGTH " + i + " size method: " + A.size() );
			System.out.println( "DECK OF LENGTH " + i + " isEmpty method: " + A.isEmpty() );
			System.out.println( "DECK OF LENGTH " + i + " deal method: " + A.deal() );
		}
	}
}
