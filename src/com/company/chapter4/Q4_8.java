package com.company.chapter4;

import com.company.chapter4.tree.TreeNode;

import java.util.Stack;

public class Q4_8 {


    public static TreeNode getFirstCommonAncestor(TreeNode root, TreeNode n1, TreeNode n2){

        return null;
    }

    public static void traverse(TreeNode root, TreeNode node, Stack<Integer> ancestors){
        if(root == null) return;
        //ancestors.push()
        traverse(root.left, node, ancestors);
        if(root.value == node.value){

        }
    }

}
