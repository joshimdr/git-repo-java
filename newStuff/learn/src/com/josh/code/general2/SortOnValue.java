/**
 * 
 */
package com.josh.code.general2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.josh.tryout.util.Helper;

/**
 * @author Munish
 *
 */
public class SortOnValue {

	/**
	 * 
	 */
	public SortOnValue() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<PairObject> a = new ArrayList<PairObject>();

		a.add(new PairObject("a", 3));
		a.add(new PairObject("f", 21));
		a.add(new PairObject("g", 11));
		a.add(new PairObject("b", 10));
		a.add(new PairObject("n", 1));
		a.add(new PairObject("k", 3));
		a.add(new PairObject("l", 1));
		
		sortOnValue(a);

		Helper.print(a);

	}

	private static void sortOnValue(ArrayList<PairObject> a) {

		Collections.sort(a, new Comparator<PairObject>() {

			@Override
			public int compare(PairObject o1, PairObject o2) {
				// TODO Auto-generated method stub
				return (o1.value - o2.value);

			}

		});

	}

}

class PairObject {

	public String key;
	public int value;

	public PairObject(String key, int value) {
		// TODO Auto-generated constructor stub
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PairObject [key=");
		builder.append(key);
		builder.append(", value=");
		builder.append(value);
		builder.append("]");
		return builder.toString();
	}

}
