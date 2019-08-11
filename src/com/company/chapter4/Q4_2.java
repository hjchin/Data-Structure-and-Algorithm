package com.company.chapter4;

import java.util.ArrayList;

public class Q4_2 {

    public static TreeNode createBinaryTree(int[] array){

        TreeNode node = null;
        TreeNode pointer = null;
        ArrayList<TreeNode> list = new ArrayList();

        for(int i=0;i<array.length;i++){
            if(i==0){
                node = new TreeNode(array[i]);
                pointer = node;
            }else if(i%2 != 0){
                pointer.leftNode = new TreeNode(array[i]);
                list.add(pointer.leftNode);
            }else{
                pointer.rightNode = new TreeNode(array[i]);
                list.add(pointer.rightNode);
                pointer = list.remove(0);
            }
        }
        return node;
    }

}
