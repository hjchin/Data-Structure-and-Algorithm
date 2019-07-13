package com.company.Chapter3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q3_2Test {

    @Test
    public void testBasic(){
        Q3_2.Stack stack = new Q3_2.Stack();
        stack.push(10);
        assertEquals(1,stack.size());
        assertEquals(10, stack.min().intValue());
        assertEquals(10, stack.pop().intValue());
        assertEquals(0,stack.size());
    }

    @Test
    public void test1(){
        Q3_2.Stack stack = new Q3_2.Stack();
        stack.push(10);
        stack.push(11);
        stack.push(9);
        stack.push(13);
        assertEquals(9, stack.min().intValue());
    }

    @Test
    public void test2(){
        Q3_2.Stack stack = new Q3_2.Stack();
        stack.push(10);
        stack.push(11);
        stack.push(9);
        stack.push(8);
        assertEquals(8, stack.min().intValue());

        stack.pop();
        assertEquals(9, stack.min().intValue());
    }

    @Test
    public void test3(){
        Q3_2.Stack stack = new Q3_2.Stack();
        stack.push(10);
        stack.push(7);
        stack.push(9);
        stack.push(8);
        assertEquals(7, stack.min().intValue());

        stack.pop();
        assertEquals(7, stack.min().intValue());
    }
}