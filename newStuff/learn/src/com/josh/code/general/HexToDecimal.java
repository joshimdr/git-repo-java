package com.josh.code.general;

public class HexToDecimal {

    public static int hex2Decimal(String s) {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            System.out.println("val="+val);
            System.out.println("decimal="+d);
            val = 16*val + d;
        }
        return val;
    }


    // precondition:  d is a nonnegative integer
    public static String decimal2Hex(int d) {
        String digits = "0123456789ABCDEF";
        if (d == 0) return "0";
        String hex = "";
        while (d > 0) {
            int digit = d % 16;                // rightmost digit
            hex = digits.charAt(digit) + hex;  // string concatenation
            d = d / 16;
        }
        return hex;
    }
    
   
    
    public static long sixtyTwo2Decimal(String s) {
    	 String digits = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        //s = s.toUpperCase();
        long val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 62*val + d;
        }
        return val;
    }

    // precondition:  d is a nonnegative integer
    public static String decimal2SixtyTwo(long d) {
        String digits = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        if (d == 0) return "0";
        String hex = "";
        while (d > 0) {
            long digit = d % 62;                // rightmost digit
            hex = digits.charAt((int)digit) + hex;  // string concatenation
            d = d / 62;
        }
        return hex;
    }
    

    public static void main(String[] args) {
  
    	int decimal = hex2Decimal("abc");
        //StdOut.println(decimal);
        
        System.out.println(decimal);
        String hex = decimal2Hex(decimal);
        System.out.println(hex);
        
        System.out.println(decimal2SixtyTwo(678544326));
        // gives T5gxu
        System.out.println(sixtyTwo2Decimal("T5gxu"));
        
        //StdOut.println(hex);
    }
}
