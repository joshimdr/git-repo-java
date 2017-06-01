package com.josh.code.general3;

/**
 * Created by Munish on 5/30/17.
 *
 *
 * Given a sorted array consisting of only integers where every element appears twice except for one element which appears once. Find this single element that appears only once.

 Example 1:
 Input: [1,1,2,3,3,4,4,8,8]
 Output: 2
 Example 2:
 Input: [3,3,7,7,10,11,11]
 Output: 10
 *
 */
public class NonDuplicateNumber {


    public static void main(String[] args) {

        int[] nums = {1,1,2,2,3,3,4,4,5,5,6,6,7,7};

        System.out.println(singleNonDuplicate(nums));
    }



        public static int singleNonDuplicate(int[] nums) {
            // binary search
            int n=nums.length, lo=0, hi=n/2;
            while (lo < hi) {
                int m = (lo + hi) / 2;

                if (nums[2*m]!=nums[2*m+1]){
                    hi = m;
                }
                else{
                    lo = m+1;
                }

            }
            return nums[2*lo];
        }



    public static int singleNonDuplicate2(int[] nums) {
        int low = 0;
        int high = nums.length-1;

        while(low < high) {
            int mid = low + (high - low)/2;
            if(nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1])
                return nums[mid];
            else if(nums[mid] == nums[mid+1] && mid % 2 == 0)
                low = mid+1;
            else if(nums[mid] == nums[mid-1] && mid % 2 == 1)
                low = mid+1;
            else
                high = mid-1;
        }
        return nums[low];
    }
    }


