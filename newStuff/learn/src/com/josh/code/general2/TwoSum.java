package com.josh.code.general2;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i =0; i< nums.length;i++){
            
            for(int j=i+1; j<nums.length; j++){
                
                 if(nums[i]+nums[j]==target){
                     
                     result[0]= i;
                     result[1]= j;
                     return result;
                 }
                
            }
            
        }
        return result;
    }
    
    
    
    public static void main(String[] args) {
		
    	int result[] = twoSum(new int[]{3,2,4}, 6);

    	
    	for (int i = 0; i < result.length; i++) {
			
    		System.out.println(result[i]);
		}
    	
	}
    
    
    
}