/**
 * 
 */
package com.josh.code.general;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author munish
 *
 */
public class MergeLinkedListsSorted {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> list1 = new LinkedList<Integer>(Arrays.asList(2, 6, 7, 10, 30, 40, 70));
		List<Integer> list2 = new LinkedList<Integer>(Arrays.asList(3, 5, 9, 25, 35, 45, 60, 100));

		List<Integer> finalList = mergeTwoSortedLists(list1, list2);

		Iterator<Integer> listIt = finalList.iterator();

		while (listIt.hasNext()) {
			System.out.print("  " + listIt.next());
		}

	}

	public static List<Integer> mergeTwoSortedLists(List<Integer> l1, List<Integer> l2) {

		LinkedList<Integer> mergedSortedList = new LinkedList<Integer>();

		int i = 0;
		int j = 0;

		int sizel1 = l1.size();
		int sizel2 = l2.size();

		while (i < sizel1 && j < sizel2) {
			if (l1.get(i).intValue() <= l2.get(j).intValue()) {

				mergedSortedList.add(l1.get(i));
				i++;

			} else if (l2.get(j).intValue() < l1.get(i).intValue()) {

				mergedSortedList.add(l2.get(j));
				j++;

			}

		}

		while (i < sizel1) {
			mergedSortedList.add(l1.get(i++));
		}
		while (j < sizel2) {
			mergedSortedList.add(l2.get(j++));
		}

		return mergedSortedList;

	}

}
