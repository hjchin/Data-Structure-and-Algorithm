package com.company.chapter10;

public class BubleSort {


    public static int[] sort(int[] array){
        boolean swap = true;

        while(swap){
            swap = false;
            for(int i=0,j=1;i<array.length-1&&j<array.length;i++,j++){
                if(array[i] > array[j]){
                    swap = true;
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        return array;
    }
}
