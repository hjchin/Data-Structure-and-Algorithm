package com.company.chapter4;

import com.company.chapter4.tree.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

public class Q4_8 {

    public static TreeNode getCommonAncestor(TreeNode tree, TreeNode node1, TreeNode node2){
        if(tree == null) return null;
        if(tree.value == node1.value || tree.value == node2.value){
            return tree;
        }

        boolean isNode1InLeft = cover(tree.left, node1);
        boolean isNode2InLeft = cover(tree.left, node2);

        if(isNode1InLeft != isNode2InLeft){
            return tree;
        }

        TreeNode sideNode = isNode1InLeft ? tree.left : tree.right;
        return getCommonAncestor(sideNode, node1, node2);
    }

    public static boolean cover(TreeNode tree, TreeNode target){
        if(tree == null) return false;
        if(tree.value == target.value) return true;
        return cover(tree.left, target) || cover(tree.right, target);
    }
}
