package yahtzee;

import java.util.List;
import java.util.Scanner;

public class Yahtzee {

	public static void main(String[] args) {
		
//		Die.value = (int)Math.floor(Math.random() * 6) + 1;
		
		Die die1 = new Die();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter number of rolls ");
		int numOfRolls = input.nextInt();
		input.close();

		List<Integer> result = die1.numberOfRolls(numOfRolls);
		
		System.out.println(result);
		
	}
}
