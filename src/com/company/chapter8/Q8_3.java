package com.company.chapter8;

public class Q8_3 {

    /*
    Magic Index: A magic index in an array A[ 1 ... n-1] is defined to be an index such that A[ i]
    i. Given a sorted array of distinct integers, write a method to find a magic index, if one exists, in
    array A.


    Answer:
    int[] input = new []{-3,-2,0,1,2,4,6,10,11,12,14};
                         0, 1, 2,3,4,5,6,7, 8, 9, 10

    int[] input = new []{-3,-2,0,1,2,4,7,10,11,12,14};
                         0, 1, 2,3,4,5,6,7, 8, 9, 10
     */

    public static int getMagicIndex(int[] input){
        for(int i=0;i<input.length;i++){
            if(input[i] == i){
                return i;
            }
        }

        return -1;
    }

    public static int getMagicIndexWithBinaryApproach(int[] input){
        return getMagicIndexWithBinaryApproach(input, 0, input.length-1);
    }

    public static int getMagicIndexWithBinaryApproach(int[] input, int startIndex, int endIndex){

        int midIndex = (endIndex - startIndex)/2 + startIndex;

        if(midIndex == startIndex) return -1;

        if(input[midIndex] == midIndex)
            return midIndex;
        else if(input[midIndex] < midIndex){
            return getMagicIndexWithBinaryApproach(input, midIndex, endIndex);
        }else{
            return getMagicIndexWithBinaryApproach(input, startIndex, midIndex);
        }
    }


}
