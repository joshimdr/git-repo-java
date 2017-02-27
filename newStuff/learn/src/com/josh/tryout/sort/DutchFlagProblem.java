package com.josh.tryout.sort;

import com.josh.tryout.util.Helper;

public class DutchFlagProblem {

	public static void main(String[] args) {

		int[] n = new int[] { 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 2, 1, 2, 1, 2, 1, 0, 0, 0, 0 };

		Helper.print(n);
		int i = 0, j = 0;
		int k = n.length - 1;
		while (i <= k) {
			if (n[i] <1) {
				swap(n, j, i);
				i++;
				j++;
			} else if (n[i] > 1) {
				swap(n, i, k);
				k--;
			} else {
				i++;
			}

		}
		
		Helper.print(n);

	}

	private static void swap(int[] a, int i, int j) {

		if (a != null) {

			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;

		}

	}

}
