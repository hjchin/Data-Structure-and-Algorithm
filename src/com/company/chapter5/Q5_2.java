package com.company.chapter5;

/*
    Binary to String: Given a real number between O and 1 (e.g., 0.72) that is passed in as a double, print
    the binary representation. If the number cannot be represented accurately in binary with at most 32
    characters, print "ERROR:'
 */
public class Q5_2 {

    public static String convertDecimalToBinary(double input) {

        if (input < 0 || input > 1) {
            return "ERROR";
        }

        String value = BitOperation.convertDecimalToBinary(input, 33);
        System.out.println(value);

        if (value.length() == 35) {
            return "ERROR";
        }

        return value;
    }
}
