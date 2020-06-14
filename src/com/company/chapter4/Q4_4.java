package com.company.chapter4;

import com.company.chapter4.tree.TreeNode;

public class Q4_4 {

    /*
    Check Balanced: Implement a function to check if a binary tree is balanced. For the purposes of
    this question, a balanced tree is defined to be a tree such that the heights of the two subtrees of any
    node never differ by more than one.
     */

    public static boolean isBalanced(TreeNode node){
        if(node == null) return false;
        int diff = Math.abs(getHeight(node.left) - getHeight(node.right));
        if(diff < 2){
            return true;
        }
        return isBalanced(node.left) && isBalanced(node.right);
    }

    public static int getHeight(TreeNode node){
        if(node == null){
            return 0;
        }else if(node.left == null && node.right == null){
            return 1;
        }else if(node.left != null && node.right == null){
            return getHeight(node.left) +1;
        }else if(node.left == null){
            return getHeight(node.right) +1;
        }else
            return Math.max(getHeight(node.left), getHeight(node.right))+1;
    }
}
