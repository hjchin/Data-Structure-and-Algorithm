package com.company.chapter3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q3_1Test {

    @Test
    public void test(){

        Q3_1.ThreeStack stacks = new Q3_1.ThreeStack(3);

        try{
            stacks.getStack1().pop();
        }catch (IndexOutOfBoundsException e){
            assertTrue(true);
        }

        try{
            stacks.getStack2().pop();
        }catch (IndexOutOfBoundsException e){
            assertTrue(true);
        }

        try{
            stacks.getStack3().pop();
        }catch (IndexOutOfBoundsException e){
            assertTrue(true);
        }
    }

    @Test
    public void test1(){
        Q3_1.ThreeStack stacks = new Q3_1.ThreeStack(3);
        stacks.getStack1().push(1);
        assertEquals(1, stacks.getStack1().size());
        assertEquals(1, stacks.getStack1().pop().intValue());
        assertEquals(0, stacks.getStack1().size());

        stacks.getStack1().push(1);
        stacks.getStack1().push(1);
        stacks.getStack1().push(1);

        assertEquals(3, stacks.getStack1().size());

        try{
            stacks.getStack1().push(1);
        }catch (IndexOutOfBoundsException ex){
            assertTrue(true);
        }

        stacks.getStack1().pop();
        stacks.getStack1().pop();
        stacks.getStack1().pop();

        assertEquals(0, stacks.getStack1().size());

        try{
            stacks.getStack1().pop();
        }catch (IndexOutOfBoundsException ex){
            assertTrue(true);
        }
    }
}