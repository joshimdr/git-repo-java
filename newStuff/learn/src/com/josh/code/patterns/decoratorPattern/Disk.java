/**
 * 
 */
package com.josh.code.patterns.decoratorPattern;

/**
 * @author Munish
 *
 */
public class Disk extends ComputerDeco {
	
	Computer c;
	
	public Disk(Computer c) {
		// TODO Auto-generated constructor stub
		this.c = c;
	}
	
	public String desc(){
		return c.desc() +" and "+" a disk";
		
	}


}
