/**
 * 
 */
package com.josh.code.collections;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Munish
 *
 */
public class MinimumUniqueOfTwoArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = { 1, 3, 4, 6, 7 };
		int[] a2 = { 1, 3, 4, 5, 6, 7 };
		System.out.println(minimumUniOfArr(a1, a2));

	}

	private static Integer minimumUniOfArr(int[] a1, int[] a2) {
		// TODO Auto-generated method stub

		ArrayList<Integer> alist = new ArrayList<Integer>();
		HashMap<Integer, Boolean> imap = new HashMap();

		for (int a : a1) {
			Boolean val = imap.get(a);
			if (val != null && val == false) {
				imap.put(a, true);
			} else {
				imap.put(a, false);
			}

		}
		for (int a : a2) {
			Boolean val = imap.get(a);
			if (val != null && val == false) {
				imap.put(a, true);
			} else {
				imap.put(a, false);
			}

		}

		for (Integer inte : imap.keySet()) {
			if (imap.get(inte) == false) {
				alist.add(inte);
			}
		}

		return findMin(alist);
	}

	private static Integer findMin(ArrayList<Integer> a) {
		// TODO Auto-generated method stub
		Integer currentMin = null;
		if (a != null) {
			currentMin = a.get(0);
			for (Integer a1 : a) {
				if (a1 < currentMin) {
					currentMin = a1;
				}

			}

		}

		return currentMin;
	}

}
