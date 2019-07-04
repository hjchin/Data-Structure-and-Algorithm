package com.company.Chapter1;

public class Q1_1 {

    public static void main(String[] args){

    }

    public static boolean checkUniqueChar(String value){

        String tmp = "";

        for(int i=0;i<value.length();i++){
            if(tmp.contains(String.valueOf(value.charAt(i)))){
                return false;
            }
            tmp += value.charAt(i);
        }

        return true;
    }
}
