package yahtzee;

public class Die {
	
	private int value;
	private int numSides = 6;
	private String color = "White";
	
	public Die() {
		value = (int)Math.floor(Math.random() * this.numSides) + 1;
	}
	
	public void roll() {
		value = (int)Math.floor(Math.random() * this.numSides) + 1;
	}
	
	public int getValue() {
		return value;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "" + value;
	}
}
