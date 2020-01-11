package com.company.chapter4;

import com.company.chapter4.tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q4_10Test {

    /*

                          50
                      /         \
                    20           60
                   /  \        /     \
                 10   30     55      90
                / \   / \    / \
               1  15 25 35  52  56

     */

    public TreeNode createSampleTree(){
        TreeNode root = new TreeNode(50);
        TreeNode n20 = new TreeNode(20);
        TreeNode n60 = new TreeNode(60);
        TreeNode n10 = new TreeNode(10);
        TreeNode n30 = new TreeNode(30);
        TreeNode n55 = new TreeNode(55);
        TreeNode n90 = new TreeNode(90);
        TreeNode n1 = new TreeNode(1);
        TreeNode n15 = new TreeNode(15);
        TreeNode n25 = new TreeNode(25);
        TreeNode n35 = new TreeNode(35);
        TreeNode n52 = new TreeNode(52);
        TreeNode n56 = new TreeNode(56);

        root.left = n20;
        root.right = n60;
        n20.left = n10;
        n20.right = n30;
        n10.left = n1;
        n10.right = n15;
        n30.left = n25;
        n30.right = n35;
        n60.left = n55;
        n60.right = n90;
        n55.left = n52;
        n55.right = n56;

        return root;
    }

    @Test
    public void testTraverse(){
        TreeNode tree = createSampleTree();
        StringBuilder sequence = new StringBuilder();
        Q4_10.traverse(tree, sequence);
        assertEquals("1101520253035505255566090", sequence.toString());
    }

    @Test
    public void testSearch(){
        TreeNode tree = createSampleTree();
        Q4_10.SearchResult result = new Q4_10.SearchResult();
        Q4_10.search(tree, new TreeNode(100), result);
        assertEquals(null,result.node);

        result = new Q4_10.SearchResult();
        Q4_10.search(tree, new TreeNode(56), result);
        assertEquals(56, result.node.value);
    }

    @Test
    public void testSubTree(){
        TreeNode tree = createSampleTree();
        assertFalse(Q4_10.checkSubTree(tree, new TreeNode(50)));
    }

    @Test
    public void testSubTree2(){
        TreeNode tree = createSampleTree();
        assertFalse(Q4_10.checkSubTree(tree, new TreeNode(100)));
    }

    @Test
    public void testSubTree3(){
        TreeNode tree = createSampleTree();
        assertTrue(Q4_10.checkSubTree(tree, tree.left.right));
    }

    @Test
    public void testAssign(){
        TreeNode tree = createSampleTree();
        Q4_10.SearchResult result = new Q4_10.SearchResult();
        Q4_10.assign(tree, result);
        assertEquals(50, result.node.value);
    }




}