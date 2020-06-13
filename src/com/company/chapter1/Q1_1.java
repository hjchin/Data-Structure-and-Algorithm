package com.company.chapter1;

public class Q1_1 {

    /*
    Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
    cannot use additional data structures?
     */

    public static boolean checkUniqueChar(String value) {

        String tmp = "";

        for (int i = 0; i < value.length(); i++) {
            if (tmp.contains(String.valueOf(value.charAt(i)))) {
                return false;
            }
            tmp += value.charAt(i);
        }

        return true;
    }
}
