package com.company.chapter5;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q5_3Test {

    @Test
    public void testGetMaxLength(){
        String input = "0";
        assertEquals(0,Q5_3.getMaxLengthOfBit(input));

        input = "1";
        assertEquals(1,Q5_3.getMaxLengthOfBit(input));

        input = "10";
        assertEquals(1,Q5_3.getMaxLengthOfBit(input));

        input = "11";
        assertEquals(2,Q5_3.getMaxLengthOfBit(input));

        input = "100101";
        assertEquals(1,Q5_3.getMaxLengthOfBit(input));

        input = "100111";
        assertEquals(3,Q5_3.getMaxLengthOfBit(input));

        input = "11100111";
        assertEquals(3,Q5_3.getMaxLengthOfBit(input));

        input = "110011101111";
        assertEquals(4,Q5_3.getMaxLengthOfBit(input));
    }

    @Test
    public void testGetLongestBit(){
        int value = Q5_3.getLongestBit("0");
        assertEquals(1,value);

        value = Q5_3.getLongestBit("10");
        assertEquals(2,value);

        value = Q5_3.getLongestBit("11011101111");
        assertEquals(8,value);

    }

}