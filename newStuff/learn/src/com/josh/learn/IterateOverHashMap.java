package com.josh.learn;

import com.josh.tryout.util.Helper;

import java.util.*;

import static java.lang.System.out;

/**
 * Created by Munish on 4/25/17.
 */
public class IterateOverHashMap {


    public static void main(String[] args) {


        HashMap<String,Integer> hm = new HashMap<String,Integer>();

        hm.put( "munish1", 1);

        hm.put("munish4", 4);

        hm.put( "munish2", 2);
        hm.put( "munish3", 3);

        Set<Map.Entry<String,Integer>> entries = hm.entrySet();


        for (Map.Entry entry : entries) {

            out.print("key:"+entry.getKey());
            out.print(" value:"+entry.getValue());
            out.println();

        }

        List setAsList = new ArrayList(entries);

        Collections.sort(setAsList, new Comparator<Map.Entry>(){

            @Override
            public int compare(Map.Entry o1, Map.Entry o2) {
                return (Integer) o1.getValue()-(Integer)o2.getValue();
            }
        });


        Helper.print(setAsList);


    }


}
