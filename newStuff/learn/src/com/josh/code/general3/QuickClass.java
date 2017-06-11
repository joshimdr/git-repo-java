package com.josh.code.general3;

import com.josh.tryout.util.Helper;

/**
 * Created by Munish on 5/2/17.
 */
public class QuickClass {


    public static void main(String[] args) {

        Helper.print(findMedianSortedArrays(new int[]{1,3},new int[]{2}));




    }



        public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

            int[] result = new int[nums1.length+nums2.length];
            double answer= 0;

            int i=0,j=0,k=0;
            while(i < result.length && j<nums1.length && k<nums2.length){
                if(nums1[j] < nums2[k]){
                    result[i++] = nums1[j++];
                }else if(nums1[j] > nums2[k]){
                    result[i++] = nums2[k++];
                }else{
                    result[i++] = nums1[j++];
                    result[i++] = nums2[k++];

                }

            }
            while(j< nums1.length){
                result[i++]= nums1[j++];
            }
            while(k< nums2.length){
                result[i++]= nums2[k++];
            }

            if(result.length%2==0){
                int sum = result[result.length/2-1] +(result[(result.length/2)]);
                answer = sum/2;
            }
            else{
                answer = result[(result.length/2)];
            }

            return answer;
        }





}
