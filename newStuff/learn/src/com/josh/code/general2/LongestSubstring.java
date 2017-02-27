/**
 * 
 */
package com.josh.code.general2;

import java.util.HashSet;
import java.util.Set;

/**
 * @author munish
 *
 */
public class LongestSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		

	}

	public static int lengthOfLongestSubstring(String s) {

		char[] ca = s.toCharArray();

		
		Set<Character> h = new HashSet<Character>();
		int maxLength = 0;
		int currentLength = 0;

		for (int i = 0; i < ca.length; i++) {

			if (!h.contains(ca[i])) {
				
				h.add(ca[i]);
				currentLength = currentLength +1;
				if (currentLength > maxLength) {
					maxLength = currentLength;
				}

			} else {
				h = new HashSet<Character>();
				h.add(ca[i]);
				currentLength = 0;
			}

		}

		return maxLength;
	}

}
