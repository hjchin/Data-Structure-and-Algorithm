package com.company.chapter4;

import com.company.chapter4.tree.TreeNode;
import org.junit.Test;

public class Q4_8Test {

    @Test
    public void testGetFirstCommonAncestor(){
        TreeNode root = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(3);
        root.left = n1;
        root.right = n2;
        TreeNode ancestor = Q4_8.getFirstCommonAncestor(root, n1, n2);
    }
}