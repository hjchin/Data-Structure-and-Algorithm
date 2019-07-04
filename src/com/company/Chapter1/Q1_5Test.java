package com.company.Chapter1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q1_5Test {

    @Test
    public void test(){
        assertTrue(Q1_5.oneAway("pale","ple"));
        assertTrue(Q1_5.oneAway("pales","pale"));
        assertTrue(Q1_5.oneAway("pale","pales"));
        assertTrue(Q1_5.oneAway("pales","pales"));
        assertTrue(Q1_5.oneAway("pale","bale"));
        assertFalse(Q1_5.oneAway("pale","bake"));
    }
}