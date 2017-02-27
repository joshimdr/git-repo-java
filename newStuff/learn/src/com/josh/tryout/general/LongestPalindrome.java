/**
 * 
 */
package com.josh.tryout.general;

/**
 * @author Munish
 *
 */
public class LongestPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String result = longestPalindrome("cbbd");
		System.out.println(result);

	}

	public static String longestPalindrome(String s) {

		char[] chars = s.toCharArray();

		int len = chars.length - 1;

		int maxPLenSoFar = 1;
		int maxP = 1;
		String maxPS = "";

		for (int i = 0; i < len; i++) {

			int j = 1;

			while (i - j >= 0 && i + j <= len) {

				if (chars[i - j] == chars[i + j]) {
					maxPLenSoFar = maxPLenSoFar + 2;
					if (maxPLenSoFar > maxP) {
						maxP = maxPLenSoFar;
						maxPS = s.substring(i - j, i + j + 1);
					}
				} else if (chars[i - j] == chars[i]) {
					if (maxP < 2) {
						maxP = 2;
						maxPS = s.substring(i - j, i + 1);
					}

				} else if (chars[i] == chars[i + j]) {
					if (maxP < 2) {
						maxP = 2;
						maxPS = s.substring(i, i + j + 1);
					}
				}

				j++;

			}

		}

		return maxPS;

	}

}
