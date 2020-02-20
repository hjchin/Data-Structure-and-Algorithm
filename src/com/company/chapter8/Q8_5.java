package com.company.chapter8;

public class Q8_5 {

    public static int multiply(int integer1, int factor){
        if(factor == 1){
            return integer1;
        }
        return integer1 + multiply(integer1, --factor);
    }

}
