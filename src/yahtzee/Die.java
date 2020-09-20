package yahtzee;

public class Die {
	
	public int value;
	
	public int rollDie() {
		value = (int)Math.floor(Math.random() * 6) + 1;
		return value;
	}

}
