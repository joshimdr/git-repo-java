/**
 * 
 */
package com.josh.code.general;

/**
 * @author munish
 *
 */
public class FibonacciNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Fib Recursive=" + fibRecursion(5));
		System.out.println("Fib Normal=" + fibNormal(5));
	}

	// 0,1,1,2,3,5,8

	public static int fibRecursion(int n) {
		
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibRecursion(n - 1) + fibRecursion(n - 2);
			// System.out.println(sum);
		}
		
		
	}

	public static int fibNormal(int n) {

		int fib1 = 0;
		int fib2 = 1;
		int sum = 0;

		while (n > 1) {
			sum = fib1 + fib2;
			fib1 = fib2;
			fib2 = sum;
			System.out.println(fib1);
			
			n--;
		}

		return sum;
	}

}
