package com.company.chapter5;

/*
    Pairwise Swap: Write a program to swap odd and even bits in an integer with as few instructions as
    possible (e.g., bit 0 and bit 1 are swapped, bit 2 and bit 3 are swapped, and so on).
 */
public class Q5_7 {

    public static String swap(String binary) {
        StringBuilder newValue = new StringBuilder(binary);
        for (int i = 0, j = 1; j < binary.length(); i += 2, j += 2) {
            newValue.setCharAt(i, binary.charAt(j));
            newValue.setCharAt(j, binary.charAt(i));
        }
        return newValue.toString();
    }

}
