package com.company.Chapter1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q1_6Test {

    @Test
    public void test(){
        assertEquals("a2b1c5a3",Q1_6.compressString("aabcccccaaa"));
        assertEquals("a5",Q1_6.compressString("aaaaa"));
        assertEquals("",Q1_6.compressString(""));
        assertEquals("abcde",Q1_6.compressString("abcde"));
    }
}