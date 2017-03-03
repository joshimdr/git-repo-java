/**
 * 
 */
package com.josh.code.general2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.josh.tryout.util.Helper;

/**
 * @author munish
 *
 */
public class WordsFromLines {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] l = findWords(new String[] { "RTY", "ZAS", "ZXC" });
		Helper.print(l);
	}

	private static String[] findWords(String[] words) {
		String[] strs = { "QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM" };
		Map<Character, Integer> wordMap = new HashMap<Character, Integer>();
		int i = 0;
		for (String s : strs) {
			for (char c : s.toCharArray()) {
				wordMap.put(c, i);
			}
			i++;
		}

		List alist = new ArrayList();

		for (String word : words) {

			char[] wc = word.toUpperCase().toCharArray();
			char firstChar = wc[0];

			int value = wordMap.get(firstChar);

			for (char c : wc) {
				if (wordMap.get(c) != value) {
					value = -1;
					break;
				}
			}
			if (value !=-1) {
				alist.add(word);
			}

		}

		return (String[]) alist.toArray(new String[0]);
	}

}
