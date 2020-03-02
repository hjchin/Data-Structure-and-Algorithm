package com.company.chapter8;

import java.util.ArrayList;

public class Q8_12 {

    /*

    Eight Queens: Write an algorithm to print all ways of arranging eight queens on an 8x8 chess board
    so that none of them share the same row, column, or diagonal. In this case, "diagonal" means all
    diagonals, not just the two that bisect the board.

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
   | |X| | | | | | |
    - - - - - - - -
   | | | |X| | | | |
    - - - - - - - -
   | | | | | |X| | |
    - - - - - - - -
   | | | | | | | |X|
    - - - - - - - -

     */

    public static int[][][] populate(){
        int[][][] boardList = new int[8][8][8];
        ArrayList<int[][]> result = new ArrayList<>();

        for(int i=0;i<boardList.length;i++){
            int queenCount = place(boardList[i], 0, 0, i);
            if(queenCount == 8){
                result.add(boardList[i]);
            }
        }
        return result.toArray(new int[result.size()][8][8]);
    }

    public static int place(int[][] board, int queenCount, int row, int col){
        if(row > 7){
            System.out.println();
            return queenCount;
        }

        if(col > 7){
            int newCol = getCol(board, row);
            if(newCol>-1){
                return place(board,queenCount, row,newCol);
            }

            return queenCount;
        }

        if(queenCount < 8){

            for(int j=0;j<8;j++){
                if(j==col){
                    System.out.print(" X ");
                }else{
                    System.out.print(" _ ");
                }
            }
            System.out.println();

            board[row][col] = 1;
            row+=1;
            col+=2;
            queenCount++;
            return place(board, queenCount, row, col);
        }

        return queenCount;
    }

    public static int getCol(int[][] board, int currentRow){
        int newCol = -1;

        for(int j=0;j<board.length;j++){
            boolean columnUsed = false;
            for(int i=0;i<currentRow;i++){
                if(board[i][j] == 1){
                    columnUsed = true;
                    break;
                }
            }

            if(!columnUsed){
                int diagonalJ = j+1;
                int pastRowAt = currentRow-1;
                for(;pastRowAt>-1&&diagonalJ<8;pastRowAt--,diagonalJ++){
                    //System.out.println("board["+pastRowAt+"]["+diagonalJ+"] = "+board[pastRowAt][diagonalJ]);
                    if(board[pastRowAt][diagonalJ] == 1){
                      columnUsed = true;
                      break;
                    }
                }
            }

            if(!columnUsed){
                newCol = j;
                break;
            }
        }

        return newCol;
    }
}
