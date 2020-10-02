package yahtzee;

import java.util.ArrayList;

import java.util.List;

public class Hand {
	
	Die die = new Die();
	private List<Die> hand = new ArrayList<>();
	
	public Hand() {
		for (int i = 0; i < 5; i++) {
			hand.add(new Die());
		}
	}
	
	public List<Die> update (String selectedForRoll) {
		String[] arr = selectedForRoll.split(" ");	
		for(String dieIndex : arr) {
			int dieToRoll = Integer.parseInt(dieIndex) - 1;
			Die selectedDie = hand.get(dieToRoll);
			selectedDie.roll();
			hand.set(dieToRoll, selectedDie);
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



