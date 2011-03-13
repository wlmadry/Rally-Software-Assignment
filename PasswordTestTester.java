/**
 * Programmer: William Madry
 * Date: Mar 12, 2011 
 */

/**
 * This test class runs 20 test case password strings through the PasswordTest
 * class. The tests look for length, special character sets, mixes of the
 * different character sets, etc.
 * 
 * @author madry
 * 
 */
public class PasswordTestTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int nCharClasses = 0;

		// test case 1
		// tests a short password
		PasswordTest test1 = new PasswordTest("short");
		if (test1.hasLowerCase()) {
			nCharClasses++;
		}
		if (test1.hasUpperCase()) {
			nCharClasses++;
		}
		if (test1.hasNumber()) {
			nCharClasses++;
		}
		if (test1.hasSpecialChar()) {
			nCharClasses++;
		}
		if (test1.longEnough()) {
			nCharClasses++;
		}
		System.out.println("For password 'short', # classes: " + nCharClasses);
		System.out.println("For password 'short', expected:  1");
		nCharClasses = 0;

		// test case 2
		// tests a password longer than 8 characters
		PasswordTest test2 = new PasswordTest("longenough");
		if (test2.hasLowerCase()) {
			nCharClasses++;
		}
		if (test2.hasUpperCase()) {
			nCharClasses++;
		}
		if (test2.hasNumber()) {
			nCharClasses++;
		}
		if (test2.hasSpecialChar()) {
			nCharClasses++;
		}
		if (test2.longEnough()) {
			nCharClasses++;
		}
		System.out.println("For password 'longenough', # classes: "
				+ nCharClasses);
		System.out.println("For password 'longenough', expected:  2");
		nCharClasses = 0;

		// test case 3
		// tests upperCase
		PasswordTest test3 = new PasswordTest("LONGENOUGH");
		if (test3.hasLowerCase()) {
			nCharClasses++;
		}
		if (test3.hasUpperCase()) {
			nCharClasses++;
		}
		if (test3.hasNumber()) {
			nCharClasses++;
		}
		if (test3.hasSpecialChar()) {
			nCharClasses++;
		}
		if (test3.longEnough()) {
			nCharClasses++;
		}
		System.out.println("For password 'LONGENOUGH', # classes: "
				+ nCharClasses);
		System.out.println("For password 'LONGENOUGH', expected:  2");
		nCharClasses = 0;

		// test case 4
		// tests upper- and lower-case
		PasswordTest test4 = new PasswordTest("mixedCASES");
		if (test4.hasLowerCase()) {
			nCharClasses++;
		}
		if (test4.hasUpperCase()) {
			nCharClasses++;
		}
		if (test4.hasNumber()) {
			nCharClasses++;
		}
		if (test4.hasSpecialChar()) {
			nCharClasses++;
		}
		if (test4.longEnough()) {
			nCharClasses++;
		}
		System.out.println("For password 'mixedCASES', # classes: "
				+ nCharClasses);
		System.out.println("For password 'misedCASES', expected:  3");
		nCharClasses = 0;

		// test case 5
		// tests the number test method
		PasswordTest test5 = new PasswordTest("hasa5");
		if (test5.hasLowerCase()) {
			nCharClasses++;
		}
		if (test5.hasUpperCase()) {
			nCharClasses++;
		}
		if (test5.hasNumber()) {
			nCharClasses++;
		}
		if (test5.hasSpecialChar()) {
			nCharClasses++;
		}
		if (test5.longEnough()) {
			nCharClasses++;
		}
		System.out.println("For password 'hasa5', # classes: " + nCharClasses);
		System.out.println("For password 'hasa5', expected: 2");
		nCharClasses = 0;

		// test case 6
		// tests the special character method
		PasswordTest test6 = new PasswordTest("hasa^");
		if (test6.hasLowerCase()) {
			nCharClasses++;
		}
		if (test6.hasUpperCase()) {
			nCharClasses++;
		}
		if (test6.hasNumber()) {
			nCharClasses++;
		}
		if (test6.hasSpecialChar()) {
			nCharClasses++;
		}
		if (test6.longEnough()) {
			nCharClasses++;
		}
		System.out.println("For password 'hasa^', # classes: " + nCharClasses);
		System.out.println("For password 'hasa^', expected:  2");
		nCharClasses = 0;

		// test case 7
		// tests upper-, lower-, and number
		PasswordTest test7 = new PasswordTest("has4CLASSES");
		if (test7.hasLowerCase()) {
			nCharClasses++;
		}
		if (test7.hasUpperCase()) {
			nCharClasses++;
		}
		if (test7.hasNumber()) {
			nCharClasses++;
		}
		if (test7.hasSpecialChar()) {
			nCharClasses++;
		}
		if (test7.longEnough()) {
			nCharClasses++;
		}
		System.out.println("For password 'has4CLASSES', # classes: "
				+ nCharClasses);
		System.out.println("For password 'has4CLASSES', expected:  4");
		nCharClasses = 0;

		// test case 8
		// tests only numbers, more than 8 chars
		PasswordTest test8 = new PasswordTest("0123456789");
		if (test8.hasLowerCase()) {
			nCharClasses++;
		}
		if (test8.hasUpperCase()) {
			nCharClasses++;
		}
		if (test8.hasNumber()) {
			nCharClasses++;
		}
		if (test8.hasSpecialChar()) {
			nCharClasses++;
		}
		if (test8.longEnough()) {
			nCharClasses++;
		}
		System.out.println("For password '0123456789', # classes: "
				+ nCharClasses);
		System.out.println("For password '0123456789', expected:  2");
		nCharClasses = 0;

		// test case 9
		// tests last character in lower-case, only 1 char
		PasswordTest test9 = new PasswordTest("z");
		if (test9.hasLowerCase()) {
			nCharClasses++;
		}
		if (test9.hasUpperCase()) {
			nCharClasses++;
		}
		if (test9.hasNumber()) {
			nCharClasses++;
		}
		if (test9.hasSpecialChar()) {
			nCharClasses++;
		}
		if (test9.longEnough()) {
			nCharClasses++;
		}
		System.out.println("For password 'z', # classes: " + nCharClasses);
		System.out.println("For password 'z', expected:  1");
		nCharClasses = 0;

		// test case 10
		// tests last upper-case letter, only one letter
		PasswordTest test10 = new PasswordTest("Z");
		if (test10.hasLowerCase()) {
			nCharClasses++;
		}
		if (test10.hasUpperCase()) {
			nCharClasses++;
		}
		if (test10.hasNumber()) {
			nCharClasses++;
		}
		if (test10.hasSpecialChar()) {
			nCharClasses++;
		}
		if (test10.longEnough()) {
			nCharClasses++;
		}
		System.out.println("For password 'Z', # classes: " + nCharClasses);
		System.out.println("For password 'Z', expected:  1");
		nCharClasses = 0;

		// test case 11
		// tests first number in numbers, only one char
		PasswordTest test11 = new PasswordTest("0");
		if (test11.hasLowerCase()) {
			nCharClasses++;
		}
		if (test11.hasUpperCase()) {
			nCharClasses++;
		}
		if (test11.hasNumber()) {
			nCharClasses++;
		}
		if (test11.hasSpecialChar()) {
			nCharClasses++;
		}
		if (test11.longEnough()) {
			nCharClasses++;
		}
		System.out.println("For password '0', # classes: " + nCharClasses);
		System.out.println("For password '0', expected:  1");
		nCharClasses = 0;

		// test case 12
		// tests one char, miscellaneous special char
		PasswordTest test12 = new PasswordTest("(");
		if (test12.hasLowerCase()) {
			nCharClasses++;
		}
		if (test12.hasUpperCase()) {
			nCharClasses++;
		}
		if (test12.hasNumber()) {
			nCharClasses++;
		}
		if (test12.hasSpecialChar()) {
			nCharClasses++;
		}
		if (test12.longEnough()) {
			nCharClasses++;
		}
		System.out.println("For password '(', # classes: " + nCharClasses);
		System.out.println("For password '(', expected:  1");
		nCharClasses = 0;

		// test case 13
		// tests first character in each character set
		PasswordTest test13 = new PasswordTest("aA0!");
		if (test13.hasLowerCase()) {
			nCharClasses++;
		}
		if (test13.hasUpperCase()) {
			nCharClasses++;
		}
		if (test13.hasNumber()) {
			nCharClasses++;
		}
		if (test13.hasSpecialChar()) {
			nCharClasses++;
		}
		if (test13.longEnough()) {
			nCharClasses++;
		}
		System.out.println("For password 'aA0!', # classes: " + nCharClasses);
		System.out.println("For password 'aA0!', expected:  4");
		nCharClasses = 0;

		// test case 14
		// tests last character in each character set
		PasswordTest test14 = new PasswordTest("zZ9|");
		if (test14.hasLowerCase()) {
			nCharClasses++;
		}
		if (test14.hasUpperCase()) {
			nCharClasses++;
		}
		if (test14.hasNumber()) {
			nCharClasses++;
		}
		if (test14.hasSpecialChar()) {
			nCharClasses++;
		}
		if (test14.longEnough()) {
			nCharClasses++;
		}
		System.out.println("For password 'zZ9|', # classes: " + nCharClasses);
		System.out.println("For password 'zZ9|', expected:  4");
		nCharClasses = 0;

		// test case 15
		// tests something that should pass all 5 tests
		PasswordTest test15 = new PasswordTest("r3allyG00dP@ssword!");
		if (test15.hasLowerCase()) {
			nCharClasses++;
		}
		if (test15.hasUpperCase()) {
			nCharClasses++;
		}
		if (test15.hasNumber()) {
			nCharClasses++;
		}
		if (test15.hasSpecialChar()) {
			nCharClasses++;
		}
		if (test15.longEnough()) {
			nCharClasses++;
		}
		System.out.println("For password 'r3allyG00dP@ssword!', # classes: "
				+ nCharClasses);
		System.out.println("For password 'r3allyG00dP@ssword!', expected:  5");
		nCharClasses = 0;

		// test case 16
		// tests something my niece says
		PasswordTest test16 = new PasswordTest("bff4ever!");
		if (test16.hasLowerCase()) {
			nCharClasses++;
		}
		if (test16.hasUpperCase()) {
			nCharClasses++;
		}
		if (test16.hasNumber()) {
			nCharClasses++;
		}
		if (test16.hasSpecialChar()) {
			nCharClasses++;
		}
		if (test16.longEnough()) {
			nCharClasses++;
		}
		System.out.println("For password 'bff4ever!', # classes: "
				+ nCharClasses);
		System.out.println("For password 'bff4ever!', expected:  4");
		nCharClasses = 0;

		// test case 17
		// tests the entire special character set
		PasswordTest test17 = new PasswordTest("!@#$%^&*()<>,.[]{}=+?/|");
		if (test17.hasLowerCase()) {
			nCharClasses++;
		}
		if (test17.hasUpperCase()) {
			nCharClasses++;
		}
		if (test17.hasNumber()) {
			nCharClasses++;
		}
		if (test17.hasSpecialChar()) {
			nCharClasses++;
		}
		if (test17.longEnough()) {
			nCharClasses++;
		}
		System.out
				.println("For password '!@#$%^&*()<>,.[]{}=+?/|', # classes: "
						+ nCharClasses);
		System.out
				.println("For password '!@#$%^&*()<>,.[]{}=+?/|', expected:  2");
		nCharClasses = 0;

		// test case 18
		// tests the entire lowercase alphabet
		PasswordTest test18 = new PasswordTest("abcdefghijklmnopqrstuvwxyz");
		if (test18.hasLowerCase()) {
			nCharClasses++;
		}
		if (test18.hasUpperCase()) {
			nCharClasses++;
		}
		if (test18.hasNumber()) {
			nCharClasses++;
		}
		if (test18.hasSpecialChar()) {
			nCharClasses++;
		}
		if (test18.longEnough()) {
			nCharClasses++;
		}
		System.out
				.println("For password 'abcdefghijklmnopqrstuvwxyz', # classes: "
						+ nCharClasses);
		System.out
				.println("For password 'abcdefghijklmnopqrstuvwxyz', expected:  2");
		nCharClasses = 0;

		// test case 19
		// tests the entire uppercase alphabet
		PasswordTest test19 = new PasswordTest("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		if (test19.hasLowerCase()) {
			nCharClasses++;
		}
		if (test19.hasUpperCase()) {
			nCharClasses++;
		}
		if (test19.hasNumber()) {
			nCharClasses++;
		}
		if (test19.hasSpecialChar()) {
			nCharClasses++;
		}
		if (test19.longEnough()) {
			nCharClasses++;
		}
		System.out
				.println("For password 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', # classes: "
						+ nCharClasses);
		System.out
				.println("For password 'ABCDEFGHIJKLMNOPQRSTUVWXYZ', expected:  2");
		nCharClasses = 0;

		// test case 20
		// tests a null string
		PasswordTest test20 = new PasswordTest("");
		if (test20.hasLowerCase()) {
			nCharClasses++;
		}
		if (test20.hasUpperCase()) {
			nCharClasses++;
		}
		if (test20.hasNumber()) {
			nCharClasses++;
		}
		if (test20.hasSpecialChar()) {
			nCharClasses++;
		}
		if (test20.longEnough()) {
			nCharClasses++;
		}
		System.out.println("For password '', # classes: " + nCharClasses);
		System.out.println("For password '', expected:  0");
		nCharClasses = 0;

	} // end main method
} // end PasswordTestTester class
