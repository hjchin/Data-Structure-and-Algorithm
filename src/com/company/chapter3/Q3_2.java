package com.company.chapter3;

import java.util.ArrayList;

public class Q3_2 {

    public static class Stack{

        private ArrayList<Integer> list = new ArrayList<>();
        private java.util.Stack<Integer> min = new java.util.Stack<Integer>();

        public Integer pop(){
            if(list.size() == 0){
                throw new IndexOutOfBoundsException();
            }

            Integer value = list.get(list.size()-1);
            if(value <= min.peek()){
                min.pop();
            }

            list.remove(list.size()-1);
            return value;
        }

        public void push(Integer i){
            if(min.empty() || i < min.peek()){
                min.push(i);
            }
            list.add(i);
        }

        public Integer min(){
            return min.peek();
        }

        public int size(){
            return list.size();
        }
    }
}
