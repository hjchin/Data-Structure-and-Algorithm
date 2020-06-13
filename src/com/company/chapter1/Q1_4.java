package com.company.chapter1;

import java.util.HashMap;
import java.util.Map;

public class Q1_4 {

    /*
    Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palindrome.
    A palindrome is a word or phrase that is the same forwards and backwards. A permutation
    is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
     */

    public static boolean checkPalinDromePermutation(String value){

        char chars[] = value.toLowerCase().toCharArray();
        HashMap<Character, Integer> mapCount = new HashMap();

        for(int i=0;i<chars.length;i++){
            mapCount.merge(chars[i],1, Integer::sum);
        }

        int oddCount = 0;
        for(Map.Entry<Character, Integer> entry: mapCount.entrySet()){
            if(!Character.isSpaceChar(entry.getKey()) && entry.getValue()%2 != 0){
                oddCount++;
            }
        }

        if(oddCount > 1){
            return false;
        }else{
            return true;
        }
    }

}
