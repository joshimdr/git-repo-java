package com.josh.code.compare;

import java.util.Collections;
import java.util.LinkedList;

public class RangeComparatorTest {
	
	
	public static void main(String[] args) {
		
		LinkedList<Range> rangeList  = new LinkedList<Range>();
		
		rangeList.add(new Range(4,30));
		rangeList.add(new Range(14,22));
		rangeList.add(new Range(8,23));
		rangeList.add(new Range(34,45));
		rangeList.add(new Range(6,16));
		rangeList.add(new Range(41,22));
		rangeList.add(new Range(2,230));
		
		
		Collections.sort(rangeList, new RangeComparator());
		
		for (Range range : rangeList) {
			
			System.out.println("Range="+range);
			
		}
		
		
	}

}
