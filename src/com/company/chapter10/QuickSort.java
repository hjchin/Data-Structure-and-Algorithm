package com.company.chapter10;

import java.util.ArrayList;

public class QuickSort {

    public static int[] sort(int[] array){
        sort(array, 0, array.length-1);
        return array;
    }

    public static void sort(int[] array, int start, int end){
        if(start<end){
            int pivot = partition(array, start, end);
            sort(array, start, pivot);
            sort(array, pivot+1, end);
        }
    }

    public static int partition(int[] array, int start, int end){
        int pivotLocation = start;
        int pivot = array[pivotLocation];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(pivot);

        for(int i=start+1;i<=end;i++){
            if(array[i] < pivot){
                list.add(0,array[i]);
                pivotLocation++;
            }else{
                list.add(array[i]);
            }
        }

        for(int i=start,j=0;i<=end;i++,j++){
            array[i] = list.get(j);
        }

        return pivotLocation;
    }
}
