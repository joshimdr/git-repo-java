package com.josh.code.general3;

import com.josh.tryout.util.Helper;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Munish on 5/4/17.
 */
public class UniqueChars {


    public static void main(String[] args) {

        //Helper.print(lengthOfLongestSubstring("abcabcbb"));
        //Helper.print(lengthOfLongestSubstring("bbbbb"));
        Helper.print(lengthOfLongestSubstring("pwwkew"));

    }


    public static String lengthOfLongestSubstring(String s) {

        int i = 0, j = 0, max = 1;

        Set charsSeenSoFar = new HashSet<String>();
        String maxUniqueString = "";

        while (i < s.length() && j < s.length()) {

            if (!charsSeenSoFar.contains(s.charAt(j))) {
                charsSeenSoFar.add(s.charAt(j++));

                if (max <= charsSeenSoFar.size()) {
                    max = charsSeenSoFar.size();
                    maxUniqueString = s.substring(i, j);
                }

            } else {
                charsSeenSoFar.remove(s.charAt(i++));

            }


        }

        System.out.println("max:" + max);
        return maxUniqueString;
    }


}
