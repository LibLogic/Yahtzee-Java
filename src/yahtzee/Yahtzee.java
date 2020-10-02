package yahtzee;

import java.util.List;
import java.util.Scanner;

public class Yahtzee {
	
	public static void runRound() {
		Hand hand = new Hand();
//		List<Die> initialHand = hand.generateHand();
		int rollCount = 1;
		
//		printHand("Roll " + rollCount + " --->\t", initialHand);
		printHand("Roll " + rollCount + " --->\t", hand);
		

		Scanner sc =  new Scanner(System.in);
		while(rollCount < 3 && !hand.isYahtzee()) {
			rollCount++;
			System.out.print("\nPlease enter a space separated list of\nwhich die(s) you want to re-roll, \nor enter zero if done: ");
			String input = sc.nextLine();
			if(input.equals("0")) {
				break;
			} else {
				printHand("Roll " + rollCount + " --->\t",  hand.update(input));
			}
		}
		
		if(hand.isYahtzee()) {
			System.out.println("\n\nYAHTZEE!");
		} else {
			printHand("\n\nFinal Hand:\t",  hand);
			System.out.print("\nPlay another round? ");
			String input = sc.nextLine();
			if(input.equals("Y")) {
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
				Yahtzee.runRound();
			} else {
				System.out.println("\nGAME OVER!");
			}
			sc.close();
		}
	}

	private static void printHand(String msg, Hand h) {
		System.out.println(msg + h);
	}
	
	private static void printHand(String msg, List<Die> h) {
		String handStr = "";
		for(Die d : h) {
			handStr += d.getValue() + " ";
		}
		System.out.println(msg + handStr);
		
	}
}
