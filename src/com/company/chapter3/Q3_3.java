package com.company.chapter3;

import java.util.ArrayList;
import java.util.List;

public class Q3_3 {

    public static class SetOfStacks{

        private List<Integer[]> list = new ArrayList<>();
        private int size = 0;
        private int lastSubstackSize = 0;
        private int subStackSize = 3;

        public Integer pop(){
            if(list.size() == 0){
               throw new IndexOutOfBoundsException("");
            }

            Integer value = list.get(list.size()-1)[lastSubstackSize-1];
            list.get(list.size()-1)[lastSubstackSize-1] = null;

            if(lastSubstackSize == 1){
                if(list.size() == 1){
                    lastSubstackSize--;
                }else{
                    list.remove(list.size()-1);
                    lastSubstackSize = subStackSize;
                }
            }else{
                lastSubstackSize--;
            }

            size--;
            return value;
        }

        public void push(Integer value){
            if(list.size() == 0){
                Integer[] integers = new Integer[subStackSize];
                integers[0] = value;
                list.add(integers);
                lastSubstackSize = 1;
            }else if(lastSubstackSize < list.get(list.size()-1).length){
                list.get(list.size()-1)[lastSubstackSize] = value;
                lastSubstackSize++;
            }else{
                Integer[] integers = new Integer[subStackSize];
                integers[0] = value;
                list.add(integers);
                lastSubstackSize = 1;
            }

            size++;
        }

        public int size(){
            return size;
        }

        public int subListSize(){
            return list.size();
        }

    }
}
