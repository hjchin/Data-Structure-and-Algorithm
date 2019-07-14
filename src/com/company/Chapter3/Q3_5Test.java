package com.company.Chapter3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q3_5Test {

    @Test
    public void test(){

        Q3_5.SortStack sortStack = new Q3_5.SortStack();

        assertTrue(sortStack.isEmpty());

        sortStack.push(5);
        assertFalse(sortStack.isEmpty());

        sortStack.push(8);
        assertEquals(5, sortStack.peek().intValue());
        assertEquals(5, sortStack.pop().intValue());
    }

    @Test
    public void test1(){
        Q3_5.SortStack sortStack = new Q3_5.SortStack();
        sortStack.push(5);
        sortStack.push(8);
        sortStack.push(1);
        sortStack.push(4);
        sortStack.push(2);
        sortStack.push(3);

        assertEquals(1, sortStack.pop().intValue());
        assertEquals(2, sortStack.pop().intValue());
        assertEquals(3, sortStack.pop().intValue());
        assertEquals(4, sortStack.pop().intValue());
        assertEquals(5, sortStack.pop().intValue());
        assertEquals(8, sortStack.pop().intValue());
        assertTrue(sortStack.isEmpty());
    }
}