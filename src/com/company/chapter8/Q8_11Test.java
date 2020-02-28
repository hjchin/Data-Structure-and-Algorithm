package com.company.chapter8;

import org.junit.Test;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.HashMap;

import static com.company.chapter8.Q8_11.getCombinationString;
import static org.junit.Assert.*;

public class Q8_11Test {

    /*

    Coins: Given an infinite number of quarters (25 cents), dimes (10 cents), nickels (5 cents), and
    pennies (1 cent), write code to calculate the number of ways of representing n cents.

    0 = 25(0)+10(0)+5(0)+1(0)
    1 = 25(0)+10(0)+5(0)+1(1)
    2 = 25(0)+10(0)+5(0)+1(2)

    5 = 25(0)+10(0)+5(1)+1(0)
      = 25(0)+10(0)+5(0)+1(5)
    6 = 25(0)+10(0)+5(1)+1(1)
      = 25(0)+10(0)+5(0)+1(6)

    10 = 25(0)+10(1)+5(0)+1(0)
       = 25(0)+10(0)+5(2)+1(0)
       = 25(0)+10(0)+5(1)+1(5)
       = 25(0)+10(0)+5(0)+1(10)

    11 = 25(0)+10(1)+5(0)+1(1)
       = 25(0)+10(0)+5(2)+1(1)
       = 25(0)+10(0)+5(1)+1(6)
       = 25(0)+10(0)+5(0)+1(11)

    25 = 25(1)+10(0)+5(0)+1(0)
       = 25(0)+10(2)+5(1)+1(0)
       = 25(0)+10(2)+5(0)+1(5)
       = 25(0)+10(1)+5(3)+1(0)
       = 25(0)+10(1)+5(2)+1(5)
       = 25(0)+10(1)+5(1)+1(10)
       = 25(0)+10(1)+5(0)+1(15)
       = 25(0)+10(0)+5(5)+1(0)
       = 25(0)+10(0)+5(4)+1(5)
       = 25(0)+10(0)+5(3)+1(10)
       = 25(0)+10(0)+5(2)+1(15)
       = 25(0)+10(0)+5(1)+1(20)
       = 25(0)+10(0)+5(0)+1(25)
    */


    @Test
    public void getCombination(){
        ArrayList<String> combination = new ArrayList<>();
        combination = Q8_11.getCombination(25);
        assertEquals(13, combination.size());
        int changeCount = Q8_11.makeChange(25);
        assertEquals(13, changeCount);

        combination = Q8_11.getCombination(26);
        assertEquals(13, combination.size());
        changeCount = Q8_11.makeChange(26);
        assertEquals(13, changeCount);

        combination = Q8_11.getCombination(50);
        assertEquals(49, combination.size());
        changeCount = Q8_11.makeChange(50);
        assertEquals(49, changeCount);

        combination = Q8_11.getCombination(100);
        changeCount = Q8_11.makeChange(100);
        assertEquals(combination.size(), changeCount);
    }

    @Test
    public void getCombinationMap(){
        HashMap<Integer, Integer> map = new HashMap<>();
        map = Q8_11.getCombinationMap(0, 1, 0);
        assertEquals(0,(int)map.get(25));
        assertEquals(0,(int)map.get(10));
        assertEquals(0,(int)map.get(5));
        assertEquals(0,(int)map.get(1));

        map = Q8_11.getCombinationMap(1, 1, 1);
        assertEquals(0,(int)map.get(25));
        assertEquals(0,(int)map.get(10));
        assertEquals(0,(int)map.get(5));
        assertEquals(1,(int)map.get(1));

        map = Q8_11.getCombinationMap(5, 5,1);
        assertEquals(0,(int)map.get(25));
        assertEquals(0,(int)map.get(10));
        assertEquals(1,(int)map.get(5));
        assertEquals(0,(int)map.get(1));

        map = Q8_11.getCombinationMap(25, 25 ,1);
        assertEquals(1,(int)map.get(25));
        assertEquals(0,(int)map.get(10));
        assertEquals(0,(int)map.get(5));
        assertEquals(0,(int)map.get(1));

        map = Q8_11.getCombinationMap(26, 25, 1);
        assertEquals(1,(int)map.get(25));
        assertEquals(0,(int)map.get(10));
        assertEquals(0,(int)map.get(5));
        assertEquals(1,(int)map.get(1));
    }

    @Test
    public void transform(){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(25,1);
        map.put(10,0);
        map.put(5,0);
        map.put(1,0);
        ArrayList<String> combination = new ArrayList<>();
        Q8_11.transform(map,combination);
        assertEquals(12,combination.size());
    }

    @Test
    public void shiftRight(){
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> reset = new HashMap<>();
        map.put(25,1);
        map.put(10,0);
        map.put(5,0);
        map.put(1,0);
        Q8_11.shiftRight(map, 25);
        assertEquals("25(0)+10(2)+5(1)+1(0)",getCombinationString(map));

        Q8_11.shiftRight(map, 10);
        assertEquals("25(0)+10(1)+5(3)+1(0)",getCombinationString(map));

        Q8_11.shiftRight(map, 5);
        assertEquals("25(0)+10(1)+5(2)+1(5)",getCombinationString(map));

        Q8_11.shiftRight(map, 5);
        assertEquals("25(0)+10(1)+5(1)+1(10)",getCombinationString(map));
    }
}