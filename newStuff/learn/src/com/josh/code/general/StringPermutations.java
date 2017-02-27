/**
 * 
 */
package com.josh.code.general;

/**
 * @author munish
 *
 */

import java.util.HashSet;
import java.util.Set;

/**
 * @author Crunchify.com
 * 
 */

public class StringPermutations {

	public static void main(String[] args) {
		String s = "ABC";
		String s1 = "EBAY";
		String s2 = "Yahoo";
		System.out.println("\nString " + s + ":\nPermutations: " + computePermutation(s));
		System.out.println("\nString " + s1 + ":\nPermutations: " + computePermutation(s1));
		System.out.println("\nString " + s2 + ":\nPermutations: " + computePermutation(s2));
	}

	public static Set<String> computePermutation(String str) {
		Set<String> crunchifyResult = new HashSet<String>();
		if (str == null) {
			return null;
		} else if (str.length() == 0) {
			crunchifyResult.add("");
			return crunchifyResult;
		}

		char firstChar = str.charAt(0);
		String rem = str.substring(1);
		Set<String> words = computePermutation(rem);
		for (String newString : words) {
			for (int i = 0; i <= newString.length(); i++) {
				crunchifyResult.add(stringAdd(newString, firstChar, i));
			}
		}
		return crunchifyResult;
	}

	public static String stringAdd(String str, char c, int j) {
		String first = str.substring(0, j);
		String last = str.substring(j);
		return first + c + last;
	}

	public void permute(String input) {
		int inputLength = input.length();
		boolean[] used = new boolean[inputLength];
		StringBuffer outputString = new StringBuffer();
		char[] in = input.toCharArray();

		doPermute(in, outputString, used, inputLength, 0);

	}

	public void doPermute(char[] in, StringBuffer outputString, boolean[] used, int inputLength, int level) {
		if (level == inputLength) {
			System.out.println(outputString.toString());
			return;
		}

		for (int i = 0; i < inputLength; ++i) {

			if (used[i])
				continue;

			outputString.append(in[i]);
			used[i] = true;
			doPermute(in, outputString, used, inputLength, level + 1);
			used[i] = false;
			outputString.setLength(outputString.length() - 1);
		}
	}

}
