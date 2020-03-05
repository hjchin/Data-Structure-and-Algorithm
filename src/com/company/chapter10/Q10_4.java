package com.company.chapter10;

import java.util.HashMap;

/*

    Sorted Search, No Size: You are given an array-like data structure Listy which lacks a size
    method. It does, however, have an elementAt ( i) method that returns the element at index i in
    0( 1) time. If i is beyond the bounds of the data structure, it returns -1. (For this reason, the data
    structure only supports positive integers.) Given a Listy which contains sorted, positive integers,
    find the index at which an element x occurs. If x occurs multiple times, you may return any index.

 */
public class Q10_4 {

    public static int search(Listy array, int search){

        int i = 0;
        while(array.elementAt(i) != -1 && array.elementAt(i) < search){
            if(i == 0){i++;continue;}
            i=i*2;
        }

        int start = i/2;
        int end = i;

        while(start<=end){
            int mid = (start + end)/2;
            if(search > array.elementAt(mid)){
                start += mid+1;
            }else if(search < array.elementAt(mid)){
                end = mid-1;
            }else{
                return mid;
            }
        }

        return -1;
    }


    public static class Listy{

        private HashMap<Integer, Integer> map = new HashMap<>();

        Listy(int[] array){
            for(int i=0;i<array.length;i++){
                map.put(i,array[i]);
            }
        }

        public int elementAt(int index){
            if(map.get(index) == null){
                return -1;
            }
            return map.get(index);
        }
    }
}
