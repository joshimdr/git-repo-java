package com.josh.code.general2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BullCowProblem {

	public static void main(String[] args) {
		String ans = getHint("11", "22");

		System.out.println(ans);
	}

	public static String getHint(String secret, String guess) {
		
		int bulls = 0;
	    int cows = 0;
	    int[] numbers = new int[10];
	    for (int i = 0; i<secret.length(); i++) {
	        int s = Character.getNumericValue(secret.charAt(i));
	        int g = Character.getNumericValue(guess.charAt(i));
	        if (s == g) bulls++;
	        else {
	            if (numbers[s] < 0) cows++;
	            if (numbers[g] > 0) cows++;
	            numbers[s] ++;
	            numbers[g] --;
	        }
	    }
	    return bulls + "A" + cows + "B";
/*
		int bulls = 0;

		int counter = 0;
		int len = secret.length();
		Set guessNumSet = new HashSet<>();
		Set secNumSet = new HashSet<>();
		while (counter < len) {
			char guessNum = guess.charAt(counter);

			if (secret.charAt(counter) == (guessNum)) {
				// If the numbers match
				// guessNumSet.add(guessNum);
				bulls = bulls + 1;
				secNumSet.add(guessNum);

			} else {
				guessNumSet.add(guessNum);
			}
			
			counter++;
		}
		int c =0;
	
		Object[] s = secNumSet.toArray();
		
		for (int i = 0; i < s.length; i++) {
			if(guessNumSet.contains(s[i])){
				guessNumSet.remove(s[i]);
				
			}
		}
		
		

		StringBuilder sb = new StringBuilder();
		sb.append(bulls).append("A").append(guessNumSet.size()).append("B");

		return sb.toString();
		
		*/

	}
}