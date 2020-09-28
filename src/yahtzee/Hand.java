package yahtzee;

import java.util.ArrayList;

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
	
	public List<Die> update (String selectedForRoll) {
		String[] arr = selectedForRoll.split(" ");	
		for(String dieIndex : arr) {
			int dieToRoll = Integer.parseInt(dieIndex) - 1;
			hand.set(dieToRoll, die.roll());
		}
		return hand;
	}
	
	public boolean isYahtzee() {
		int matchCount = 0;
		for(Die die : hand) {
			if(die.getValue() == hand.get(0).getValue()) {
				matchCount++;
			}
		}
		return matchCount == hand.size();
	}

	@Override
	public String toString() {
		String output = "";
		for(Die die : hand) {
			output += die + " ";
		};
		return output;
	}
}



