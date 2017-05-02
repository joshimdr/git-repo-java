package com.josh.code.patterns.decorator;

public class Monitor extends ComputerDeco {
	
	Computer c;
	public Monitor(Computer c) {
		// TODO Auto-generated constructor stub
		this.c = c;
	}
	
	public String desc(){
		return c.desc() +" and "+" a monitor";
		
	}


}
