/**
 * Programmer: William Madry
 * Date: Mar 11, 2011 
 */

/**
 * This class probes a given password for length and to detect if any of several
 * different character types are present. Primarily, we are going to look at
 * upper- and lower-case letters, numbers, and special chars ($,@,^ etc.)
 * 
 * @author madry
 * 
 */
public class PasswordTest {

	private String password; // the password to be tested
	private int minlength = 8; // a minimum good length for a password

	// the following Strings contain characters meeting certain rules
	private String lowerCase = "abcdefghijklmnopqrstuvwxyz"; // lowercase
	private String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // uppercase
	private String numbers = "0123456789"; // numbers
	private String specialChars = "!@#$%^&*()<>,.[]{}=+?/|"; // special

	/**
	 * One parameter constructor to create a new password object
	 * 
	 * @param password
	 *            a String password passed to the constructor
	 */
	public PasswordTest(String password) {
		this.password = password;
	}

	/**
	 * Returns true if password contains a number
	 * 
	 * @return result of testing for the presence of a number in password
	 */
	public boolean hasNumber() {
		boolean foundNumber = false;
		int strIndex = 0;
		while ((strIndex < password.length()) && !foundNumber) {
			foundNumber = numbers.contains(password.subSequence(strIndex,
					strIndex + 1));
			strIndex++;
		} // end while loop
		return foundNumber;
	}

	/**
	 * Returns true if password contains a lower-case letter
	 * 
	 * @return result of testing for the presence of lower-case in password
	 */
	public boolean hasLowerCase() {
		boolean foundLowerCase = false;
		int strIndex = 0;
		while ((strIndex < password.length()) && !foundLowerCase) {
			foundLowerCase = lowerCase.contains(password.subSequence(strIndex,
					strIndex + 1));
			strIndex++;
		} // end while loop
		return foundLowerCase;
	}

	/**
	 * Returns true if password contains an upper-case letter
	 * 
	 * @return result of testing for the presence of upper-case in password
	 */

	public boolean hasUpperCase() {
		boolean foundUpperCase = false;
		int strIndex = 0;
		while ((strIndex < password.length()) && !foundUpperCase) {
			foundUpperCase = upperCase.contains(password.subSequence(strIndex,
					strIndex + 1));
			strIndex++;
		} // end while loop
		return foundUpperCase;
	}

	/**
	 * Returns true if password contains a special character
	 * 
	 * @return result of test for the presence of special character in password
	 */
	public boolean hasSpecialChar() {
		boolean foundSpecialChar = false;
		int strIndex = 0;
		while ((strIndex < password.length()) && !foundSpecialChar) {
			foundSpecialChar = specialChars.contains(password.subSequence(
					strIndex, strIndex + 1));
			strIndex++;
		} // end while loop
		return foundSpecialChar;
	}

	/**
	 * Returns true if password length is sufficient
	 * 
	 * @return result of comparing password length to minLength
	 */
	public boolean longEnough() {
		return password.length() >= minlength;
	}

	/**
	 * returns a string containing the password (unencrypted)
	 * 
	 * @return the password string
	 */
	public String display() {
		return password;
	}
} // end PasswordTest class definition
