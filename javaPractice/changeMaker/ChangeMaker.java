
/*
 * Change maker asks for a purchase price and amout of cash tendered
 * it determins how many of the following denominations should be returned
 * as change
 * penny 0.01
 * nickle 0.05
 * dime 0.10
 * quarter 0.25
 * dollar 1.00
 * five 5.00
 * ten 10.00
 * twenty 20.00
 */
import java.util.Scanner;

public class ChangeMaker {
	/**
	 * The main method is the entry point of the application that runs the
	 * changeMakerLoop method.
	 *
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		ChangeMaker myChangeMaker = new ChangeMaker();
		myChangeMaker.changeMakerLoop();
	}// end main

	/**
	 * Runs the change maker loop.
	 * Asks the user for the price of an item and the amount of cash tendered.
	 * Calculates the change and determines how many of each denomination to return.
	 * Prints the results.
	 */
	public void changeMakerLoop() {

		float penny = 0.01f, nickle = 0.05f / penny, dime = 0.10f / penny, quarter = 0.25f / penny,
				dollar = 1.00f / penny;
		float five = 5.00f / penny, ten = 10.00f / penny, twenty = 20.00f / penny;
		int pennyChange = 0, nickleChange = 0, dimeChange = 0, quarterChange = 0, dollarChange = 0;
		int fiveChange = 0, tenChange = 0, twentyChange = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Price of thw item: ");
		float purchasePrice = input.nextFloat();
		System.out.println("Cash tendered: ");
		float cashTendered = input.nextFloat();
		float change = cashTendered - purchasePrice;
		int changeInPennies = (int) (change / 0.01f);
		System.out.println("Change: " + change);
		System.out.println("Change Left: " + changeInPennies);

		while (changeInPennies > 0) {
			if (changeInPennies >= twenty) {
				changeInPennies -= twenty;
				twentyChange += 1;
			} else if (changeInPennies >= ten) {
				changeInPennies -= ten;
				tenChange += 1;
			} else if (changeInPennies >= five) {
				changeInPennies -= five;
				fiveChange += 1;
			} else if (changeInPennies >= dollar) {
				changeInPennies -= dollar;
				dollarChange += 1;
			} else if (changeInPennies >= quarter) {
				changeInPennies -= quarter;
				quarterChange += 1;
			} else if (changeInPennies >= dime) {
				changeInPennies -= dime;
				dimeChange += 1;
			} else if (changeInPennies >= nickle) {
				changeInPennies -= nickle;
				nickleChange += 1;
			} else if (changeInPennies >= penny) {
				changeInPennies -= penny;
				pennyChange += 1;
			}
		} // end while loop

		System.out.println("twenties: " + twentyChange);
		System.out.println("tens: " + tenChange);
		System.out.println("fives: " + fiveChange);
		System.out.println("ones: " + dollarChange);
		System.out.println("quarters: " + quarterChange);
		System.out.println("dimes: " + dimeChange);
		System.out.println("nicles: " + nickleChange);
		System.out.println("pennies: " + pennyChange);

	}// end changeMakerLoop
}// end class ChangeMaker
