package com.company.chapter1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q1_8Test {

    @Test
    public void testSingleLine1(){
        int[][] input = new int[][]{{1,2,3,4,5,6}};
        int[][] result = Q1_8.zeroMatrix(input);

        boolean match = true;

        for(int i=0;i<input.length;i++){
            for(int j=0;j<input[i].length;j++){
                if(input[i][j] != result[i][j]){
                    match = false;
                    break;
                }
            }
        }

        assertTrue(match);
    }

    @Test
    public void testSingleLine2(){
        int[][] input = new int[][]{{1,2,3,4,5,0}};
        int[][] result = Q1_8.zeroMatrix(input);

        boolean match = true;

        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[i].length;j++){
                if(result[i][j] != 0){
                    match = false;
                    break;
                }
            }
        }

        assertTrue(match);
    }

    @Test
    public void testDoubleLine1(){
        int[][] input = new int[][]{{1,2,3,4,5,6},{2,3,45,6,67,9}};
        int[][] result = Q1_8.zeroMatrix(input);

        boolean match = true;

        for(int i=0;i<input.length;i++){
            for(int j=0;j<input[i].length;j++){
                if(input[i][j] != result[i][j]){
                    match = false;
                    break;
                }
            }
        }

        assertTrue(match);
    }

    @Test
    public void testDoubleLine2(){
        int[][] input = new int[][]{{1,2,3,4,5,0},{2,3,45,6,67,9}};
        int[][] result = Q1_8.zeroMatrix(input);

        boolean match = true;

        for(int i=0;i<input.length;i++){
            for(int j=0;j<input[i].length;j++){
                if(i == 0 && input[i][j] != 0){
                    match = false;
                    break;
                }

                if(i == 1 && j == input[i].length-1 && input[i][j] != 0){
                    match = false;
                    break;
                }
            }
        }

        assertTrue(match);
    }

    @Test
    public void testDoubleLine3(){
        int[][] input = new int[][]{{0,2,3,4,5,0},{2,3,45,6,67,9}};
        int[][] result = Q1_8.zeroMatrix(input);

        boolean match = true;

        for(int i=0;i<input.length;i++){
            for(int j=0;j<input[i].length;j++){
                if(i == 0 && input[i][j] != 0){
                    match = false;
                    break;
                }

                if(i == 1 && j == 0 && input[i][j] != 0){
                    match = false;
                    break;
                }

                if(i == 1 && j == input[i].length-1 && input[i][j] != 0){
                    match = false;
                    break;
                }
            }
        }

        assertTrue(match);
    }

    @Test
    public void testDoubleLine4(){
        int[][] input = new int[][]{{2,2,3,4,5,3},{2,3,45,6,67,0}};
        int[][] result = Q1_8.zeroMatrix(input);

        boolean match = true;

        for(int i=0;i<input.length;i++){
            for(int j=0;j<input[i].length;j++){
                if(i == 1 && input[i][j] != 0){
                    match = false;
                    break;
                }

                if(i == 0 && j == input[i].length-1 && input[i][j] != 0){
                    match = false;
                    break;
                }
            }
        }

        assertTrue(match);
    }

    @Test
    public void testDoubleLine5(){
        int[][] input = new int[][]{{2,2,3,4,5,3},{0,3,0,6,67,0}};
        int[][] result = Q1_8.zeroMatrix(input);

        boolean match = true;

        for(int i=0;i<input.length;i++){
            for(int j=0;j<input[i].length;j++){
                if(i == 1 && input[i][j] != 0){
                    match = false;
                    break;
                }

                if(i == 0 && j == 0 && input[i][j] != 0){
                    match = false;
                    break;
                }

                if(i == 0 && j == 2 && input[i][j] != 0){
                    match = false;
                    break;
                }

                if(i == 0 && j == input[i].length-1 && input[i][j] != 0){
                    match = false;
                    break;
                }
            }
        }

        assertTrue(match);
    }
}