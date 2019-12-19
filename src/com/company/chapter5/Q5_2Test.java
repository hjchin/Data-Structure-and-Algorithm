package com.company.chapter5;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Q5_2Test {

    @Test
    public void testConvertDecimalToBinary(){
        String value = Q5_2.convertDecimalToBinary(0.0);
        assertEquals("0.0", value);

        value = Q5_2.convertDecimalToBinary(0.1);
        assertEquals("ERROR", value);

        value = Q5_2.convertDecimalToBinary(0.375);
        assertEquals("0.011", value);
    }

}
