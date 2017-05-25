package com.josh.code.general3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Munish on 5/23/17.
 */
public class PhoneLetterCombinations {


    public static void main(String[] args) {

        //System.out.println(letterCombinations("246"));

        System.out.println(letterCombinations1("23").size());

        System.out.println(letterCombinations1("23"));

        System.out.println(letterCombinations("23"));

    }

    private final static String[] LETTERS = {"", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static List<String> letterCombinations1(String digits) {
        List<String> res = new ArrayList<>();
        combination("", digits, 0, res);
        return res;
    }

    private static void combination(String prefix, String digits, int idx, List<String> res) {
        if (idx < digits.length()) {
            for (char letter : LETTERS[digits.charAt(idx) - '0'].toCharArray()) {
                System.out.println("letter:"+letter + " prefix:"+prefix+ " idx:"+idx);
                combination(prefix + letter, digits, idx + 1, res);
            }
        } else {
            res.add(prefix);
        }

    }


    public static List<String> letterCombinations(String digits) {
        List<String> res = Arrays.asList("");
        for (char dig : digits.toCharArray()) {
            List<String> track = new ArrayList<>();
            for (char letter : LETTERS[dig - '0'].toCharArray()) {
                for (String prefix : res) {
                    track.add(prefix + letter);
                }
            }
            res = track;
        }
        return res;
    }


}
