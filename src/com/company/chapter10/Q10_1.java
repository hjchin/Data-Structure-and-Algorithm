package com.company.chapter10;

public class Q10_1 {

    /*

    Sorted Merge: You are given two sorted arrays, A and B, where A has a large enough buffer at the
    end to hold B. Write a method to merge B into A in sorted order.


    e.g A:
    1,2,3,5,8

    4,5,6
     */
    public static void sort(int[] arrayA, int[] arrayB, int lastAIndex, int lastBIndex){

        int sortedArrayIndex = arrayA.length-1;
        int currentAIndex = lastAIndex;
        int currentBIndex = lastBIndex;
        while(sortedArrayIndex>-1){
            if(currentAIndex < 0){
                arrayA[sortedArrayIndex] = arrayB[currentBIndex];
                currentBIndex--;
            }else if(currentBIndex < 0){
                arrayA[sortedArrayIndex] = arrayA[currentAIndex];
                currentAIndex--;
            }else if(arrayA[currentAIndex] >= arrayB[currentBIndex]){
                arrayA[sortedArrayIndex] = arrayA[currentAIndex];
                arrayA[currentAIndex] = -1;
                currentAIndex--;
            }else{
                arrayA[sortedArrayIndex] = arrayB[currentBIndex];
                arrayB[currentBIndex] = -1;
                currentBIndex--;
            }
            sortedArrayIndex--;
        }

    }
}
