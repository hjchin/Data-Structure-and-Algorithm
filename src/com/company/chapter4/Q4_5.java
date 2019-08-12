package com.company.chapter4;

public class Q4_5 {

    public static boolean checkBinaryTree(TreeNode node){

        if(node == null) return false;

        Integer v = node.value;
        Integer vl = node.leftNode != null ? node.leftNode.value : null;
        Integer vr = node.rightNode != null ? node.rightNode.value : null;

        if(vl != null && v < vl) return false;
        if(vr != null && vr < v) return false;

        if(vl != null && vr != null){
            return checkBinaryTree(node.leftNode) && checkBinaryTree(node.rightNode);
        }else if(vl != null){
            return checkBinaryTree(node.leftNode);
        }else if(vr != null){
            return checkBinaryTree(node.rightNode);
        }else
            return true;
    }
}
