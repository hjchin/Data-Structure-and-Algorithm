package com.company.chapter4;

import com.company.chapter4.tree.TreeNode;

import java.util.ArrayList;

public class Q4_9 {

    public static ArrayList<Integer> weaveArray(TreeNode tree){
        if(tree == null) return null;
        ArrayList<Integer> leftList = weaveArray(tree.left);
        ArrayList<Integer> rightList = weaveArray(tree.right);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(tree.value);
        if(leftList != null){
            list.addAll(leftList);
        }

        if(rightList != null){
            list.addAll(rightList);
        }
        return list;
    }

    public static ArrayList<ArrayList<Integer>> weaveArrays(TreeNode tree){
        if(tree == null) return null;
        ArrayList<ArrayList<Integer>> leftList = weaveArrays(tree.left);
        ArrayList<ArrayList<Integer>> rightList = weaveArrays(tree.right);
        ArrayList<ArrayList<Integer>> mergedList = merge(leftList, rightList);
        ArrayList<ArrayList<Integer>> prepandedList = addSuffix(tree.value, mergedList);
        return prepandedList;
    }

    public static ArrayList<ArrayList<Integer>> merge(ArrayList<ArrayList<Integer>> l1, ArrayList<ArrayList<Integer>> l2){

        /*
            level n
            {{1}}, {{15}} = {
                {1,15},
                {15,1}
            }

            {{25}}, {{35}} = {
                {25, 35},
                {35, 25}
            }

            ===============

            level n-1
            {
             {10, 1, 15},
             {10, 15, 1}
            },
            {
             {30, 25, 35},
             {30, 35, 25}
            } = {
                {10, 1, 15, 30, 25, 35},    //{20, 10, 1, 15, 30, 25, 35},
                {10, 1, 15, 30, 35, 25},    //{20, 10, 1, 15, 30, 35, 25},
                {10, 15, 1, 30, 25, 35},    //{20, 10, 15, 1, 30, 25, 35},
                {10, 15, 1, 30, 35, 25},    //{20, 10, 15, 1, 30, 35, 25},
                {30, 25, 35, 10, 1, 15},    //{20, 30, 25, 35, 10, 1, 15},
                {30, 25, 35, 10, 15, 1},    //{20, 30, 25, 35, 10, 15, 1},
                {30, 35, 25, 10, 1, 15},    //{20, 30, 35, 25, 10, 1, 15},
                {30, 35, 25, 10, 15, 1},    //{20, 30, 35, 25, 10, 15, 1},
            }
         */

        ArrayList<ArrayList<Integer>> result = null;
        if(l1 != null && l2 != null){
            result = new ArrayList<>();
            for(ArrayList<Integer> list1 : l1){
                for(ArrayList<Integer> list2 : l2){
                    ArrayList<Integer> newList = new ArrayList<Integer>();
                    newList.addAll(list1);
                    newList.addAll(list2);
                    result.add(newList);
                }
            }

            for(ArrayList<Integer> list2 : l2){
                for(ArrayList<Integer> list1: l1){
                    ArrayList<Integer> newList = new ArrayList<Integer>();
                    newList.addAll(list2);
                    newList.addAll(list1);
                    result.add(newList);
                }
            }
        }

        return result;
    }

    public static ArrayList<ArrayList<Integer>> addSuffix(int value, ArrayList<ArrayList<Integer>> lists){
        ArrayList<ArrayList<Integer>> suffix = new ArrayList<>();
        if(lists != null){
            for(ArrayList<Integer> sList : lists){
                ArrayList<Integer> nl = new ArrayList<Integer>();
                nl.add(value);
                nl.addAll(sList);
                suffix.add(nl);
            }
        }else{
            ArrayList<Integer> nl = new ArrayList<Integer>();
            nl.add(value);
            suffix.add(nl);
        }
        return suffix;
    }

}
