package com.company.Chapter1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q1_9Test {

    @Test
    public void test(){
        assertTrue(Q1_9.checkRotation("",""));
        assertTrue(Q1_9.checkRotation("123","312"));
        assertFalse(Q1_9.checkRotation("123","1234"));
        assertFalse(Q1_9.checkRotation("1234","2234"));
    }
}