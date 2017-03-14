package com.josh.code.patterns.decoratorPattern;

public class CD extends ComputerDeco {
	
	Computer c;
	
	public CD(Computer c) {
		// TODO Auto-generated constructor stub
	  this.c = c;
	}
	
	public String desc(){
		return c.desc() +" and "+" a CD";
		
	}


}
