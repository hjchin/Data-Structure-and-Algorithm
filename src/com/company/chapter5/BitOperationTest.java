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

    @Test
    public void testMaskRight(){
        int val = BitOperation.maskRight(2);  //100 as input
        System.out.println(Integer.toString(val, 2));//11
        assertEquals("11",Integer.toString(val, 2));
    }

    @Test
    public void testMaskLeft(){
        int val = BitOperation.maskLeft(2);//11111000
        assertEquals("11111000",Integer.toBinaryString(val & 0xFF));
    }

    @Test
    public void testMaskZeroInBetween(){
        int val = BitOperation.maskZeroInBetween(2, 6);
        assertEquals("10000011",Integer.toBinaryString(val & 0xFF));
    }

    @Test
    public void testConvertDecimalToBinary(){
        String value = BitOperation.convertIntegerToBinary(0);
        assertEquals("0",value);

        value = BitOperation.convertIntegerToBinary(1);
        assertEquals("1",value);

        value = BitOperation.convertIntegerToBinary(10);
        assertEquals("1010",value);

        value = BitOperation.convertIntegerToBinary(100);
        assertEquals("1100100",value);
    }

    @Test
    public void testConvertFractionalDecimalToBinary(){
        String value = BitOperation.convertDecimalToBinary(0.375, 10);
        assertEquals("0.011", value);

        value = BitOperation.convertDecimalToBinary(0.37, 10);
        assertEquals("0.0101111010", value);

        value = BitOperation.convertDecimalToBinary(0.1, 10);
        assertEquals("0.0001100110", value);

    }

    @Test
    public void testConvertBinaryToDecimal(){
        int value = BitOperation.convertBinaryToDecimal("0");
        assertEquals(0, value);

        value = BitOperation.convertBinaryToDecimal("1");
        assertEquals(1, value);

        value = BitOperation.convertBinaryToDecimal("1010");
        assertEquals(10,value);

        value = BitOperation.convertBinaryToDecimal("1100100");
        assertEquals(100,value);
    }

    @Test
    public void testConvertFractionBinaryToDecimal(){
        double value = BitOperation.convertFractionalBinaryToDecimal("0.0");
        assertEquals(0.0d, value);

        value = BitOperation.convertFractionalBinaryToDecimal("0.0101");
        assertEquals(0.3125d, value);

        value = BitOperation.convertFractionalBinaryToDecimal("0.111000");
        assertEquals(0.875d, value);
    }





}
