package com.company.chapter8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Q8_4 {

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

    public static ArrayList<ArrayList<Integer>> createSubsetAtIndex(int[] input, int startIndex, int setSize){

        ArrayList<ArrayList<Integer>> setCollections = new ArrayList<>();

        int leftNodeSize = setSize == 1 ? 1 : setSize -1;
        ArrayList<Integer> leftDefault = new ArrayList<>();

        for(int i=0,index = startIndex;i<leftNodeSize;i++,index++){
            leftDefault.add(input[index]);
        }

        StringBuilder log = new StringBuilder();
        for(Integer v: leftDefault){
            log.append("["+v+"]");
        }
        System.out.println("startIndex = "+startIndex+", left nodes: "+log);

        int remainingStartIndex;
        if(leftDefault.size() == setSize){
            remainingStartIndex = 0;
        }else{
            remainingStartIndex = startIndex + leftDefault.size() ;
        }

        System.out.println("RemainingStartIndex: "+remainingStartIndex+", startIndex = "+startIndex);

        ArrayList<Integer> set = new ArrayList<>();
        if(remainingStartIndex > startIndex){
            for(;remainingStartIndex < input.length;
                remainingStartIndex++){
                set = new ArrayList<>();
                set.addAll(leftDefault);
                set.add(input[remainingStartIndex]);
                setCollections.add(set);
            }
        }else{
            set.addAll(leftDefault);
            setCollections.add(set);
        }

        return setCollections;
    }

    public static ArrayList<ArrayList<Integer>> createSubset(int[] input, int setSize){
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
        for(int startIndex = 0; startIndex + setSize - 1 < input.length ; startIndex++){
            subsets.addAll(createSubsetAtIndex(input, startIndex, setSize));
        }
        return subsets;
    }

    public static ArrayList<ArrayList<Integer>> createSubset(int[] input){
        ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
        for(int i=1;i<=input.length;i++){
            subsets.addAll(createSubset(input, i));
        }

        return subsets;
    }



}
