/**
 * 
 */
package com.josh.code.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Munish
 *
 */
public class LoopCollections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		loopHashTable();
		String[] word = { "munish", "munish", "kum", "kumar", "joshi" };
		
		Map<String, MutableInt> freq = new HashMap<String, MutableInt>();
		
		for(String w: word){
			incrementValue(w, freq);
		}
		
		for(String wo : freq.keySet()){
			System.out.println(freq.get(wo).get());
		}
		
	}

	private static void incrementValue(String word, Map<String, MutableInt> freq) {
		MutableInt count = freq.get(word);
		if (count == null) {
		    freq.put(word, new MutableInt());
		}
		else {
		    count.increment();
		}
	}

	private static void loopHashTable() {
		HashMap<String, Value> hm = new HashMap<String, Value>();

		Value prev = (Value) hm.put("munish", new Value(1));
		Value prev2 = (Value) hm.put("munish2", new Value(1));
		Value prev3 = (Value) hm.put("munish3", new Value(1));
		Value prev4 = (Value) hm.put("munish4", new Value(1));
		Value newValue5 = new Value(1);
		Value prev5 = (Value) hm.put("munish", newValue5);

		

		Integer old = 0;

		Value res = null;

		if ((res = (Value) hm.get("munish")) != null) {
			res.setVal(res.getVal()+100);
			//hm.put("munish", res);
		}else{
			hm.put("munish", new Value(1));
		}

		/*if ((old = (Integer) prev5.getVal()) != null) {
			System.out.println("increment old="+old);
			newValue5.setVal(old + 1);
		}*/
		
		
		System.out.println("****");
		System.out.println(hm.get("munish"));
		System.out.println("****");
		
		
	}

}

class MutableInt {
	  int value = 1; // note that we start at 1 since we're counting
	  public void increment () { ++value;      }
	  public int  get ()       { return value; }
	  
	  
	}
	
	

class Value {

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
	 * @param val
	 *            the val to set
	 */
	public void setVal(int val) {
		this.val = val;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.valueOf(val);
	}

}
