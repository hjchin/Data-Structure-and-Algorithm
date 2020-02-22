package com.company.chapter8;

import java.util.ArrayList;
import java.util.TreeSet;

public class Q8_8 {

    /*
    Permutations with Dups: Write a method to compute all permutations of a string whose characters are not necessarily unique.
    The list of permutations should not have duplicates.
     */
    public static TreeSet<String> permute(String value){
        if(value.length() == 1){
            ArrayList list = new ArrayList();
            list.add(value);
            return new TreeSet<>(list);
        }

        char[] valueChars = value.toCharArray();

        TreeSet<String> array = new TreeSet<>();
        for(int i=0;i<valueChars.length;i++){
            String left = String.valueOf(valueChars[i]);
            String right = value.substring(0,i)+value.substring(i+1);
            TreeSet<String> p = permute(right);
            for(String s: p){
                array.add(left+s);
            }
        }
        return array;
    }
}
