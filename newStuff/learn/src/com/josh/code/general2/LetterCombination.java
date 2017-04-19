/**
 * 
 */
package com.josh.code.general2;

import java.util.LinkedList;
import java.util.List;

import com.josh.tryout.util.Helper;

/**
 * @author Munish
 *
 */
public class LetterCombination {

	/**
	 * 
	 */
	public LetterCombination() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> str = new LetterCombination().letterCombinations("23");

		Helper.print(str);

	}

	public List<String> letterCombinations(String digits) {
		
		LinkedList<String> ans = new LinkedList<String>();
		
		String[] mapping =  { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		
		ans.add("");

		for (int i = 0; i < digits.length(); i++) {

			int x = Character.getNumericValue(digits.charAt(i));
		
			while (ans.peek().length() == i) {
				String t = ans.remove();

				for (char s : mapping[x].toCharArray())
					ans.add(t + s);

			}
		}
		return ans;
	}

}






