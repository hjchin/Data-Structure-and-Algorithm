package com.company.Chapter1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q1_2Test {

    @Test
    public void testQ2(){
        assertTrue(Q1_2.checkPermutation("",""));
        assertTrue(Q1_2.checkPermutation("123","123"));
        assertTrue(Q1_2.checkPermutation("132","123"));
        assertTrue(Q1_2.checkPermutation("1322","1232"));
        assertTrue(Q1_2.checkPermutation("132244","144232"));
        assertFalse(Q1_2.checkPermutation("132244","1442"));
        assertFalse(Q1_2.checkPermutation("111","11"));
        assertFalse(Q1_2.checkPermutation("11122","112"));
    }

    @Test
    public void testQ22(){
        assertTrue(Q1_2.checkPermutation2("",""));
        assertTrue(Q1_2.checkPermutation2("123","123"));
        assertTrue(Q1_2.checkPermutation2("132","123"));
        assertTrue(Q1_2.checkPermutation2("1322","1232"));
        assertTrue(Q1_2.checkPermutation2("132244","144232"));
        assertFalse(Q1_2.checkPermutation2("132244","1442"));
        assertFalse(Q1_2.checkPermutation2("111","11"));
        assertFalse(Q1_2.checkPermutation2("11122","112"));
    }
}