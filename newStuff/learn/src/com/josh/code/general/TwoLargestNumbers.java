/**
 * 
 */
package com.josh.code.general;

/**
 * @author munish
 *
 */
public class TwoLargestNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] intArray = { 2, 4, 64, 7, 8, 13, 62, 37, 45, 33, 1, 90, 12, 15, 6 };

		int[] result = findTwoLargest(intArray);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}

	public static int[] findTwoLargest(int arr[]) {

		int large1 = 0;
		int large2 = 0;

		if (arr == null) {

			System.out.println("Throw a null pointer exception !");

		}

		else if (arr.length < 2) {

			System.out.println("Not enough parameters !");

		} else {
			for (int i = 0; i < arr.length; i++) {

				if (arr[i] > large1) {

					large2 = large1;
					large1 = arr[i];

				} else if (arr[i] > large2) {

					large2 = arr[i];

				}

			}
		}
		int[] result = new int[] { large1, large2 };

		return result;

	}

}
