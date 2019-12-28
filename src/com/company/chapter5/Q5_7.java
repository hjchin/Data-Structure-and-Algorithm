package com.company.chapter5;

public class Q5_7 {

    public static String swap(String binary){
        StringBuilder newValue = new StringBuilder(binary);
        for(int i=0,j=1; j<binary.length();i+=2,j+=2){
            newValue.setCharAt(i,binary.charAt(j));
            newValue.setCharAt(j,binary.charAt(i));
        }
        return newValue.toString();
    }

}
