package com.company.chapter5;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q5_6Test {

    @Test
    public void testGetMaxLength(){
        assertEquals(5, Q5_6.getMaxLength(29,15));
        assertEquals(9, Q5_6.getMaxLength(290,15));
        assertEquals(9, Q5_6.getMaxLength(15,290));
    }

    @Test
    public void testConvert(){
        //assertEquals(2, Q5_6.convert(29,15));
        assertEquals(8, Q5_6.convert(290,15));
    }
}