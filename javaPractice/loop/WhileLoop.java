import java.util.Scanner;

public class WhileLoop {

	/**
	 * The main method is the entry point of the application that creates an
	 * instance of the WhileLoop class. This class demonstrates a while loop
	 * that continuously prompts the user for input until the user correctly
	 * answers a question.
	 *
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		new WhileLoop();
	}// end main

	public WhileLoop() {
		String guess = "";
		String correct = "1963";
		Scanner input = new Scanner(System.in);

		while (!guess.equals(correct)) {
			System.out.println("When did Kenya gain its independence ? ");
			guess = input.next();
		} // end while loop

		System.out.println("Good job!");

	}// end constuctor

}// end class
