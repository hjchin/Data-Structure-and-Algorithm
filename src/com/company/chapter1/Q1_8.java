package com.company.chapter1;

import java.util.HashSet;

public class Q1_8 {

    public static int[][] zeroMatrix(int[][] input){

        HashSet<Integer> zeroRow = new HashSet<>();
        HashSet<Integer> zeroCol = new HashSet<>();

        for(int i=0;i<input.length;i++){
            for(int j=0;j<input[i].length;j++){
                if(input[i][j] == 0){
                    zeroRow.add(i);
                    zeroCol.add(j);
                }
            }
        }

        for(int i=0;i<input.length;i++){
            for(int j=0;j<input[i].length;j++){
                if(zeroRow.contains(i)){
                    input[i][j] = 0;
                }

                if(zeroCol.contains(j)){
                    input[i][j] = 0;
                }
            }
        }

        return input;
    }

}
