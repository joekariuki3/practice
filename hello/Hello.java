import java.util.*;

public class Hello{
	// Hello this is my first java program.
	// it illustrate how to say hi
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Hi, what is your name? ");
		String userName = input.nextLine();
		System.out.println("Hello " + userName + "!");
	}// end main
}// end class Hello
