package com.company.Chapter3;

import java.util.Iterator;
import java.util.Stack;

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
