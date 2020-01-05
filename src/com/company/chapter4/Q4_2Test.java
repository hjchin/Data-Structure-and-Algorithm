package com.company.chapter4;

import com.company.chapter4.tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q4_2Test {

    @Test
    public void test(){
        TreeNode treeNode = Q4_2.createBinaryTree(new int[0]);
        assertNull(treeNode);
    }

    @Test
    public void test1(){
        int[] array = {1};
        TreeNode treeNode = Q4_2.createBinaryTree(array);
        assertEquals(treeNode.value,1);
    }

    @Test
    public void test2(){
        int[] array = {1,2,3};
        TreeNode treeNode = Q4_2.createBinaryTree(array);
        assertEquals(treeNode.value,1);
        assertEquals(treeNode.left.value,2);
        assertEquals(treeNode.right.value,3);
    }

    @Test
    public void test3(){
        int[] array = {1,2,3,4,5,6};
        TreeNode treeNode = Q4_2.createBinaryTree(array);
        assertEquals(treeNode.value,1);
        assertEquals(treeNode.left.value,2);
        assertEquals(treeNode.right.value,3);
        assertEquals(treeNode.left.left.value,4);
        assertEquals(treeNode.left.right.value,5);
        assertEquals(treeNode.right.left.value,6);
        assertNull(treeNode.right.right);
    }
}