package yahtzee;

import java.util.ArrayList;
import java.util.List;

public class Die {
	
	public int value;
	
	public int rollDie() {
		value = (int)Math.floor(Math.random() * 6) + 1;
		return value;
	}
	
	public List<Integer> numberOfRolls(int num) {
		List<Integer> rollValues = new ArrayList<>();
		for(int i = 0; i < num; i++) {
			rollValues.add(this.rollDie());
		}
		return rollValues;
	}
}
