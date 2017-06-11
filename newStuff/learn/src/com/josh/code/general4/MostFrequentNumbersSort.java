package com.josh.code.general4;

import com.josh.tryout.util.Helper;

import java.util.*;

/**
 * Created by Munish on 6/8/17.
 */
public class MostFrequentNumbersSort {


    public static void main(String[] args) {

        frequentSorting();

    }



    public static void frequentSorting(){



        int[] numbs = {1,1,3,4,5,4,4,3,1,5,3,2,5,5,5,5,6,8,4,3,5,2,5,5,3,5,5,6,5,5};

        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for(int n: numbs){

            if(hm.containsKey(n)){
                hm.put(n, hm.get(n)+1);

            }else{
                hm.put(n,1);
            }

        }


        Set entrySet =  hm.entrySet();

        List entryList = new ArrayList(entrySet);


        Collections.sort(entryList, new Comparator() {


            @Override
            public int compare(Object o1, Object o2) {
                return (int)((Map.Entry)o2).getValue() - (int)((Map.Entry)o1).getValue();

            }
        });


        Helper.print(entryList);


    }

}
