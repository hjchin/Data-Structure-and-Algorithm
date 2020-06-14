package com.company.chapter3;

import java.util.ArrayList;
import java.util.List;

public class Q3_3 {

    /*
    Stack of Plates: Imagine a (literal) stack of plates. If the stack gets too high, it might topple.
    Therefore, in real life, we would likely start a new stack when the previous stack exceeds some
    threshold. Implement a data structure SetOfStacks that mimics this. SetO-fStacks should be
    composed of several stacks and should create a new stack once the previous one exceeds capacity.
    SetOfStacks. push() and SetOfStacks. pop() should behave identically to a single stack
    (that is, pop () should return the same values as it would if there were just a single stack).
     */
    public static class SetOfStacks {

        private List<Integer[]> list = new ArrayList<>();
        private int size = 0;
        private int lastSubstackSize = 0;
        private int subStackSize = 3;

        public Integer pop() {
            if (list.size() == 0) {
                throw new IndexOutOfBoundsException("");
            }

            Integer value = list.get(list.size() - 1)[lastSubstackSize - 1];
            list.get(list.size() - 1)[lastSubstackSize - 1] = null;

            if (lastSubstackSize == 1) {
                if (list.size() == 1) {
                    lastSubstackSize--;
                } else {
                    list.remove(list.size() - 1);
                    lastSubstackSize = subStackSize;
                }
            } else {
                lastSubstackSize--;
            }

            size--;
            return value;
        }

        public void push(Integer value) {
            if (list.size() == 0) {
                Integer[] integers = new Integer[subStackSize];
                integers[0] = value;
                list.add(integers);
                lastSubstackSize = 1;
            } else if (lastSubstackSize < list.get(list.size() - 1).length) {
                list.get(list.size() - 1)[lastSubstackSize] = value;
                lastSubstackSize++;
            } else {
                Integer[] integers = new Integer[subStackSize];
                integers[0] = value;
                list.add(integers);
                lastSubstackSize = 1;
            }

            size++;
        }

        public int size() {
            return size;
        }

        public int subListSize() {
            return list.size();
        }

    }
}
