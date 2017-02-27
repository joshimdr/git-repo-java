package com.josh.code.algos;

public class DutchNationalFlag {

	private static int[] a = new int[] { 3, 2, 1, 2, 3, 1, 2, 2, 2, 2, 3, 3, 3, 1, 1, 1, 1 };

	static int middle = 2;

	public static void main(String[] args) {

		print(a);

		int i = 0, j = 0, k = a.length - 1;

		while (j <= k) {

			if (a[j] < middle) {
				swap(a, i, j);
				i++;
				j++;
			} else if (a[j] > middle) {

				swap(a, j, k);
				k--;

			} else {

				j++;
			}

		}

		print(a);

	}

	private static void print(int[] ar) {
		System.out.println();
		System.out.println();
		for (int i = 0; i < ar.length; i++) {

			System.out.print(ar[i] + " ");

		}

	}

	private static void swap(int[] a, int i, int j) {

		if (a != null && i < j && i < a.length && j < a.length) {
			int tmp = a[i];
			a[i] = a[j];
			a[j] = tmp;
		}

	}

}
