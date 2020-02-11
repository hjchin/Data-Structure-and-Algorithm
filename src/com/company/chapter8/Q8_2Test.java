package com.company.chapter8;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Q8_2Test {


    @Test
    public void testGetStep(){
        boolean[][] matrix = getMatrix();
        ArrayList<Q8_2.Grid> path = Q8_2.getStep(matrix);
        assertEquals(9,path.size());
    }

    @Test
    public void testGetMatrix(){
        boolean[][] matrix = getMatrix();
        assertEquals(5, matrix.length);
        assertEquals(5, matrix[matrix.length-1].length);
        assertFalse(matrix[0][1]);
    }

    public boolean[][] getMatrix(){

        boolean[][] matrix = {
            {true,  false,  true,   true,   true},
            {true,  true,   true,   false,  true},
            {true,  true,   true,   false,  true},
            {true,  true,   true,   true,   false},
            {true,  true,   true,   true,   true}
        };

        return matrix;
    }

}