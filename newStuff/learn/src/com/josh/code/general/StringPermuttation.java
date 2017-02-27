/**
 * 
 */
package com.josh.code.general;

/**
 * @author munish
 *
 */
public class StringPermuttation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str= "abc";
		
		stringPermutation( str, "");
		
	}

	private static void stringPermutation(String str, String prefix) {

		int length = str.length();

		if (length == 0) {
			System.out.println("String permutation:" + prefix);
		} else {

			for (int i = 0; i < length; i++) {

				stringPermutation(str.substring(0, i) + str.substring(i+1), prefix + str.charAt(i));

			}

		}

	}

}
