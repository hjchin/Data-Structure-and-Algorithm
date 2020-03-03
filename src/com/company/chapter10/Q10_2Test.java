package com.company.chapter10;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q10_2Test {

    @Test
    public void sort(){
        String[] value = {"abcde","jjuj","sdfdsf","edcab","ffddss"};
        Q10_2.sort(value);
        assertEquals("edcab",value[0]);
        assertEquals("abcde",value[1]);
        assertEquals("jjuj",value[2]);
        assertEquals("ffddss",value[3]);
        assertEquals("sdfdsf",value[4]);
    }
}