/**
 * 
 */
package com.josh.code.general;

/**
 * @author munish
 *
 */
public class RecursionSimple {

	public static void main(String[] args) {
		RecursionSimple rsRecursionSimple = new RecursionSimple();

		rsRecursionSimple.recMethod(10);
	}

	private void recMethod(int count) {
		System.out.println(count+" calling recurse");
		if (count <= 0) {
			System.out.println("done!");
		} else {

			recMethod(count - 1);
		}

	}

}
