package yahtzee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hand {
	
	Die die = new Die();
	private List<Die> hand = new ArrayList<>();
	
	public List<Die> generateHand() {

		for (int i = 0; i < 5; i++) {
			hand.add(die.roll());
		}
		return hand;
	}
	
	public List<Die> updateHand (String selectedForRoll) {
		String[] arr = selectedForRoll.split(" ");	
		for(String dieIndex : arr) {
			int dieToRoll = Integer.parseInt(dieIndex) - 1;
			hand.set(dieToRoll, die.roll());
		}
		return hand;
	}
}
