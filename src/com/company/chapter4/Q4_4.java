package com.company.chapter4;

public class Q4_4 {

    public static boolean isBalanced(TreeNode node){
        if(node == null) return false;
        int diff = Math.abs(getHeight(node.leftNode) - getHeight(node.rightNode));
        if(diff < 2){
            return true;
        }
        return isBalanced(node.leftNode) && isBalanced(node.rightNode);
    }

    public static int getHeight(TreeNode node){
        if(node == null){
            return 0;
        }else if(node.leftNode == null && node.rightNode == null){
            return 1;
        }else if(node.leftNode!= null && node.rightNode == null){
            return getHeight(node.leftNode) +1;
        }else if(node.leftNode == null){
            return getHeight(node.rightNode) +1;
        }else
            return Math.max(getHeight(node.leftNode), getHeight(node.rightNode))+1;
    }
}
