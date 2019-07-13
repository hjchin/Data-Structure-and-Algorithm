package com.company.Chapter3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q3_4Test {

    @Test
    public void test(){
        Q3_4.MyQueue queue = new Q3_4.MyQueue();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        assertEquals(1,queue.remove().intValue());
        assertEquals(2,queue.remove().intValue());
        assertEquals(3,queue.remove().intValue());
    }
}