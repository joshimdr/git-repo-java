/**
 * 
 */
package com.josh.code.general2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.josh.tryout.util.Helper;

/**
 * @author Munish Given an array S of n integers, are there elements a, b, c in
 *         S such that a + b + c = 0? Find all unique triplets in the array
 *         which gives the sum of zero.
 * 
 *         Note: The solution set must not contain duplicate triplets.
 * 
 *         For example, given array S = [-1, 0, 1, 2, -1, -4],
 * 
 *         A solution set is: [ [-1, 0, 1], [-1, -1, 2] ]
 * 
 *
 */
public class ThreeSumProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] nums = new Integer[] { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> result = threeSum(nums);

		for(List<Integer> li : result){
			
			System.out.println();
			System.out.print(" { ");
			for(Integer i : li){
				
				System.out.print(" ");
				System.out.print(i);
				
			}
			System.out.println(" } ");
			
			
		}
		
		
		
	}

	public static List<List<Integer>> threeSum(Integer[] nums) {

		List<Integer> intList = Arrays.asList(nums);
		

		List<List<Integer>> result = new ArrayList<List<Integer>>();

		List<Integer> threeSums = null;

		Collections.sort(intList, new Comparator<Integer>() {
			public int compare(Integer i1, Integer i2) {
				return i1.compareTo(i2);
			}

		});
		Helper.print(intList);

		int i = 0;
		int j = intList.size() - 1;
		int k = 1;

		while (i < j - 1) {

			k = i + 1;
			while (k < j) {

				if (intList.get(i) + intList.get(j) + intList.get(k) == 0) {

					threeSums = new ArrayList<Integer>();

					threeSums.add(intList.get(i));
					threeSums.add(intList.get(j));
					threeSums.add(intList.get(k));

					result.add(threeSums);

					while (intList.get(i) == intList.get(i + 1)) {
						i++;
					}
					while (intList.get(j) == intList.get(j - 1)) {
						j--;
					}

					i++;
					j--;

				} else if (intList.get(i) + intList.get(j) + intList.get(k) < 0) {
					i++;

				} else {
					j--;
				}

				k++;
			}

		}

		return result;

	}

}
