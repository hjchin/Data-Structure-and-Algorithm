package com.company.chapter5;

public class Q5_6 {

    public static int getMaxLength(int x, int y){
        String xBin = BitOperation.convertIntegerToBinary(x);
        String yBin = BitOperation.convertIntegerToBinary(y);
        return Math.max(xBin.length(), yBin.length());
    }

    public static int convert(int x, int y){
        int value = x & y;
        int maxLen = getMaxLength(x, y);
        String val = BitOperation.convertIntegerToBinary(value);

        System.out.println("x "+BitOperation.convertIntegerToBinary(x));
        System.out.println("y "+BitOperation.convertIntegerToBinary(y));

        System.out.println("maxLen = "+maxLen);
        System.out.println(val);

        while(val.length() < maxLen){
            val = "0"+val;
        }

        System.out.println(val);

        int count = 0;
        for(char c : val.toCharArray()){
            if(c == '0') count++;
        }

        return count;
    }

}
