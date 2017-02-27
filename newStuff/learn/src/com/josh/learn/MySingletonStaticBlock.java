/**
 * 
 */
package com.josh.learn;

/**
 * @author munish
 *
 */
public class MySingletonStaticBlock {
	
	
	private static MySingletonStaticBlock ms=null;
	
	static{
		ms = new MySingletonStaticBlock();
	}
	
	private MySingletonStaticBlock(){
		
	}
	
	public static MySingletonStaticBlock getInstance(){
		return ms;
	}
	

}
