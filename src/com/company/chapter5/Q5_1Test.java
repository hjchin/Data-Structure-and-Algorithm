package com.company.chapter5;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q5_1Test {

    @Test
    public void testInsert(){
        //n = 1000000000, m = 10011
        int val = Q5_1.insert(512,19, 2, 6); //10000011
        assertEquals("1001001100",Integer.toString(val, 2));
    }
}