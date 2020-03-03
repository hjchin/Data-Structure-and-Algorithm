package com.company.chapter10;

public class BinarySearch {

    public static int search(int[] array, int search){
        return search(array, search, 0, array.length-1);
    }

    public static int search(int[] array, int search, int start, int end){
        int midIndex = (start+end)/2;
        //System.out.println("start= "+start+", end="+end+", midIndex="+midIndex);

        if(search < array[midIndex]){
            int nextMidIndex = (start+midIndex)/2;
            if(nextMidIndex == midIndex) {return -1;}
            return search(array, search, start, midIndex);
        }else if(search > array[midIndex]){
            int nextMidIndex = (midIndex+1+end)/2;
            if(nextMidIndex == midIndex) {return -1;}
            return search(array, search, midIndex+1, end);
        }else
            return midIndex;
    }
}
