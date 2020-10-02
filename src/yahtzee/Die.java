package yahtzee;

public class Die {
	
	private int value;
	
	public Die() {
		value = (int)Math.floor(Math.random() * 6) + 1;
	}
	
	public void roll() {
		value = (int)Math.floor(Math.random() * 6) + 1;
	}
	
	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "" + value;
	}
}
