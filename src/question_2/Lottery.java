package question_2;

import java.util.Random;
import java.util.Scanner;

public class Lottery {
	private int[] lotteryNumber = new int[5];
	private int[] personlotpick = new int[5];
	
	public Lottery() {
		Random rand = new Random();
		
		for (int i = 0; i < 5; i++) {
			lotteryNumber[i] = rand.nextInt(10);
			System.out.println(lotteryNumber[i]);
		}
	}
	public void personsLotterypick() {
		System.out.println("enter your lotter numbers");
		for (int i = 0; i < 5; i++) {
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			personlotpick[i] = input.nextInt();
		}
	}
	public void compareArray() {
		for (int i = 0; i < 5; i++) {
			if(lotteryNumber[i] == personlotpick[i]) {
				System.out.println("element " + i + " have the same numbr");
			}
		}
	}
}
