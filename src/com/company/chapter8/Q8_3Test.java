package com.company.chapter8;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q8_3Test {

    @Test
    public void testGetMagicIndex(){
        int[] input = new int[]{-3,-2,0,1,2,4,6,10,11,12,14};
        int index = Q8_3.getMagicIndex(input);
        assertEquals(6,index);
    }

    /*


     case 1:
     int[] input = new []{-3,-2,0,1,2,4,6,10,11,12,14};
                         0, 1, 2,3,4,5,6,7, 8, 9, 10

     i1: start=0, end=10, mid=5, value=4
     i2: start=5, end=10, mid=7, value=10
     i3: start=5, end=7, mid=6, value=6

     case 2:
     int[] input = new []{-3,-2,0,1,2,4,7,10,11,12,14};
                          0, 1, 2,3,4,5,6,7, 8, 9, 10

     i1: start=0, end=10, mid=5, value=4
     i2: start=5, end=10, mid=7, value=10
     i3: start=5, end=7, mid=6, value=7
     i4: start=5, end=6, mid=5

     */
    @Test
    public void testGetMagicIndexWithBinaryApproach(){
        int[] input = new int[]{-3,-2,0,1,2,4,6,10,11,12,14};
        assertEquals(6,Q8_3.getMagicIndexWithBinaryApproach(input));

        int[] input2 = new int[]{-3,-2,0,1,2,4,7,10,11,12,14};
        assertEquals(-1,Q8_3.getMagicIndexWithBinaryApproach(input2));
    }

     /*

     what if it is not unique
     int[] input = new []{-3,-2,0,1,6,6,6,10,11,12,14};
                          0, 1, 2,3,4,5,6,7, 8, 9, 10

     i1: start=0, end=10, mid=5, value=6
     i2: start=5, end=10, mid=7, value=10
     i3: start=

     */
    @Test
    public void testNonUniqueIndexWithBinaryApproach(){
        int[] input = new int[]{-3,-2,0,1,6,6,6,10,11,12,14};
        assertEquals(6,Q8_3.getMagicIndexWithBinaryApproach2(input, 0, input.length-1));
    }

}