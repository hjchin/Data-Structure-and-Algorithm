package com.company.chapter5;

import java.util.Collections;

/*
Flip Bit to Win: You have an integer and you can flip exactly one bit from a 0 to a 1. Write code to
find the length of the longest sequence of ls you could create.
 */
public class Q5_3 {

    public static int getLongestBit(String binary) {
        int lastPosition = 0;
        int lastMaxLength = 0;

        for (int i = 0; i < binary.length(); i++) {
            StringBuilder temp = new StringBuilder(binary);
            if (temp.charAt(i) == '0') {
                temp.setCharAt(i, '1');
            }

            int maxLength = getMaxLengthOfBit(temp.toString());
            if (maxLength > lastMaxLength) {
                lastPosition = i;
                lastMaxLength = maxLength;
            }
        }

        StringBuilder newValue = new StringBuilder(binary);
        newValue.setCharAt(lastPosition, '1');

        System.out.println(newValue);

        return lastMaxLength;
    }

    public static int getMaxLengthOfBit(String binary) {

        String[] array = binary.split("0");

        int maxLength = 0;
        for (String i : array) {
            if (i.length() > maxLength) {
                maxLength = i.length();
            }
        }

        return maxLength;
    }

}
