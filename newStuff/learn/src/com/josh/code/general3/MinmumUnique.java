package com.josh.code.general3;

import com.josh.tryout.util.Helper;

import java.util.*;

import static java.lang.System.out;

/**
 * Created by Munish on 5/1/17.
 */
public class MinmumUnique {


    public static void main(String[] args) {

        List<Integer> al1 = Arrays.asList(2, 5, 4, 8, 6, 2, 2, 7);
        List<Integer> al2 = Arrays.asList(10, 3, 4, 2, 3, 8, 6, 7, 15, 12);

        Helper.print("the min value is:" + findMinUnique(al1, al2));

    }


    private static Integer findMinUnique(List<Integer> l1, List<Integer> l2) {

        Map<Integer, Boolean> master = new HashMap<>();

        Set<Integer> set = new HashSet<>();


        Set<Integer> l1s = new HashSet<>(l1);
        Set<Integer> l2s = new HashSet<>(l2);


        for (Integer i : l1s) {

            if (set.contains(i)) {
                master.put(i, true);
            } else {
                set.add(i);
                master.put(i, false);
            }
        }

        for (Integer i : l2s) {
            if (set.contains(i)) {
                master.put(i, true);
            } else {
                set.add(i);
                master.put(i, false);
            }
        }

        Set<Integer> checkDups = new HashSet<>();
        for (Map.Entry entry : master.entrySet()) {
            if ((Boolean) entry.getValue() == false) {
                checkDups.add((Integer) entry.getKey());
            }

        }

        return findMinimum(checkDups);
    }


    private static Integer findMinimum(Set<Integer> set) {

        int minimum = Integer.MAX_VALUE;

        for (Integer i : set) {
            if (i < minimum) {
                minimum = i;
            }

        }

        return minimum;

    }


}
