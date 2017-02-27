package com.josh.code.general;

import java.util.HashMap;

public class HashMapTest {
	
	
	public static void main(String[] args) {
		
		HashMap<String, Value> hm = new HashMap<String, Value>();
		
		
		Value prev = (Value)hm.put("munish", new Value(1));
		Value prev2 = (Value)hm.put("munish2", new Value(1));
		Value prev3 = (Value)hm.put("munish3", new Value(1));
		Value prev4 = (Value)hm.put("munish4", new Value(1));
		Value newValue5 = new Value(1);
		Value prev5 = (Value)hm.put("munish", newValue5);
		
		System.out.println(prev);
		System.out.println(prev2);
		System.out.println(prev3);
		System.out.println(prev4);
		System.out.println(prev5);
		
		Integer old =0;
		
		if((old = (Integer)prev5.getVal())!=null){
			 newValue5.setVal(old+1);
		}
		
		System.out.println(hm.get("munish"));
		
		
	}
	
	
	
	

}

class Value{
	
	int val = 0;

	/**
	 * @param val
	 */
	public Value(int val) {
		this.val = val;
	}

	/**
	 * @return the val
	 */
	public int getVal() {
		return val;
	}

	/**
	 * @param val the val to set
	 */
	public void setVal(int val) {
		this.val = val;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.valueOf(val);
	}
	
	
	
	
}
