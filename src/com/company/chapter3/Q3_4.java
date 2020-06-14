package com.company.chapter3;

import java.util.Stack;

/*
    Queue via Stacks: Implement a MyQueue class which implements a queue using two stacks.
 */
public class Q3_4 {

    public static class MyQueue{

        private Stack<Integer> normalStack = new Stack<>();
        private Stack<Integer> reversedStack = new Stack<>();

        public void add(Integer i){
            normalStack.add(i);
        }

        public Integer remove(){
            reverseStack();
            Integer value = reversedStack.pop();
            resetNormalStack();
            return value;
        }

        private void reverseStack(){
            reversedStack = new Stack<>();
            while(!normalStack.isEmpty()){
                reversedStack.push(normalStack.pop());
            }
        }

        private void resetNormalStack(){
            normalStack = new Stack<>();
            while(!reversedStack.isEmpty()){
                normalStack.push(reversedStack.pop());
            }
        }
    }
}
