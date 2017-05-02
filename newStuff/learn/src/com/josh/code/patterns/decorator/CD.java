package com.josh.code.patterns.decorator;

public class CD extends ComputerDeco {
	
	Computer c;
	static int counter =0;
	
	public CD(Computer c) {
		// TODO Auto-generated constructor stub
	  this.c = c;
	}
	
	public String desc(){
		return c.desc() +" and "+" a CD";
		
	}


}
