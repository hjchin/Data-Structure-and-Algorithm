package com.company.chapter10;

public class MergeSort {


    public static int[] sort(int[] array){
        sort(array, 0, array.length-1);
        return array;
    }

    public static void sort(int[] array, int start, int end){
        if(start < end){
            int middle = (start+end)/2;
            sort(array,start, middle);
            sort(array,middle+1, end );
            merge(array, start, middle, end);
        }
    }

    /*

        1,3 || 2, 4

     */
    public static void merge(int[] array, int start, int middle, int end){

        int[] temp = new int[array.length];
        for(int i=0;i<array.length;i++){
            temp[i] = array[i];
        }

        int left = start;
        int right = middle+1;
        int current = start;

        while(left <=middle && right <=end){
            if(temp[left] <= temp[right]){
                array[current] = temp[left];
                left++;
            }else{
                array[current] = temp[right];
                right++;
            }
            current++;
        }

        for(int i=current+1;i<array.length&& right<array.length;i++,right++){
            array[i] = temp[right];
        }
    }
}
