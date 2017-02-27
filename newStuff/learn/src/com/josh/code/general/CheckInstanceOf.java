/**
 * 
 */
package com.josh.code.general;

/**
 * @author munish
 *
 */
public class CheckInstanceOf {

	public CheckInstanceOf() {
		System.out.println("Super class : inside default constructor of CheckInstanceOf ");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CheckInstanceOf ci = new CheckInstanceOf();

		SubCheckInstanceOf sci = new SubCheckInstanceOf();

		if (ci instanceof CheckInstanceOf) {
			System.out.println("TRUE: ci was instance of CheckInstanceOf ");
		}

		if (sci instanceof SubCheckInstanceOf) {
			System.out.println("TRUE: sci was instance of SubCheckInstanceOf ");
		}
		
		if (sci instanceof CheckInstanceOf) {
			System.out.println("TRUE: sci was instance of CheckInstanceOf ");
		}
		
		if (ci instanceof SubCheckInstanceOf) {
			System.out.println("sci was instance of CheckInstanceOf ");
		}else{
			
			System.out.println("FALSE: ci not instance of SubCheckInstanceOf qwaaaaaaaaaaaaaaaaaaaa/Mk/'");
		}
		
		
		
	}

}

class SubCheckInstanceOf extends CheckInstanceOf {

	public SubCheckInstanceOf() {
		System.out.println("Subclass : inside default constructor of SubCheckInstanceOf ");
	}

}
