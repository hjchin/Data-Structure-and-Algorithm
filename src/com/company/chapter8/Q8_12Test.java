package com.company.chapter8;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q8_12Test {

    /*
        0
    _ _ _ _ _ _ _ _
 0 |X| | | | | | | |
    - - - - - - - -
   | | |X| | | | | |
    - - - - - - - -
   | | | | |X| | | |
    - - - - - - - -
   | | | | | | |X| |
    - - - - - - - -
 4 | |X| | | | | | |
    - - - - - - - -
   | | | |X| | | | |
    - - - - - - - -
   | | | | | |X| | |
    - - - - - - - -
   | | | | | | | |X|
    - - - - - - - -

     */


    @Test
    public void place(){
        int[][] board = new int[8][8];
        Q8_12.place(board, 0, 0,0);
        assertEquals(1,(int)board[0][0]);
    }

    @Test
    public void place2(){
        int[][] board = new int[8][8];
        Q8_12.place(board, 0, 0,1);
        assertEquals(1,board[0][1]);
    }


    @Test
    public void populate(){
        int[][][] boardList = Q8_12.populate();
    }

}