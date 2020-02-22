package com.company.chapter8;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

public class Q8_6Test {

    @Test
    public void hanoi() {

        Q8_6.Tower<Integer> fromTower = new Q8_6.Tower<Integer>("A");
        Q8_6.Tower<Integer> toTower = new Q8_6.Tower<Integer>("C");
        Q8_6.Tower<Integer> bufferTower = new Q8_6.Tower<Integer>("B");
        fromTower.push(3);
        fromTower.push(2);
        fromTower.push(1);
        Q8_6.hanoi(3, fromTower, toTower, bufferTower);
        assertEquals(3, toTower.size());
        assertEquals(1, (int)toTower.pop());
        assertEquals(2, (int)toTower.pop());
        assertEquals(3, (int)toTower.pop());

        fromTower.clear();
        toTower.clear();
        fromTower.push(1);
        fromTower.push(2);
        fromTower.push(3);
        fromTower.push(4);
        fromTower.push(5);
        fromTower.push(6);
        Q8_6.hanoi(fromTower.size(), fromTower, toTower, bufferTower);
        assertEquals(6, toTower.size());
    }
}