import java.util.Scanner;

/**
 * The Crypto class provides a menu to encrypt or decrypt a phrase.
 */
public class Crypto {

    static Scanner input = new Scanner(System.in);
    static String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String key = "UBWKOVGAPRFJLCOHZENSXDMYTI";

    /**
     * The main method is the entry point of the application that provides a menu to
     * encrypt or decrypt a phrase.
     * It continuously prompts the user for input until the user chooses to quit.
     * Options:
     * 1 - Encrypt a user-provided phrase.
     * 2 - Decrypt a user-provided phrase.
     * 0 - Quit the application.
     * Any other input will result in an error message.
     */
    public static void main(String[] args) {
        boolean keepGoing = true;
        while (keepGoing) {

            String response = menu();

            if (response.equals("1")) {
                System.out.println("Please enter unencrypted phrase");
                String plain = input.nextLine();
                plain = plain.toUpperCase();
                System.out.println(encrypt(plain));
            } else if (response.equals("2")) {
                System.out.println("Please enter encrypted phrase");
                String code = input.nextLine();
                code = code.toUpperCase();
                System.out.println(decrypt(code));
            } else if (response.equals("0")) {
                System.out.println("Goodbye!");
                keepGoing = false;
            } else {
                System.out.println("Sorry, I didn't understand");
            } // end if
        } // end while
    } // end main

    /**
     * This method prints a menu to the console and reads the user's
     * response. It does not perform any error checking.
     *
     * @return the user's response as a string
     */
    public static String menu() {
        System.out.println("1. Encrypt");
        System.out.println("2. Decrypt");
        System.out.println("0. Quit");
        System.out.print("Enter your choice: ");
        return input.nextLine();
    } // end menu

    /**
     * Encrypts a phrase by replacing each letter with the corresponding letter from
     * the key.
     * The index of the letter in the alphabet is used to find the corresponding
     * letter in the key.
     *
     * @param plain the phrase to be encrypted.
     * @return the encrypted phrase.
     */
    public static String encrypt(String plain) {
        String cipher = "";

        for (int i = 0; i < plain.length(); i++) {
            cipher += key.charAt(alpha.indexOf(plain.charAt(i)));
        }
        return cipher;
    } // end encrypt

    /**
     * Decrypts a phrase by replacing each letter with the corresponding letter from
     * the alphabet.
     * The index of the letter in the key is used to find the corresponding letter
     * in the alphabet.
     *
     * @param cipher the phrase to be decrypted.
     * @return the decrypted phrase.
     */
    public static String decrypt(String cipher) {
        String plain = "";

        for (int i = 0; i < cipher.length(); i++) {
            plain += alpha.charAt(key.indexOf(cipher.charAt(i)));
        }
        return plain;
    } // end decrypt

} // end Crypto
