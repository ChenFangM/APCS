/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck A = new Deck(["2", "A", "K"], ["Spades", "Hearts", "Clubs"], [2, 1, 13]);
		Deck B = new Deck(["2", "A"], ["Spades", "Hearts"], [2, 1]);
		Deck C = new Deck([], [], []);
	}
}
