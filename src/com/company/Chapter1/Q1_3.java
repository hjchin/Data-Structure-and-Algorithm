package com.company.Chapter1;

public class Q1_3 {

    public static String replaceWhiteSpace(String str, int len){
        String value = "";
        char v[] = str.toCharArray();

        for(int i=0;i<len;i++){
            if(v[i] == ' '){
                value += "%20";
            }else{
                value += v[i];
            }
        }

        return value;
    }
}
