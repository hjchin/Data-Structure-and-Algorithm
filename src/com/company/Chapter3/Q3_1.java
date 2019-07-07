package com.company.Chapter3;

public class Q3_1 {

    public static class ThreeStack {

        private Integer[] array;
        private Stack stack1;
        private Stack stack2;
        private Stack stack3;

        public ThreeStack(int individualStackSize){
            array = new Integer[individualStackSize*3];
            stack1 = new Stack(0, individualStackSize-1, array);
            stack2 = new Stack(individualStackSize, individualStackSize+individualStackSize-1, array);
            stack3 = new Stack(individualStackSize+individualStackSize, individualStackSize*3-1,array);
        }

        public Stack getStack1(){
            return stack1;
        }

        public Stack getStack2(){
            return stack2;
        }

        public Stack getStack3(){
            return stack3;
        }

        public static class Stack{

            private int startIndex;
            private int endIndex;
            private Integer[] array;
            private int size = 0;

            private Stack(int startIndex, int endIndex, Integer[] stackArray){
                this.startIndex = startIndex;
                this.endIndex = endIndex;
                array = stackArray;
            }

            public Integer pop(){

                if(startIndex+size-1<startIndex){
                    throw new IndexOutOfBoundsException();
                }

                Integer value = array[startIndex+size-1];
                if(value == null){
                    throw new NullPointerException();
                }

                array[startIndex+size-1] = null;
                size--;
                return value;
            }

            public void push(Integer value){
                if(startIndex+size>endIndex){
                    throw new IndexOutOfBoundsException();
                }

                array[startIndex+size] = value;
                size++;
            }

            public int size(){
                return size;
            }
        }
    }
}
