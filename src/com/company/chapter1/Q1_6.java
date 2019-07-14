package com.company.chapter1;

import java.util.ArrayList;

public class Q1_6 {

    public static String compressString(String value){

        char chars[] = value.toCharArray();
        char lastChar = 0;
        int lastCount = 0;

        ArrayList<Character> cList = new ArrayList();
        ArrayList<Integer> iList = new ArrayList();

        for(int i=0;i<chars.length;i++){
            if(lastChar == 0){
                lastChar = chars[i];
                lastCount++;
                continue;
            }

            if(chars[i] != lastChar){
                cList.add(lastChar);
                iList.add(lastCount);

                lastChar = chars[i];
                lastCount = 1;
            }else{
                lastCount++;
            }

            if(i == chars.length-1){
                cList.add(lastChar);
                iList.add(lastCount);
            }
        }

        StringBuilder compressed = new StringBuilder();
        for(int i=0;i<cList.size();i++){
            compressed.append(cList.get(i)+String.valueOf(iList.get(i)));
        }

        if(compressed.toString().length() > value.length()){
            return value;
        }else{
            return compressed.toString();
        }
    }
}
