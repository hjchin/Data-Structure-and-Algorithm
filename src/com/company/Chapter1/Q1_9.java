package com.company.Chapter1;

import java.util.Arrays;

public class Q1_9 {

    public static boolean checkRotation(String str1, String str2){

        char[] strArray1 = str1.toCharArray();
        Arrays.sort(strArray1);

        char[] strArray2 = str2.toCharArray();
        Arrays.sort(strArray2);

        String sorted1 = Arrays.toString(strArray1);
        String sorted2 = Arrays.toString(strArray2);

        return isSubstring(sorted1, sorted2);
    }

    private static boolean isSubstring(String str1, String str2){
        return str1.contains(str2);
    }
}
