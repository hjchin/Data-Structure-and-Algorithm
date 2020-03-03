package com.company.chapter10;

import java.util.ArrayList;
import java.util.Arrays;

public class Q10_2 {
    /*

    Group Anagrams: Write a method to sort an array ot strings so that all tne anagrnms are next to
    each other.

     */
    public static void sort(String[] strings){
        ArrayList<String> sortedString = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        for(int i=0;i<strings.length;i++){
            String sort = sortString(strings[i]);
            int index = sortedString.indexOf(sort);
            if(index < 0){
                sortedString.add(sort);
                result.add(strings[i]);
            }else{
                sortedString.add(index,sort);
                result.add(index, strings[i]);
            }
        }

        for(int i=0;i<strings.length;i++){
            strings[i] = result.get(i);
        }
    }

    public static String sortString(String string){
        char[] chr = string.toCharArray();
        Arrays.sort(chr);
        return new String(chr);
    }
}
