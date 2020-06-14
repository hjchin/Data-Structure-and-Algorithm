package com.company.chapter4;

import com.company.chapter4.tree.TreeNode;

/*
    Validate BST: Implement a function to check if a binary tree is a binary search tree.
 */
public class Q4_5 {

    public static boolean checkBinaryTree(TreeNode node){

        if(node == null) return false;

        Integer v = node.value;
        Integer vl = node.left != null ? node.left.value : null;
        Integer vr = node.right != null ? node.right.value : null;

        if(vl != null && v < vl) return false;
        if(vr != null && vr < v) return false;

        if(vl != null && vr != null){
            return checkBinaryTree(node.left) && checkBinaryTree(node.right);
        }else if(vl != null){
            return checkBinaryTree(node.left);
        }else if(vr != null){
            return checkBinaryTree(node.right);
        }else
            return true;
    }
}
