package com.company.chapter4;

import com.company.chapter4.tree.TreeNode;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class Q4_11Test {

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
    public void testInsertNewNode(){
        TreeNode root = new TreeNode(50);

        TreeNode n20 = new TreeNode(20);
        Q4_11.BinarySearchTree.insertNewNode(root, n20);
        assertEquals(20, root.left.value);

        TreeNode n60 = new TreeNode(60);
        Q4_11.BinarySearchTree.insertNewNode(root, n60);
        assertEquals(60, root.right.value);

        TreeNode n90 = new TreeNode(90);
        Q4_11.BinarySearchTree.insertNewNode(root, n90);
        assertEquals(90, root.right.right.value);

        TreeNode n55 = new TreeNode(55);
        Q4_11.BinarySearchTree.insertNewNode(root, n55);
        assertEquals(55, root.right.left.value);
    }

    @Test
    public void testSearchNode(){
        TreeNode root = createSampleTree();
        Q4_11.BinarySearchTree.searchNode(root, new TreeNode(100));
        assertNull(Q4_11.BinarySearchTree.searchNode);

        Q4_11.BinarySearchTree.searchNode(root, root.left.left);
        assertEquals(10,Q4_11.BinarySearchTree.searchNode.value);
        assertEquals(20,Q4_11.BinarySearchTree.searchNodeParent.value);

        Q4_11.BinarySearchTree.searchNode(root, root.right.right);
        assertEquals(90,Q4_11.BinarySearchTree.searchNode.value);
        assertEquals(60,Q4_11.BinarySearchTree.searchNodeParent.value);
    }

    @Test
    public void testGetNextMax(){
        TreeNode root = createSampleTree();
        Q4_11.BinarySearchTree.getNextMax(root);
        assertEquals(90, Q4_11.BinarySearchTree.nextMaxNodeParent.right.value);

        Q4_11.BinarySearchTree.getNextMax(root.left);
        assertEquals(35, Q4_11.BinarySearchTree.nextMaxNodeParent.right.value);

        Q4_11.BinarySearchTree.getNextMax(root.left.right);
        assertEquals(35, Q4_11.BinarySearchTree.nextMaxNodeParent.right.value);
    }

    @Test
    public void testDelete(){
        TreeNode root = createSampleTree();
        Q4_11.BinarySearchTree q = new Q4_11.BinarySearchTree(root);

        q.delete(new TreeNode(100));
        assertEquals(13, q.getSize());

        q.delete(new TreeNode(90));
        assertNull(root.right.right);

        q.delete(new TreeNode(90));
        assertNull(root.right.right);

        q.delete(new TreeNode(1));
        assertNull(root.left.left.left);

        q.delete(new TreeNode(15));
        assertNull(root.left.left.right);
    }

    @Test
    public void testDelete2(){
        TreeNode root = createSampleTree();
        Q4_11.BinarySearchTree q = new Q4_11.BinarySearchTree(root);

        q.delete(new TreeNode(60));
        assertEquals(56,root.right.value);
        assertEquals(55,root.right.left.value);
        assertEquals(null,root.right.left.right);
    }


    @Test
    public void testDelete3(){
        TreeNode root = createSampleTree();
        Q4_11.BinarySearchTree q = new Q4_11.BinarySearchTree(root);

        q.delete(new TreeNode(55));
        assertEquals(52,root.right.left.value);
        assertEquals(null,root.right.left.left);
        assertEquals(56,root.right.left.right.value);


        q.delete(new TreeNode(52));
        assertEquals(56,root.right.left.value);
        assertEquals(null,root.right.left.left);
        assertEquals(null,root.right.left.right);
    }
}