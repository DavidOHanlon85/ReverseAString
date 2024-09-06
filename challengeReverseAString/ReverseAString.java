/**
 * 
 */
package challengeReverseAString;

/**
 * @author - Daithi O hAnluain - 15621049
 */
public class ReverseAString {

	public static void main(String[] args) {

		String palindrome = "Dot saw I was Tod";

		palindromeCheck(palindrome);
		System.out.println();
		palindromeCheck("Racecar");
		System.out.println();
		palindromeCheck("Teacher");

	}

	/**
	 * @param palindrome
	 */
	public static void palindromeCheck(String palindrome) {
		int length = palindrome.length();
		char[] tempCharArray = new char[length];
		char[] charArray = new char[length];

		// put original string in an array of chars (HINT for loop)

		for (int i = 0; i < palindrome.length(); i++) {

			charArray[i] = palindrome.charAt(i);

		}

		// System.out.println(charArray);

		// reverse array of chars (HINT another for loop)

		for (int i = 0; i < palindrome.length(); i++) {

			tempCharArray[i] = palindrome.charAt(palindrome.length() - 1 - i);

		}

		// System.out.println(tempCharArray);

		// check if the original string was a palindrome

		String reversePalindrome = new String(tempCharArray);

		if (reversePalindrome.equalsIgnoreCase(palindrome)) {
			System.out.println(palindrome + " and " + reversePalindrome + " are palindromes.");
		} else {
			System.out.println(palindrome + " and " + reversePalindrome + " are not palindromes.");
		}
	}

}
