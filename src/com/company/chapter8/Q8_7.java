package com.company.chapter8;

import java.util.ArrayList;
import java.util.TreeSet;

public class Q8_7 {

    /*
    Permutations without Dups: Write a method to compute all permutations of a string of unique
    characters.

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
            String right = value.replace(left,"");
            TreeSet<String> p = permute(right);
            for(String s: p){
                array.add(left+s);
            }
        }
        return array;
    }
}
