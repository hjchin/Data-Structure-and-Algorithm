package com.company.chapter6;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class Chapter6_Test {

    @Test
    public void testPrime(){
        assertTrue(Prime.isPrime(7));
    }

    @Test
    public void testSumNumSequence(){
        assertEquals(210,Calculation.sumNumSequence(1, 20));
        assertEquals(55, Calculation.sumNumSequence(1,10));
    }


}
