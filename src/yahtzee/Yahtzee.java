package yahtzee;

public class Yahtzee {

	public static void main(String[] args) {
		
//		Die.value = (int)Math.floor(Math.random() * 6) + 1;
		
		Die die1 = new Die();
		
		System.out.println(die1.rollDie());
	}
}
