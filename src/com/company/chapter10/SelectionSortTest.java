package com.company.chapter10;

import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionSortTest {

    @Test
    public void sort(){
        int[] array2 = {1};
        int[] rs1 = SelectionSort.sort(array2);
        assertEquals(1, rs1[0]);

        int[] array = {1,2,3,4,5,6};
        int[] rs = SelectionSort.sort(array);
        assertEquals(1, rs[0]);
        assertEquals(2, rs[1]);
        assertEquals(3, rs[2]);
        assertEquals(4, rs[3]);
        assertEquals(5, rs[4]);
        assertEquals(6, rs[5]);

        int[] array3 = {6,5,4,3,2,1};
        int[] rs3 = SelectionSort.sort(array3);
        assertEquals(1, rs3[0]);
        assertEquals(2, rs3[1]);
        assertEquals(3, rs3[2]);
        assertEquals(4, rs3[3]);
        assertEquals(5, rs3[4]);
        assertEquals(6, rs3[5]);

        int[] array4 = {3,3,4,5,5,1,1};
        int[] rs4 = BubleSort.sort(array4);
        assertEquals(1, rs4[0]);
        assertEquals(1, rs4[1]);
        assertEquals(3, rs4[2]);
        assertEquals(3, rs4[3]);
        assertEquals(4, rs4[4]);
        assertEquals(5, rs4[5]);
        assertEquals(5, rs4[6]);
    }
}