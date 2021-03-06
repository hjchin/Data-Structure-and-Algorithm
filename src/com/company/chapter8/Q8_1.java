package com.company.chapter8;

import java.util.Arrays;

public class Q8_1 {

    /*

        Triple Step: A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3
        steps at a time. Implement a method to count how many possible ways the child can run up the
        stairs.

        Answer:

        example
                                4

                         /      |      \

                      4-1=3   4-2=2    4-1=3

                 /      |      \

              3-1=2   3-2=1   3-3=0

           /    |    \

        2-1=1 2-2=0



     */
    public static int getStep(int n){
        if(n < 0){
            return 0;
        }else if(n == 0){
            return 1;
        }else
            return getStep(n-1) + getStep(n-2)+getStep(n-3);
    }

    private static int getStepWCache(int n, int[] cache){
        if(n < 0) {
            return 0;
        }else if(n==0){
            return 1;
        }else if(cache[n] > -1){
            return cache[n];
        }else {
            cache[n]= getStepWCache(n-1, cache)+getStepWCache(n-2,cache)+getStepWCache(n-3, cache);
            return cache[n];
        }
    }

    public static int getStepWithCache(int n){
        int[] cache = new int[n+1];
        Arrays.fill(cache, -1);
        return getStepWCache(n, cache);
    }

}
