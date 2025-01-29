public class ForLoops {
	/**
	 * The main method is the entry point of the application.
	 * It creates an instance of the ForLoops class, which demonstrates
	 * various types of for loops, including counting upwards, counting
	 * backwards, and counting by increments of five.
	 *
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		new ForLoops();
	}// end main

	public ForLoops() {
		int counter = 0;

		System.out.println("Ordinary for loop");
		for (counter = 0; counter <= 10; counter++) {
			System.out.println(counter);
		} // end for loop

		System.out.println("Counting backwards");
		for (counter = 10; counter >= 0; counter--) {
			System.out.println(counter);
		} // end for loop

		System.out.println("Counting by 5");
		for (counter = 0; counter <= 25; counter += 5) {
			System.out.println(counter);
		} // end for loop

	}// end ForLoops
}// end class ForLoops
