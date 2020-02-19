package com.company.chapter8;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Q8_4Test {

    /*
    Power Set: Write a method to return all subsets of a set.


    Answer:
    example = {1,2,3,4,5}

    1. break each element of array into set of size 1.

    2. create subset with setSize = 1
       {1},
       {2},
       {3},
       {4},
       {5}

    2. create subset with setSize = 2
       {1,2},{1,3},{1,4},{1,5}
       {2,3},{2,4},{2,5}
       {3,4},{3,5}
       {4,5}

    3. create subset with setSize = 3
       {1,2,3},{1,2,4},{1,2,5}
       {2,3,4},{2,3,5}
       {3,4,5}

    4. create subset with setSize = 4
       {1,2,3,4},{1,2,3,5}
       {2,3,4,5}

    5. create subset with setSize = 5
       {1,2,3,4,5}
     */
    @Test
    public void testCreateSubsetAtIndex(){
        int[] input = new int[]{1,2,3,4,5};
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();

        subsets = Q8_4.createSubsetAtIndex(input,0,1);
        assertEquals(1, (int)subsets.get(0).get(0));

        subsets = Q8_4.createSubsetAtIndex(input,1,1);
        assertEquals(2, (int)subsets.get(0).get(0));

        subsets = Q8_4.createSubsetAtIndex(input,2,1);
        assertEquals(3, (int)subsets.get(0).get(0));

        subsets = Q8_4.createSubsetAtIndex(input,0,2);
        assertEquals(4, subsets.size());

        subsets = Q8_4.createSubsetAtIndex(input,1,2);
        assertEquals(3, subsets.size());

        subsets = Q8_4.createSubsetAtIndex(input,2,2);
        assertEquals(2, subsets.size());

        subsets = Q8_4.createSubsetAtIndex(input,3,2);
        assertEquals(1, subsets.size());
    }

    @Test
    public void testCreateSubsetWithSetSize(){
        int[] input = new int[]{1,2,3,4,5};
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
        subsets = Q8_4.createSubset(input, 1);
        assertEquals(5, subsets.size());
        subsets = Q8_4.createSubset(input, 5);
        assertEquals(1, subsets.size());
    }


    @Test
    public void testCreateSubset(){
        int[] input = new int[]{1,2,3,4,5};
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
        subsets = Q8_4.createSubset(input);
        assertEquals(25, subsets.size());

        int[] input2 = new int[]{1,2,3};
        subsets = Q8_4.createSubset(input2);
        assertEquals(7, subsets.size());
    }
}