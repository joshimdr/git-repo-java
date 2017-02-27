package com.josh.code.general;

public class ReverseAString {

	private static String stringtorev = "abcdef ghi jkl";

	public static void main(String[] args) {

		// System.out.println(revString(stringtorev));
		System.out.println(useRecursion(stringtorev));

	}

	private static String revString(String str) {

		char[] ca = str.toCharArray();

		for (int i = 0; i < ca.length / 2; i++) {
			char temp = ca[(ca.length - 1) - i];
			ca[(ca.length - 1) - i] = ca[i];
			ca[i] = temp;
		}

		return String.valueOf(ca);
	}

	private static String useRecursion(String str) {
		char[] ca = str.toCharArray();
		revRecursion(ca, 0, ca.length - 1);
		return String.valueOf(ca);

	}

	private static void revRecursion(char[] c, int i, int j) {

		if (i >= j) {
			return;

		} else {

			char temp = c[i];
			c[i] = c[j];
			c[j] = temp;

			revRecursion(c, ++i, --j);

		}

	}

}
