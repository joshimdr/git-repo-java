/**
 * 
 */
package com.josh.code.general;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @author munish
 *
 */
public class TwoSumProblem {

	/**
	 * @param args
	 */

	static int sum = 8;

	private static HashMap twoNumbers = new HashMap();

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(2, 3, 5, 6, 12, 15, 7, 1, 14, 9, 11);

		findTwoSum(numbers);

		System.out.println(twoNumbers);

	}

	private static void findTwoSum(List<Integer> numbers) {
		HashSet hs = new HashSet();

		for (Integer integer : numbers) {
			hs.add(integer);
		}

		for (Integer integer : numbers) {
			int diff = sum - integer;
			if (hs.contains(diff)) {
				twoNumbers.put(integer, diff);
			}

		}
	}

}
