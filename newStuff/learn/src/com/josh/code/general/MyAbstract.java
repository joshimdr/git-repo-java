/**
 * 
 */
package com.josh.code.general;

/**
 * @author munish
 *
 */
public abstract class MyAbstract {

	
	//public abstract String testMethod();
	
	public static String iReturnHello(){
		return "hello";
	}

	public String iReturnAString(){
		return "aString";
	}
	
	
	
	public static void main(String[] args) {
		 MyAbstract.iReturnHello();
	}
	
}
