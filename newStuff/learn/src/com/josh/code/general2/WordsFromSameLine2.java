package com.josh.code.general2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WordsFromSameLine2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] result = findWords(new String[] { "WE", "WEIGH", "BXCVN" });
		
		for(String w : result){
			System.out.println(w);
		}

	}

	public static String[] findWords(String[] words) {
		String[] strs = { "QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM" };

		Map wordMap = new HashMap();
		// int i=0;

		for (int i = 0; i < strs.length; i++) {
			// for(String wrd : strs){
			for (char charac : strs[i].toCharArray()) {
				wordMap.put(charac, i);
			}

		}

		if (words == null || words.length < 1) {
			return null;
		}

		List<String> res = new LinkedList<>();

		for (String w : words) {

			int in = (int)wordMap.get(w.toUpperCase().charAt(0));

			for (char c : w.toUpperCase().toCharArray()) {

				if ((int) wordMap.get(c) != in) {
					in = -1;
					break;

				}
			}
			if (in != -1) {
				res.add(w);
			}

		}

		return res.toArray(new String[0]);
	}

}
