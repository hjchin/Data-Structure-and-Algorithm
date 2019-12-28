package com.company.chapter5;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q5_7Test {

    @Test
    public void testSwap(){
        assertEquals("0",Q5_7.swap("0"));
        assertEquals("00",Q5_7.swap("00"));
        assertEquals("10",Q5_7.swap("01"));
        assertEquals("100",Q5_7.swap("010"));
        assertEquals("1010",Q5_7.swap("0101"));
    }
}