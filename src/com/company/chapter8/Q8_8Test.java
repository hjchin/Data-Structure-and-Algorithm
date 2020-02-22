package com.company.chapter8;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Q8_8Test {

    @Test
    public void permute() {
        ArrayList<String> p = new ArrayList<String>();
        p = new ArrayList<>(Q8_8.permute("abc"));
        assertEquals(6,p.size());
        assertEquals("abc",p.get(0));
        assertEquals("acb",p.get(1));
        assertEquals("bac",p.get(2));
        assertEquals("bca",p.get(3));
        assertEquals("cab",p.get(4));
        assertEquals("cba",p.get(5));

        p = new ArrayList<>(Q8_8.permute("aaa"));
        assertEquals(1,p.size());
    }
}