package APLabs.ElevensLab.Elevens.ActivityStarterCode.Activity3StarterCode;

import APLabs.ElevensLab.Elevens.ActivityStarterCode.Activity1StarterCode.Card;

/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 1;


	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();

    
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	/*
	For k = 51 down to 1,
− Generate a random integer r between 0 and k, inclusive;
− Exchange cards[k] and cards[r].
This has the same structure as selection sort:
For k = 51 down to 1,
− Find r, the position of the largest value among cards[0] through cards[k];
− Exchange cards[k] and cards[r].
	 */
	public static void perfectShuffle(int[] values) { //finished
		int [] shuffled = new int[52];
    int k = 0;
    for(int j = 0; j < 25; j++){
      shuffled[k] = values[j];
      k+=2;
    }
    k = 1;
    for(int j = 26; j < 51; j++){
      shuffled[k] = values[j];
      k+=2;
    }
    }

    
	

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) { //FINISHED
		int[] shuffled = new int[52];
		for(int k = shuffled.length-1; k > 0; k--){
			int r =  (int)(Math.random() * (k-1)) + 1;
			shuffled[r] = values[k];
		}
	}
}
