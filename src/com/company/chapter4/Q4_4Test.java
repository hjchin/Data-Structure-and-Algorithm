package com.company.chapter4;

import com.company.chapter4.tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q4_4Test {

    @Test
    public void testHeight(){
        TreeNode node = new TreeNode(0);
        assertEquals(Q4_4.getHeight(node), 1);
    }

    @Test
    public void testHeight2(){
        TreeNode node = new TreeNode(0);
        node.left = new TreeNode(1);
        assertEquals(Q4_4.getHeight(node), 2);
    }

    @Test
    public void testHeight3(){
        TreeNode node = new TreeNode(0);
        node.left = new TreeNode(1);
        node.right = new TreeNode(2);
        assertEquals(Q4_4.getHeight(node), 2);
    }

    @Test
    public void testHeight4(){
        TreeNode node = new TreeNode(0);
        node.left = new TreeNode(1);
        node.left.left = new TreeNode(2);
        assertEquals(Q4_4.getHeight(node), 3);
    }

    @Test
    public void testHeight5(){
        TreeNode node = new TreeNode(0);
        node.left = new TreeNode(1);
        node.left.left = new TreeNode(2);
        node.left.left.left = new TreeNode(3);
        node.left.left.right = new TreeNode(2);
        assertEquals(Q4_4.getHeight(node), 4);
    }

    @Test
    public void testHeight6(){
        TreeNode node = new TreeNode(0);
        node.left = new TreeNode(1);
        node.left.left = new TreeNode(2);
        node.left.left.left = new TreeNode(3);
        node.left.left.right = new TreeNode(2);
        node.left.left.left.left = new TreeNode(3);
        node.left.left.left.left.left = new TreeNode(5);
        node.left.left.left.left.left.left = new TreeNode(6);
        assertEquals(Q4_4.getHeight(node), 7);
    }

    @Test
    public void testBalance(){
        TreeNode node = new TreeNode(0);
        assertTrue(Q4_4.isBalanced(node));
    }

    @Test
    public void testBalance2(){
        TreeNode node = new TreeNode(0);
        node.left = new TreeNode(1);
        assertTrue(Q4_4.isBalanced(node));
    }

    @Test
    public void testBalance3(){
        TreeNode node = new TreeNode(0);
        node.left = new TreeNode(1);
        node.left.left = new TreeNode(2);
        assertFalse(Q4_4.isBalanced(node));
    }

    @Test
    public void testBalance4(){
        TreeNode node = new TreeNode(0);
        node.left = new TreeNode(1);
        node.left.left = new TreeNode(2);
        node.left.left.left = new TreeNode(2);
        assertFalse(Q4_4.isBalanced(node));
    }

    @Test
    public void testBalance5(){
        TreeNode node = new TreeNode(0);
        node.left = new TreeNode(1);
        node.left.left = new TreeNode(2);
        node.left.left.left = new TreeNode(2);
        assertFalse(Q4_4.isBalanced(node));
    }

    @Test
    public void testBalance6(){
        TreeNode node = new TreeNode(0);
        node.left = new TreeNode(1);
        node.right = new TreeNode(2);
        assertTrue(Q4_4.isBalanced(node));
    }

    @Test
    public void testBalance7(){
        TreeNode node = new TreeNode(0);
        node.left = new TreeNode(1);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(1);
        node.right.right = new TreeNode(2);
        assertTrue(Q4_4.isBalanced(node));
    }

    @Test
    public void testBalance8(){
        TreeNode node = new TreeNode(0);
        node.left = new TreeNode(1);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(1);
        node.right.right = new TreeNode(2);
        node.left.left.left = new TreeNode(1);
        node.left.left.right = new TreeNode(1);
        assertTrue(Q4_4.isBalanced(node));
    }

    @Test
    public void testBalance9(){
        TreeNode node = new TreeNode(0);
        node.left = new TreeNode(1);
        node.right = new TreeNode(2);
        node.left.left = new TreeNode(1);
        node.right.right = new TreeNode(2);
        node.left.left.left = new TreeNode(1);
        node.left.left.right = new TreeNode(1);
        node.left.left.right.left = new TreeNode(1);
        assertFalse(Q4_4.isBalanced(node));
    }
}