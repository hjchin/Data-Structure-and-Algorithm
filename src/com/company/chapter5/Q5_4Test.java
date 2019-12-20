package com.company.chapter5;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q5_4Test {

    @Test
    public void testNexBiggerNumber(){
        assertEquals(1, Q5_4.nextBiggerNumber(1));
        assertEquals(12, Q5_4.nextBiggerNumber(10));
        assertEquals(104, Q5_4.nextBiggerNumber(100));
        assertEquals(1658, Q5_4.nextBiggerNumber(1657));
    }

    @Test
    public void testNextSmallerNumber(){
        assertEquals(1, Q5_4.nextSmallerNumber(1));
        assertEquals(9, Q5_4.nextSmallerNumber(10));
        assertEquals(98, Q5_4.nextSmallerNumber(100));
        assertEquals(1653, Q5_4.nextSmallerNumber(1657));
    }
}