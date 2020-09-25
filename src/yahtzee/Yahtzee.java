package yahtzee;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Yahtzee {
	public static void main(String[] args) {
		Hand hand = new Hand();
		List<Die> initialHand = hand.generateHand();
		System.out.println("Roll 1 --->\t" + initialHand);
		int rollCount = 1;
	
		Scanner sc =  new Scanner(System.in);
		while(rollCount < 3 && !hand.isYahtzee()) {
			rollCount++;
			System.out.print("\nPlease enter a space separated list of\nwhich die(s) you want to re-roll: ");
			String input = sc.nextLine();
			if(!input.equals("0") && rollCount != 3) {
			System.out.println("\nRoll " + rollCount + " --->\t" + hand.update(input));
			} else {
				System.out.println("\nFinal Hand: " + hand);
				break;
			}
		}
		if(hand.isYahtzee()) {
			System.out.println("YAHTZEE!");
		}
		sc.close();
	}
}


