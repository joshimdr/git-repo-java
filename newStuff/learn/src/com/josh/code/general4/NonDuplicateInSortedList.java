package com.josh.code.general4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Munish on 6/1/17.
 */
public class NonDuplicateInSortedList {

    static int[] nums = {1,1,2,3,3,9,9,5,5,7,7};


    public static void main(String[] args) {
        System.out.println(findNonDuplicateNumber(nums));

            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String dateInString = "2017-05-05";

        SimpleDateFormat formatterMonthYear = new SimpleDateFormat("MM/yyyy");

            try {

                Date date = formatter.parse(dateInString);
                System.out.println(date);
                System.out.println(formatterMonthYear.format(date));

            } catch (ParseException e) {
                e.printStackTrace();
            }


    }

    public static int findNonDuplicateNumber(int[] nums){

        int low = 0;
        int high = nums.length/2;
        int mid=0;

        while(low<high){
            mid = low + (high-low)/2;
            if(nums[mid*2]==nums[mid*2+1]){
                low=mid+1;
            }else{
                high = mid;
            }
        }


        return nums[low*2];
    }



}
