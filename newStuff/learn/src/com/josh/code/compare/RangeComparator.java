package com.josh.code.compare;

import java.util.Comparator;

public class RangeComparator implements Comparator<Range>{

	@Override
	public int compare(Range o1, Range o2) {
		// TODO Auto-generated method stub
		
		int returnThis = 0;
		
		if(o1 == null || o2 == null){
			return -1;
		}
		int rangeO1 = o1.startRange;
		int rangeO2 = o2.startRange;
		
		int result = rangeO1 - rangeO2;
		
		if(result<0){
			returnThis = -1;
		}else if(result>0){
			returnThis = 1;
		}else 
			returnThis = 0;
		
		return returnThis;
	}
	
	
	
	

}
