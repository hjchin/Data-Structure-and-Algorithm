package com.company.chapter4;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.LinkedList;

public class Q4_3 {

    public static ArrayList<LinkedList<TreeNode>> createLinkedList(TreeNode node){
        ArrayList<LinkedList<TreeNode>> masterList = new ArrayList<>();
        ArrayList<Pair<Integer,TreeNode>> pointer = new ArrayList<>();
        int level = 1;
        pointer.add(new Pair<>(level, node));
        create(masterList, pointer);
        return masterList;
    }

    private static void create(ArrayList<LinkedList<TreeNode>> masterList, ArrayList<Pair<Integer,TreeNode>> pointer){
        Pair pair = pointer.remove(0);
        int level = (int)pair.getKey();
        TreeNode node = (TreeNode)pair.getValue();
        LinkedList<TreeNode> list;

        if(masterList.size() < level){
            list = new LinkedList<>();
        }else{
            list = masterList.get(level-1);
        }
        list.add(node);

        if(masterList.size() < level){
            masterList.add(list);
        }else{
            masterList.set(level-1,list);
        }

        if(node.left != null) pointer.add(new Pair<>(level+1, node.left));
        if(node.right != null) pointer.add(new Pair<>(level+1, node.right));
        if(pointer.size()>0){
            create(masterList, pointer);
        }
    }
}
