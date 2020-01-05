package com.company.chapter4;

import com.company.chapter4.tree.TreeNode;

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
                pointer.left = new TreeNode(array[i]);
                list.add(pointer.left);
            }else{
                pointer.right = new TreeNode(array[i]);
                list.add(pointer.right);
                pointer = list.remove(0);
            }
        }
        return node;
    }

}
