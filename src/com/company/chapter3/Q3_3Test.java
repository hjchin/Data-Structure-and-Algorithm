package com.company.chapter3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q3_3Test {

    @Test
    public void test(){
        Q3_3.SetOfStacks stacks = new Q3_3.SetOfStacks();

        try{
            stacks.pop();
        }catch (IndexOutOfBoundsException e){
            assertTrue(true);
        }

        stacks.push(1);
        assertEquals(1, stacks.size());
        assertEquals(1, stacks.subListSize());

        stacks.pop();
        assertEquals(0, stacks.size());
        assertEquals(1, stacks.subListSize());
    }

    @Test
    public void test1(){
        Q3_3.SetOfStacks stacks = new Q3_3.SetOfStacks();

        stacks.push(1);
        stacks.push(2);
        stacks.push(3);
        assertEquals(3, stacks.size());
        assertEquals(1, stacks.subListSize());

        stacks.push(4);
        stacks.push(5);
        stacks.push(6);

        assertEquals(6, stacks.size());
        assertEquals(2, stacks.subListSize());

        stacks.push(7);
        stacks.push(8);

        assertEquals(8, stacks.size());
        assertEquals(3, stacks.subListSize());

        Integer value = stacks.pop();
        assertEquals(8, value.intValue());
        assertEquals(7, stacks.size());
        assertEquals(3, stacks.subListSize());

        stacks.pop();
        assertEquals(6, stacks.size());
        assertEquals(2, stacks.subListSize());

    }

}