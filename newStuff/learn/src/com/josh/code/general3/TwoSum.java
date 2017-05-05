package com.josh.code.general3;

import com.josh.tryout.util.Helper;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Munish on 5/1/17.
 */
public class TwoSum {


    public static void main(String[] args) {

        Helper.print(twoSum(new int[]{5,3,2,7,11,14,4}, 10));

    }


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();

        for(int i =0; i<nums.length; i++){
            m.put(target - nums[i], i);
        }

        int index = 0;
        int secondInd = 0;

        for(int i=0; i<nums.length;i++){
            if(m.containsKey(nums[i])){
                secondInd = (Integer)m.get(nums[i]);
                index = i;
                if(i!=secondInd)
                    break;
            }

        }

        return new int[]{index, secondInd};

    }
}
