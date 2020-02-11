package com.company.chapter8;

import java.util.ArrayList;

public class Q8_2 {

    /*
    Robot in a Grid: Imagine a robot sitting on the upper left corner of grid with r rows and c columns.
    The robot can only move in two directions, right and down, but certain cells are "off limits" such that
    the robot cannot step on them. Design an algorithm to find a path for the robot from the top left to
    the bottom right.


    Answer:
    matrix defines cells and some are off limits

    0
  0 T F T T T
    T T T F T
    T T T F T
    T T T T F
    T T T T T 4
            4
     */

    public static ArrayList<Grid> getStep(boolean[][] matrix){
        ArrayList<Grid> path = new ArrayList<>();
        int x = matrix.length-1;
        int y = matrix[matrix.length-1].length-1;
        Grid endGrid = new Grid(x,y);
        getStep(matrix, endGrid, path);
        return path;
    }

    public static boolean getStep(boolean[][] matrix, Grid grid, ArrayList<Grid> path){

        System.out.println("Grid row="+ grid.row +", col="+ grid.col);

        if(grid.row < 0 || grid.col <0){
            return false;
        }

        if(!matrix[grid.row][grid.col]){
            return false;
        }

        if(grid.row == 0 && grid.col == 0){
            path.add(new Grid(grid.row, grid.col));
            return true;
        }

        if(getStep(matrix, new Grid(grid.row, grid.col -1), path) ||
           getStep(matrix, new Grid(grid.row -1, grid.col), path)){
            path.add(new Grid(grid.row, grid.col));
            return true;
        }

        return false;
    }

    public static class Grid {

        int row, col;

        Grid(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
}
