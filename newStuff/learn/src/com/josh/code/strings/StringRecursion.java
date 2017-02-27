package com.josh.code.strings;

public class StringRecursion {

	public static void main(String[] args) {
		System.out.println("Reversed:" + reversedString("Munish Joshi"));
		System.out.println("Reversed String :" + reversedStringRecursion("Munish Joshi"));
	}

	public static String reversedString(String str) {

		String strReversed = null;

		if (str == null || str.length() < 1) {
			return str;
		}

		char[] strChars = str.toCharArray();

		int i = 0;
		int mid = strChars.length / 2;

		while (i < mid) {
			char temp = strChars[i];
			strChars[i] = strChars[(str.length() - 1) - i];
			strChars[(str.length() - 1) - i] = temp;
			i++;
		}

		strReversed = String.valueOf(strChars);

		return strReversed;

	}

	public static String reversedStringRecursion(String str) {

		String revString = null;

		char[] strChars = revStr(str.toCharArray(), 0, str.length() - 1);

		revString = String.valueOf(strChars);

		return revString;

	}

	public static char[] revStr(char[] strChars, int i, int j) {

		if (i >= j) {
			return strChars;

		} else {
			char temp = strChars[i];
			strChars[i] = strChars[j];
			strChars[j] = temp;
			return revStr(strChars, ++i, --j);
		}

	}

}
