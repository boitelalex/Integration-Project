
//Alexander Cruz-Boitel
//Assistant Program
import java.util.Scanner;

public class Welcome {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		System.out.println("Hello User, please enter your name.");

		String userInput = scan.nextLine();
		String greetingsUser = "Welcome ";
		final double version;
		// final is a non-access modifier. Making the variable (version) immutable.
		version = 1.0;
		String endGreeting = " to Assitant Program " + version + "." + " I am here to help.";

		System.out.println(greetingsUser + userInput + endGreeting);
		;

		/**
		 * Byte: Data equal to eight bits. Can save memory in large arrays. It has a
		 * minimum value of -128 and a maximum value of 127(inclusive).
		 * 
		 * Short: 16-bit signed two's complement integer. Saves memory in large arrays.
		 * Minimum of -32,768 and a maximum value of 32,767(inclusive).
		 * 
		 * Int: 32-bit signed two's complement integer. Represents integers. Minimum of
		 * -2^31 and a maximum of 2^31 minus one.
		 * 
		 * Long: 64-bit two's complement integer. Use when you need values wider than
		 * int. Minimum of -2^63 and a maximum of 2^63 minus one.
		 * 
		 * Float: single-precision 32-bit IEEE 754 floating point. Used to save memory
		 * in arrays.
		 * 
		 * Double: double-precision 64-bit IEEE 754 floating point. Used for precise
		 * values.
		 * 
		 * Boolean: Only two possible values. Represents one bit of information.
		 * 
		 * Char: single 16-bit Unicode character Minimum value of '\u0000' (or 0) and a
		 * maximum value of '\uffff'
		 * 
		 * Variable: a location in memory. Scope: the lifetime and accessibility of a
		 * variable.
		 */
		class Exponent {
			private Scanner newInput;

			public Exponent() {
				newInput = new Scanner(System.in);
				String firstQuestion = newInput.nextLine();
				switch (firstQuestion) {
				case "yes":
					System.out.println("Please enter two integers");
					String firstInteger = newInput.nextLine();
					String secondInteger = newInput.nextLine();
					System.out.println(Math.pow(Integer.parseInt(firstInteger), Integer.parseInt(secondInteger)));
					break;
				case "no":
					System.out.println("Okay ");
					break;
				default:
					System.out.println("Please enter yes or no.");
				}
			}
		}
	}
}
