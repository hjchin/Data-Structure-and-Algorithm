package com.company.chapter8;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q8_5Test {

    @Test
    public void testMultiply(){
        assertEquals(5,Q8_5.multiply(1,5));
        assertEquals(20,Q8_5.multiply(4,5));
        assertEquals(25,Q8_5.multiply(5,5));
    }

}