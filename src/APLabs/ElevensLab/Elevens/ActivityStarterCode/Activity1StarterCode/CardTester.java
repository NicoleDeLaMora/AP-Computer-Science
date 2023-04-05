package APLabs.ElevensLab.Elevens.ActivityStarterCode.Activity1StarterCode;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
 		 Card wow = new Card("Eight", "Hearts", 11);
		 Card now = new Card("Queen", "Spades", 18);
		 Card pow = new Card("Eight", "Hearts", 11);

		 System.out.println(now.toString());
		 System.out.println("First card and Third card are the same: " + wow.matches(pow));






 	}
}
