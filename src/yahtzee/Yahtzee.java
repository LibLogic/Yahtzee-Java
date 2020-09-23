package yahtzee;

import java.util.List;
import java.util.Scanner;

public class Yahtzee {
	public static void main(String[] args) {
		
		Hand hand = new Hand();
		List<Die> initialHand = hand.generateHand();
		
		System.out.println(initialHand);
		
		Scanner sc =  new Scanner(System.in);
		System.out.print("Please enter a space separated list of\nwhich die(s) you want to re-roll: ");
		
		String input = sc.nextLine();
		sc.close();
		
		List<Die> newHand = hand.updateHand(input);;
		
		System.out.println(newHand);
	}
}
