package com.josh.code.general;

public class StringPermutation5 {

	public static void main(String[] args) {
		char[] str = "abc".toCharArray();
		permutation(str, 0, str.length - 1);
	}

	private static void permutation(char str[], int mid, int end) {

		if (mid == end) {
			System.out.println("");
			printChars(str);
		}

		for (int i = mid; i <= end; i++) {

			swap(str, i, mid);
			permutation(str, mid + 1, end);
			swap(str, i, mid);

		}
	}

	private static void swap(char str[], int i, int j) {
		char temp = str[i];
		str[i] = str[j];
		str[j] = temp;

	}

	private static void printChars(char str[]) {

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length; i++) {
			sb.append(str[i]);
		}
		System.out.println("String:" + sb.toString());
	}

}
