package com.company.chapter8;

import java.util.ArrayList;
import java.util.TreeSet;

public class Q8_9 {

    /*
    Parens: Implement an algorithm to print all valid (e.g., properly opened and closed) combinations
    of n pairs of parentheses.
    EXAMPLE
    Input: 3
    Output: ( ( () ) ) , ( () () ) , ( () ) () , () ( () ) , () () ()

     */
    public static TreeSet<String> printBrace(int pair){
        if(pair == 1){
            TreeSet<String> array = new TreeSet<>();
            array.add("()");
            return array;
        }

        TreeSet<String> set = new TreeSet<>();

        TreeSet<String> ts = printBrace(pair-1);
        for(String s: ts){
            set.add("("+s+")");
        }

        for(int i=1;i<pair;i++){
            TreeSet<String> leftSet = printBrace(i);
            TreeSet<String> rightSet = printBrace(pair-i);

            TreeSet<String> mergeSet = new TreeSet<>();
            for(String ls: leftSet){
                for(String rs: rightSet){
                    mergeSet.add(ls+rs);
                }
            }
            set.addAll(mergeSet);
        }


        return set;
    }
}
