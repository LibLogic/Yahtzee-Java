package yahtzee;

public class Die {
	
	private int value;
	
	public Die() {
		value = (int)Math.floor(Math.random() * 6) + 1;
	}
	
	public Die roll() {
		value = (int)Math.floor(Math.random() * 6) + 1;
		return new Die();
	}
	
	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "" + value;
	}
}
