package com.josh.code.general4;


import com.josh.tryout.util.Helper;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindUniqueMinimum {

    static int[] list1 = {1, 2, 3, 4, 5, 6, 8, 9, 23, 45};

    static int[] list2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 23, 45};

    static int minUnique = Integer.MAX_VALUE;


    public static void main(String[] args) {
        minUnique();

        Helper.print(minUnique);

    }


    public static void minUnique() {

        Set<Integer> set = new HashSet();

        List<Integer> list = new ArrayList();

        for (int i : list1) {
            set.add(i);
        }

        for (int i2 : list2) {
            if (!set.contains(i2)) {
                if (i2 < minUnique) {
                    minUnique = i2;
                }
            }
        }


    }


}


