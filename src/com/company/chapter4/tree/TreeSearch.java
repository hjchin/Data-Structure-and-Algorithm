package com.company.chapter4.tree;

import java.util.ArrayList;

public class TreeSearch {

    public ArrayList<TreeNode> visitOrder = new ArrayList<>();

    public void inOrderSearch(TreeNode node){
        if(node == null) return;
        inOrderSearch(node.left);
        visit(node);
        inOrderSearch(node.right);
    }

    public void visit(TreeNode node){
        //System.out.println(node.value);
        visitOrder.add(node);
    }

    public void preOrderSearch(TreeNode node){
        if(node == null) return;
        visit(node);
        preOrderSearch(node.left);
        preOrderSearch(node.right);
    }

    public void postOrderSearch(TreeNode node){
        if(node == null) return;
        postOrderSearch(node.left);
        postOrderSearch(node.right);
        visit(node);
    }

}
