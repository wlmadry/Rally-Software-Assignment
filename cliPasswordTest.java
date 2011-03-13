/**
 * Programmer: William Madry
 * Date: Mar 11, 2011 
 */

/**
 * This class runs from the command line and expects a password and number as
 * input from the command line. The class then tests the password to check for
 * length and all of four separate character classes (lower- and upper-case
 * letters, numbers, and special characters), keeping track of how many are
 * present in the password. The number of classes detected is compared to the
 * number given on the command line. If the number of character classes found
 * in the password is greater than or equal to the number given on the command
 * line, the class reports that the password is acceptable. Otherwise the class
 * reports that the password fails.
 * 
 * @author madry
 * 
 */
public class cliPasswordTest {

	/**
	 * @param args contains tokens for password and number of rules to pass
	 */
	public static void main(String[] args) {

		int nCharClasses = 0;	// number of classes a password contains
		int intntest = 0;		// number of classes required for security

		// check command line input for correct number of arguments
		if (args.length != 2) { // bad command line input
			System.out.println("Usage: cliPasswordTest password #");
			System.out
					.println("To ensure that special characters are processed correctly,");
			System.out.println("  enclose password in single quotes.");
		} else { // process two tokens as password and #

			String password = args[0];
			// System.out.println("password: " + password);
			String ntest = args[1];
			// System.out.println("String ntest = " + ntest);

			try {
				intntest = Integer.parseInt(ntest); // need a try-catch on this

				// create a new PasswordTest object
				PasswordTest test1 = new PasswordTest(password);

				// test all five of the possible rules in PasswordTest
				if (test1.hasLowerCase()) {
					System.out.println(test1.display() + " has lowerCase");
					nCharClasses++;
				}
				if (test1.hasUpperCase()) {
					System.out.println(test1.display() + " has upperCase");
					nCharClasses++;
				}
				if (test1.hasNumber()) {
					System.out.println(test1.display() + " has a number");
					nCharClasses++;
				}
				if (test1.hasSpecialChar()) {
					System.out.println(test1.display() + " has specialChar");
					nCharClasses++;
				}
				if (test1.longEnough()) {
					System.out.println(test1.display() + " is longEnough");
					nCharClasses++;
				}

				if (nCharClasses == 1) {	// handle the pesky singular case
					System.out.println(test1.display() + " meets "
							+ nCharClasses + " password requirement");
				} else {					// handle the plural cases
					System.out.println(test1.display() + " meets "
							+ nCharClasses + " password requirements");
				}
				if (nCharClasses >= intntest) { // password passes security test
					System.out
							.println("password meets complexity requirements");
				} else { // password fails security test
					System.out
							.println("password does not meet complexity requirements");
				}
			} catch (NumberFormatException exception) {	// bad cli parameter
				System.out.println("Usage: cliPasswordTest password #");
				System.out.println(ntest + " is not a #");
			}
		} // end else
	} // end main method
} // end class cliPasswordTest
