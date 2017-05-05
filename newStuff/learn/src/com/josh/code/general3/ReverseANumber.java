package com.josh.code.general3;

import com.josh.tryout.util.Helper;

/**
 * Created by Munish on 5/2/17.
 */
public class ReverseANumber {




    public static void main(String[] args) {

        Helper.print(reverseNumber(1234));

    }


    public static int reverseNumber(int numb){

        int result =0;

        while(numb%10>0){

            result = result*10 + numb%10;

            numb = numb/10;


        }

        return result;
    }



}
