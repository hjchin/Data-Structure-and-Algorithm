package com.company.chapter8;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Q8_7Test {

    /*
        permutation count = n!
        time complexity = n x (n-1) x (n-1)
     */
    @Test
    public void permute(){
        ArrayList<String> p = new ArrayList<String>();

        p = new ArrayList<>(Q8_7.permute("a"));
        assertEquals(1,p.size());
        assertEquals("a",p.get(0));

        p = new ArrayList<>(Q8_7.permute("ab"));
        assertEquals(2,p.size());
        assertEquals("ab",p.get(0));

        p = new ArrayList<>(Q8_7.permute("abc"));
        assertEquals(6,p.size());
        assertEquals("abc",p.get(0));
        assertEquals("acb",p.get(1));
        assertEquals("bac",p.get(2));
        assertEquals("bca",p.get(3));
        assertEquals("cab",p.get(4));
        assertEquals("cba",p.get(5));

        p = new ArrayList<>(Q8_7.permute("abcd"));
        assertEquals(24,p.size());
    }

}