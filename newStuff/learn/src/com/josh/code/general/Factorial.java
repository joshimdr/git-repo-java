package com.josh.code.general;

public class Factorial {

	
	public static int factorial(int num){
		
		if(num<=1){
			return 1;
		}else{
			
			return num * factorial(num-1);
		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(factorial(5));
		String aString = "s";
		
		System.out.println(aString.substring(1));
		
		
	}
	
}
