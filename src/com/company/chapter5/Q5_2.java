package com.company.chapter5;

public class Q5_2 {

    public static String convertDecimalToBinary(double input){

        if(input < 0 || input > 1){
            return "ERROR";
        }

        String value = BitOperation.convertDecimalToBinary(input, 33);
        System.out.println(value);

        if(value.length() == 35){
            return "ERROR";
        }

        return value;
    }
}
