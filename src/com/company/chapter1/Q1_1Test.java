package com.company.chapter1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q1_1Test {

    @Test
    public void testQ1(){
        assertTrue(Q1_1.checkUniqueChar(""));
        assertTrue(Q1_1.checkUniqueChar("12345678"));
        assertFalse(Q1_1.checkUniqueChar("123338"));
    }
}