package com.company.chapter8;

public class Q8_5 {

    /*
    Recursive Multiply: Write a recursive function to multiply two positive integers without using the
    *operator.You can use addition, subtraction, and bit shifting, but you should minimize the number
    of those operations
     */

    public static int multiply(int integer1, int factor){
        if(factor == 1){
            return integer1;
        }
        return integer1 + multiply(integer1, --factor);
    }

}
