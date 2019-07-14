package com.company.chapter1;

public class Q1_5 {

    public static boolean oneAway(String str1, String str2){

        int len1 = str1.length();
        int len2 = str2.length();

        if(Math.abs(len1-len2) > 1){
            return false;
        }

        char strArray1[] = str1.toCharArray();
        char strArray2[] = str2.toCharArray();

        for(int i=0;i<strArray1.length && i<strArray2.length;i++){
            if(strArray1[i] != strArray2[i]){
                if(strArray1.length == strArray2.length){
                    String remainString1 = constructString(strArray1, i);
                    String remainString2 = constructString(strArray2, i);
                    return remainString1.equals(remainString2);
                }else if(strArray1.length < strArray2.length){
                    String newString1 = str1;
                    String newString2 = constructString(strArray2,i);
                    return newString1.equals(newString2);
                }else{
                    String newString1 = constructString(strArray1,i);
                    String newString2 = str2;
                    return newString1.equals(newString2);
                }
            }
        }

        return true;
    }

    private static String constructString(char[] charArray, int indexToRemove){
        String str = "";

        for(int i=0;i<charArray.length;i++){
            if(i != indexToRemove){
                str += charArray[i];
            }
        }

        return str;
    }
}
