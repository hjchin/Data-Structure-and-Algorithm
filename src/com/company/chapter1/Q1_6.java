package com.company.chapter1;

import java.util.ArrayList;

public class Q1_6 {

    /*
    String Compression: Implement a method to perform basic string compression using the counts
    of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
    "compressed" string would not become smaller than the original string, your method should return
    the original string. You can assume the string has only uppercase and lowercase letters (a - z).

     */
    public static String compressString(String value) {

        char chars[] = value.toCharArray();
        char lastChar = 0;
        int lastCount = 0;

        ArrayList<Character> cList = new ArrayList();
        ArrayList<Integer> iList = new ArrayList();

        for (int i = 0; i < chars.length; i++) {
            if (lastChar == 0) {
                lastChar = chars[i];
                lastCount++;
                continue;
            }

            if (chars[i] != lastChar) {
                cList.add(lastChar);
                iList.add(lastCount);

                lastChar = chars[i];
                lastCount = 1;
            } else {
                lastCount++;
            }

            if (i == chars.length - 1) {
                cList.add(lastChar);
                iList.add(lastCount);
            }
        }

        StringBuilder compressed = new StringBuilder();
        for (int i = 0; i < cList.size(); i++) {
            compressed.append(cList.get(i) + String.valueOf(iList.get(i)));
        }

        if (compressed.toString().length() > value.length()) {
            return value;
        } else {
            return compressed.toString();
        }
    }
}
