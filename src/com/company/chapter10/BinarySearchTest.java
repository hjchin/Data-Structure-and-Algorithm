package com.company.chapter10;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void search(){
        int[] data = {3,4,5,6,8,12};
        assertEquals(-1,BinarySearch.search(data, 9));
        assertEquals(4,BinarySearch.search(data, 8));
        assertEquals(5,BinarySearch.search(data, 12));
        assertEquals(0,BinarySearch.search(data, 3));
    }
}