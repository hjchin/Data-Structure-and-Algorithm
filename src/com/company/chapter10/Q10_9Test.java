package com.company.chapter10;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q10_9Test {


    @Test
    public void findElement(){
        int[][] matrix = {
                            {15, 20, 40, 85},
                            {20, 35, 80, 95},
                            {30, 55, 95, 105},
                            {40, 80, 100, 120}
                        };
        assertTrue(Q10_9.findElement(matrix, 55));
    }
}