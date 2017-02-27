/**
 * 
 */
package com.josh.code.general;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * @author munish
 *
 */
public class LRUCache extends LinkedHashMap<Integer, String> {
	
	int cacheSize = 5;

	/**
	 * 
	 */
	
	public LRUCache(int size){
		super(size, .75f, true);
		cacheSize = size;
		
	}
	
	
	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<Integer, String> eldest) {
		System.out.println("Removing the oldest entry");
		return size()>cacheSize;
		
	}
	
	private static final long serialVersionUID = 1L;
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LRUCache lrc= new LRUCache(5);
		
		lrc.put(1, "Munish");
		lrc.put(2, "Munish2");
		lrc.put(3, "Munish3");
		lrc.put(4, "Munish4");
		lrc.put(5, "Munish5");
		lrc.put(6, "Munish6");
		lrc.put(7, "Munish7");
		
		System.out.println(lrc);
		
		

	}

}
