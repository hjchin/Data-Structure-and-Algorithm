package com.company.chapter1;

public class Q1_3 {

    /*
    URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string
    has sufficient space at the end to hold the additional characters, and that you are given the "true"
    length of the string. (Note: If implementing in Java, please use a character array so that you can
    perform this operation in place.)
     */

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
