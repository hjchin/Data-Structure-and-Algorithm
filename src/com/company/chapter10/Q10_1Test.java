package com.company.chapter10;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q10_1Test {

    @Test
    public void sort(){
        int[] array1 = {5,6,7,9,0,0,0};
        int[] array2 = {1,4,7};
        Q10_1.sort(array1, array2, 3, 2);
        assertEquals(1, array1[0]);
        assertEquals(4, array1[1]);
        assertEquals(5, array1[2]);
        assertEquals(6, array1[3]);
        assertEquals(7, array1[4]);
        assertEquals(7, array1[5]);
        assertEquals(9, array1[6]);

        int[] array3 = {1,4,7,9,0,0,0};
        int[] array4 = {5,6,7};
        Q10_1.sort(array3, array4, 3, 2);
        assertEquals(1, array3[0]);
        assertEquals(4, array3[1]);
        assertEquals(5, array3[2]);
        assertEquals(6, array3[3]);
        assertEquals(7, array3[4]);
        assertEquals(7, array3[5]);
        assertEquals(9, array3[6]);
    }

}