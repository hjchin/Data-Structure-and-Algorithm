package com.company.chapter10;

public class SelectionSort {

    public static int[] sort(int[] array){

        for(int j=0;j<array.length;j++){
            int loop = j;
            int index = j;
            for(int i=loop;i<array.length;i++){
                if(array[i] < array[index]){
                    index = i;
                }
            }
            int temp = array[loop];
            array[loop] = array[index];
            array[index] = temp;
        }

        return array;
    }
}
