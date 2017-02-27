package com.josh.code.general;

public class StringAddition {

	public static void main(String[] args) {

		char a = '3';
		char a2 = 'd';

		// System.out.println("The char value:" + Character.getNumericValue(a));

		// System.out.println("The char value 2:"+ (a+1));

		// System.out.println("The char value 2:" + (a - '0'));

		String string1 = "1122";

		String string2 = "333";

		System.out.println("Addition result:" + additionOfStrings(string1, string2));

	}

	public static String additionOfStrings(String st1, String st2) {

		String result = "";

		//String reverse1 = reverseString(st1);

		//String reverse2 = reverseString(st2);

		// System.out.println("ReverseRecusively:" +
		// reverseRecursively(reverse1.toCharArray(), 0, reverse1.length() -
		// 1));

		result = addTwoStringNums(st1, st2);
		//result = addTwoStringNumbers(reverse1, reverse2);

		//result = reverseString(result);

		return result;
	}

	
	
	private static String addTwoStringNums(String st1, String st2) {

		char[] numb1 = st1.toCharArray();
		char[] numb2 = st2.toCharArray();

		StringBuilder result = new StringBuilder();

		
		
		int overflow = 0;
		
		int i = numb1.length;
		int j = numb2.length;

		while (i > 0 || j > 0) {
			int n1 =0;
			int n2 =0;
			
			if(i>0)
			n1 = Character.getNumericValue(numb1[--i]);
			if(j>0)
			n2 = Character.getNumericValue(numb2[--j]);
			

			int sum = n1 + n2 + overflow;

			int addition = 0;

			addition = sum % 10;
			overflow = sum / 10;

			result.insert(0, addition);
			
			

		}

		return result.toString();

	}

	
	
	private static String addTwoStringNumbers(String st1, String st2) {

		char[] numb1 = st1.toCharArray();
		char[] numb2 = st2.toCharArray();

		StringBuilder result = new StringBuilder();

		int i = 0;
		
		int overflow = 0;

		while (i < numb1.length || i < numb2.length) {
			int n1 =0;
			int n2 =0;
			if (i < numb1.length) {
				n1 = Character.getNumericValue(numb1[i]);
			} else {
				n1 = 0;
			}
			if (i < numb2.length) {
				n2 = Character.getNumericValue(numb2[i]);
			} else {
				n2 = 0;
			}

			int sum = n1 + n2 + overflow;

			int addition = 0;

			addition = sum % 10;
			overflow = sum / 10;

			result.append(addition);
			i++;

		}

		return result.toString();

	}

	private static String reverseString(String reverseThis) {

		char[] stringchars = reverseThis.toCharArray();

		for (int i = 0; i < stringchars.length / 2; i++) {

			swap(stringchars, i, (stringchars.length - 1) - i);

		}

		return String.valueOf(stringchars);

	}

	private static void swap(char[] chararray, int i, int j) {

		char temp = chararray[i];
		chararray[i] = chararray[j];
		chararray[j] = temp;

	}

	private static String reverseRecursively(char[] str, int i, int j) {

		if (i < j) {

			swap(str, i, j);

			reverseRecursively(str, ++i, --j);

		}
		return String.valueOf(str);

	}

}
