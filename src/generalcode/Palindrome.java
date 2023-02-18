package generalcode;

import java.util.stream.IntStream;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("is radar Palindrome : -: " + isPalindrome("radar"));

		System.out.println("is apple Palindrome : - : " + isPalindrome("apple"));

	}

	private static boolean isPalindrome(String originalString) {
		String tempString = originalString.toLowerCase();
		return IntStream.range(0, tempString.length() / 2)
				.noneMatch(i -> tempString.charAt(i) != tempString.charAt(tempString.length() - i - 1));

	}

}
