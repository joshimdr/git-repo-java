/**
 * 
 */
package com.josh.tryout.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Munish
 *
 */
public class Helper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList();
		names.add("munish");
		names.add("munish1");
		names.add("munish2");
		names.add("munish3");
		names.add("munish4");

		print(names);

	}

	public static void print(Object obj) {
		if (obj instanceof List<?>) {
			List list = (List) obj;
			for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				Object object = (Object) iterator.next();
				System.out.println(object);
			}

		} else if (obj instanceof Map<?, ?>) {
			Map m = (Map) obj;
			Set keySet = m.keySet();
			for (Object object : keySet) {
				System.out.println("Key:" + object + " Value:" + m.get(object));
			}
		} else if(obj instanceof int[]){
			int[] intVals= (int[])obj;
			System.out.print("[");
			for (int i = 0; i < intVals.length; i++) {
				System.out.print(intVals[i]);
				if(i<intVals.length-1){
					System.out.print(",");
				}
			}
			System.out.println("]");
			
		} else if(obj instanceof String[]){
			String[] stringVals= (String[])obj;
			System.out.print("[");
			for (int i = 0; i < stringVals.length; i++) {
				System.out.print(stringVals[i]);
				if(i<stringVals.length-1){
					System.out.print(",");
				}
			}
			System.out.println("]");
			
		}else {
			System.out.println(obj);
		}

	}

}
