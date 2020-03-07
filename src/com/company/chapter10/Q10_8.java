package com.company.chapter10;

/*
    Find Duplicates: You have an array with all the numbers from 1 to N, where N is at most 32,000. The
    array may have duplicate entries and you do not know what N is. With only 4 kilobytes of memory
    available, how would you print all duplicate elements in the array?
 */
public class Q10_8 {

    public static void printDuplicate(int[] input){
        boolean[] booleans = new boolean[32000];
        for(int i = 0;i<input.length;i++){
            int val = input[i];
            int index = val-1;
            if(booleans[index]){
                System.out.println("duplicate value "+val);
            }else{
                booleans[index] = true;
            }
        }
    }
}
