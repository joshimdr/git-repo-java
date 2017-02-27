package com.josh.code.general;

import java.util.Arrays;

public class MergeSort {

	private int[] sortingAlgo(int[] numbers) {

		int[] firstHalf = null;
		int[] secondHalf = null;

		if (numbers.length < 2) {
			return numbers;
		} else {
			firstHalf = sortingAlgo(Arrays.copyOf(numbers, numbers.length / 2));
			secondHalf = sortingAlgo(Arrays.copyOfRange(numbers, numbers.length / 2, numbers.length));

			int[] finalArray = mergeSort(firstHalf, secondHalf);

			return finalArray;

		}

	}

	private int[] mergeSort(int[] numbers1, int[] numbers2) {

		int[] merged = new int[numbers1.length + numbers2.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < numbers1.length && j < numbers2.length) {
			if (numbers1[i] <= numbers2[j]) {
				merged[k] = numbers1[i];
				i++;
				k++;

			} else {
				if (j < numbers2.length) {
					merged[k] = numbers2[j];
					j++;
					k++;
				}

			}

		}

		if (i < numbers1.length) {

			for (; k < merged.length && i < numbers1.length;) {
				merged[k] = numbers1[i];
				i++;
				k++;
			}
		}

		if (j < numbers2.length) {

			for (; k < merged.length && j < numbers2.length;) {
				merged[k] = numbers2[j];
				j++;
				k++;
			}
		}

		return merged;

	}

	public static void main(String[] args) {

		int[] sortedArray = new MergeSort().sortingAlgo(new int[] { 4, 6, 2, 10, 5, 1, 20, 15 });

		for (int i = 0; i < sortedArray.length; i++) {

			System.out.println(sortedArray[i]);
		}

	}

}
