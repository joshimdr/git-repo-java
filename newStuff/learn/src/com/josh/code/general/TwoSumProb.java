
package com.josh.code.general;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSumProb {
	
	
	

	/**
	 * @param sum
	 * @param ar
	 * @return
	 */
	private HashMap twoSums(int sum, int[] ar) {

		HashSet hs = new HashSet<Integer>();
		HashMap hm = new HashMap<Integer, Integer>();

		if (ar.length == 0) {
			return null;
		}

		for (int i = 0; i < ar.length; i++) {

			if (hs.contains(sum - ar[i])) {
				hm.put(ar[i], sum - ar[i]);
			} else {
				hs.add(ar[i]);
			}

		}

		return hm;

	}

	public static void main(String[] args) {

		TwoSumProb tsp = new TwoSumProb();
		int[] prob = { 2, 3, 5, 7, 4, 6, 8, 10, 12, 11, 13, 15 };
		System.out.println(tsp.twoSums(12, prob));

	}

}
