package com.company.chapter8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class Q8_9Test {

    @Test
    public void printBrace() {

        TreeSet set = new TreeSet<String>();
        ArrayList<String> result = new ArrayList<>(set);

        set = Q8_9.printBrace(1);
        result = new ArrayList<String>(set);
        assertEquals(1, result.size());
        assertEquals("()", result.get(0));

        set = Q8_9.printBrace(2);
        result = new ArrayList<String>(set);
        assertEquals(2, result.size());
        assertEquals("(())", result.get(0));
        assertEquals("()()", result.get(1));

        set = Q8_9.printBrace(3);
        result = new ArrayList<String>(set);
        assertEquals(5, result.size());
        assertEquals("((()))", result.get(0));
        assertEquals("(()())", result.get(1));
        assertEquals("(())()", result.get(2));
        assertEquals("()(())", result.get(3));
        assertEquals("()()()", result.get(4));
    }
}