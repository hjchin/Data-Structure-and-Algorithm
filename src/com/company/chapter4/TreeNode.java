package com.company.chapter4;

public class TreeNode {

    public int value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int value){
        this.value = value;
    }

    public Boolean compare(TreeNode node){
        return this.value == node.value;
    }
}
