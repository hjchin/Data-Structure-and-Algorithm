package com.company.chapter5;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class BitOperationTest {

    @Test
    public void testMask(){
        int num = 1;
        int mask = num << 3;
        assertEquals("1000", Integer.toString(mask, 2));
    }

    @Test
    public void testGetBit(){
        int num = 10; //1010
        System.out.println("num=10, binary "+Integer.toString(num,2));
        assertEquals(1,BitOperation.getBit(num,3));
        assertEquals(0, BitOperation.getBit(num,2));
        assertEquals(1, BitOperation.getBit(num,1));
        assertEquals(0, BitOperation.getBit(num,0));
    }

    @Test
    public void testSetBit(){
        int num = 10; //1010
        int value = BitOperation.setBit(num, 3);
        assertEquals("1010",Integer.toString(value,2));

        value = BitOperation.setBit(num, 2);
        assertEquals("1110",Integer.toString(value,2));

        value = BitOperation.setBit(num, 1);
        assertEquals("1010",Integer.toString(value,2));

        value = BitOperation.setBit(num, 0);
        assertEquals("1011",Integer.toString(value,2));
    }

    @Test
    public void testClearBit(){
        int num = 10; //1010
        int value = BitOperation.clearBit(num, 3);
        assertEquals("10",Integer.toString(value,2));

        value = BitOperation.clearBit(num, 1);
        assertEquals("1000",Integer.toString(value,2));
    }

    @Test
    public void testUpdateBit(){
        int num = 10; //1010
        int value = BitOperation.updateBit(num, 0, false);
        assertEquals("1010", Integer.toString(value, 2));

        value = BitOperation.updateBit(num, 1, false);
        assertEquals("1000", Integer.toString(value, 2));

        value = BitOperation.updateBit(num, 2, true);
        assertEquals("1110", Integer.toString(value, 2));

        value = BitOperation.updateBit(num, 3, false);
        assertEquals("10", Integer.toString(value, 2));
    }

}
