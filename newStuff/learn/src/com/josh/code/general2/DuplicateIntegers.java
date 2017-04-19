package com.josh.code.general2;

import java.util.ArrayList;
import java.util.List;

import com.josh.tryout.util.Helper;

public class DuplicateIntegers {
	
	
	public static void main(String[] args) {
		
		
		int[] nums = {12,10,1,3,2,4,5,2,6,7,5, 9};
		
		List<Integer> dis = DuplicateIntegers.findDisappearedNumbers(nums);
		
		Helper.print(dis);
		
	}
	
	 public static List<Integer> findDisappearedNumbers(int[] nums) {
	        List<Integer> ret = new ArrayList<Integer>();
	        
	        for(int i = 0; i < nums.length; i++) {
	            int val = Math.abs(nums[i]) - 1;
	            if(nums[val] > 0) {
	                nums[val] = -nums[val];
	                
	            }
	        }
	        
	        for(int i = 0; i < nums.length; i++) {
	            if(nums[i] > 0) {
	                ret.add(i+1);
	            }
	        }
	        return ret;
	    }

}
