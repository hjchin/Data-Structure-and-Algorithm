package com.company.Chapter1;

import java.util.*;

public class Q1_2 {

    public static boolean checkPermutation(String string1, String string2){

        HashMap<Character, Integer> mapStr1 = new HashMap<>();
        HashMap<Character, Integer> mapStr2 = new HashMap<>();

        for(int i=0;i<string1.length();i++){
            Character c = string1.charAt(i);
            mapStr1.merge(c, 1, Integer::sum);
        }

        for(int i=0;i<string2.length();i++){
            Character c = string2.charAt(i);
            mapStr2.merge(c, 1, Integer::sum);
        }

        if(mapStr1.size() != mapStr2.size()){
            return false;
        }

        for(Map.Entry<Character, Integer> entry: mapStr1.entrySet()){
           Character character = entry.getKey();
           Integer count = entry.getValue();

           if(mapStr2.get(character) == null){
               return false;
           }else if(!mapStr2.get(character).equals(count)){
                return false;
           }
        }

        return true;
    }

    public static boolean checkPermutation2(String string1, String string2){

        char strg1[] = string1.toCharArray();
        char strg2[] = string2.toCharArray();

        if(strg1.length != strg2.length){
            return false;
        }

        Arrays.sort(strg1);
        Arrays.sort(strg2);

        for(int i=0;i<strg1.length;i++){
            if(strg1[i] != strg2[i]){
                return false;
            }
        }

        return true;
    }
}
