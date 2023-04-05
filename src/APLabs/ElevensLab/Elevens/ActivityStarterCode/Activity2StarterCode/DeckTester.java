package APLabs.ElevensLab.Elevens.ActivityStarterCode.Activity2StarterCode;


/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {

		String[] ranks = {"Eight", "Queen", "Ace"};
		String[] suits = {"Hearts", "Spades", "Diamond"};
		int[] values = {11, 18, 50};
		Deck cards = new Deck(ranks, suits, values);
		System.out.println("The deck is empty: " + cards.isEmpty());
		System.out.println("The size of the deck is: " + cards.size());
		System.out.println("Your card is: " + cards.deal());
		System.out.println("The undelt cards are: " + cards.toString());
	}
}
