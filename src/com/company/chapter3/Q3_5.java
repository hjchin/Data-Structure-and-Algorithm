package com.company.chapter3;

import java.util.Stack;

/*
    Sort Stack: Write a program to sort a stack such that the smallest items are on the top. You can use
    an additional temporary stack, but you may not copy the elements into any other data structure
    (such as an array). The stack supports the following operations: push, pop, peek, and is Empty.
 */

public class Q3_5 {

    public static class SortStack {

        private Stack<Integer> stack = new Stack<>();

        public void push(Integer i) {
            stack.push(i);
            sort();
        }

        public Integer pop() {
            return stack.pop();
        }

        public Integer peek() {
            return stack.peek();
        }

        public boolean isEmpty() {
            return stack.isEmpty();
        }

        private void sort() {
            Stack<Integer> temp = (Stack<Integer>) stack.clone();

            Stack<Integer> sortedStack = new Stack<>();
            while (!temp.isEmpty()) {
                Integer min = null;
                for (Integer integer : temp) {
                    if (min == null) {
                        min = integer;
                    } else if (integer < min) {
                        min = integer;
                    }
                }
                if (min != null) {
                    sortedStack.push(min);
                    temp.remove(min);
                }
            }

            Stack<Integer> reversedStack = new Stack<>();
            while (!sortedStack.isEmpty()) {
                reversedStack.push(sortedStack.pop());
            }
            stack = reversedStack;
        }

    }
}
