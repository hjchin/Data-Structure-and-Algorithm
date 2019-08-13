package com.company.chapter4;

public class TreeNode {

    public int value;
    public TreeNode leftNode;
    public TreeNode rightNode;
    public boolean visited = false;

    public TreeNode(int value){
        this.value = value;
    }

    public Boolean compare(TreeNode node){
        return this.value == node.value;
    }
}
