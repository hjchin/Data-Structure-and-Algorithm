package com.company.chapter10;

public class Q10_3 {

    /*
    Search in Rotated Array: Given a sorted array of n integers that has been rotated an unknown
    number of times, write code to find an element in the array. You may assume that the array was
    originally sorted in increasing order.

     EXAMPLE
    lnput:find5in{15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14}
    Output: 8 (the index of 5 in the array)
     */
    public static int search(int[] array, int x){
        /*

            I don't see the rotated array fit the criteria fod binary search
            because it is actually not sorted. I will just use a linear search
         */

        for(int i=0;i<array.length;i++){
            if(array[i] == x){
                return i;
            }
        }

        return -1;
    }
}
