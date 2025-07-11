import java.util.Scanner;

/*
 * Class AddInt with main method that requests for
 * two integers then prints out their sum
 */
public class Add {
	/**
	 * The main method is the entry point of the application that provides three
	 * options to
	 * add two numbers.
	 * It creates an Add object and calls one of its methods.
	 * The methods are:
	 * AddInt() - adds two ints
	 * AddFloat() - adds two floats
	 * AddAny() - adds two values of any type
	 */
	public static void main(String[] args) {
		Add myadd = new Add();
		// myadd.AddInt();
		// myadd.AddFloat();
		myadd.AddAny();
	}// end main

	/**
	 * Requests two integer inputs from the user and prints their sum.
	 * Utilizes the Scanner class for reading input from the console.
	 */
	public void AddInt() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please give me a Int number");
		int x = input.nextInt();
		System.out.println("Please give me another Int number");
		int y = input.nextInt();
		int sum = x + y;
		System.out.println("The sum is  " + sum);
	}// end AddInt

	/**
	 * Requests two float inputs from the user and prints their sum.
	 * Utilizes the Scanner class for reading input from the console.
	 */
	public void AddFloat() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please give me a Float number");
		float x = input.nextFloat();
		System.out.println("Please give me another Float number");
		float y = input.nextFloat();
		float sum = x + y;
		System.out.println("The sum is  " + sum);
	}// end AddFloat

	/**
	 * Requests two inputs from the user and prints their sum.
	 * The inputs are attempted to be parsed as floats. If the parse fails,
	 * a NumberFormatException is thrown and caught, and the value is set to 0.
	 * The parsed values are added and the result is printed.
	 */
	public void AddAny() {
		Scanner input = new Scanner(System.in);

		float x = 0f;
		float y = 0f;
		System.out.println("First number:");
		String xRaw = input.nextLine();

		try {
			x = Float.parseFloat(xRaw);
		} catch (NumberFormatException e) {
			System.out.println("ERROR: Using 0 instead...");
			System.out.println(e.getMessage());
			x = 0f;
		}
		System.out.println("Second number:");
		String yRaw = input.nextLine();

		try {
			y = Float.parseFloat(xRaw);
		} catch (NumberFormatException e) {
			System.out.println("ERROR: Using 0 instead...");
			System.out.println(e.getMessage());
			y = 0f;
		}

		float sum = x + y;
		System.out.println("The sum is " + sum);

	}// end Addany

}// end class AddInt