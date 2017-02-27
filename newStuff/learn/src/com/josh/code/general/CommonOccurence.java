/**
 * 
 */
package com.josh.code.general;

/**
 * @author munish
 *
 */
public class CommonOccurence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] num1 = { 2, 4, 8, 10, 40, 50, 60, 65, 70 };
		int[] num2 = { 12, 14, 40, 45, 50, 62, 65, 79 };

		int i = 0, j = 0;//, k = 0;

		while (i < num1.length && j < num2.length) {

			//System.out.println("k=" + k++);

			if (num1[i] < num2[j]) {
				i++;
			} else if (num2[j] < num1[i]) {
				j++;
			} else {

				System.out.println("value matched:" + num1[i]);
				i++;
				j++;
			}

		}

	}

}
