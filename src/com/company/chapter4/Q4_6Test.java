package com.company.chapter4;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;


public class Q4_6Test {

    @Test
    public void test(){
        TreeNode root = new TreeNode(10);
        TreeNode nl = new TreeNode(8);
        assertEquals(Q4_6.getNextNode(root, nl), null);
    }

    @Test
    public void test2(){
        TreeNode root = new TreeNode(10);
        assertEquals(Q4_6.getNextNode(root, root), null);
    }

    @Test
    public void test3(){
        TreeNode root = new TreeNode(10);
        TreeNode nl = new TreeNode(8);
        root.leftNode = nl;
        assertTrue(Q4_6.getNextNode(root, nl).compare(root));
    }

    @Test
    public void test4(){
        TreeNode root = new TreeNode(10);
        TreeNode nl = new TreeNode(8);
        TreeNode nr = new TreeNode(18);
        root.leftNode = nl;
        root.rightNode = nr;
        assertTrue(Q4_6.getNextNode(root, nl).compare(root));
    }

    @Test
    public void test5(){
        TreeNode root = new TreeNode(10);
        TreeNode nl = new TreeNode(8);
        TreeNode nr = new TreeNode(18);
        root.leftNode = nl;
        root.rightNode = nr;
        assertEquals(null, Q4_6.getNextNode(root, nr));
    }

    @Test
    public void test6(){

        /*
                20
               /  \
              10  30
             /
            4
         */

        TreeNode root = new TreeNode(20);
        TreeNode nl = new TreeNode(10);
        TreeNode nr = new TreeNode(30);
        TreeNode nll = new TreeNode(4);
        root.leftNode = nl;
        root.rightNode = nr;
        root.leftNode.leftNode = nll;
        assertEquals(nl,Q4_6.getNextNode(root, nll));
    }

    @Test
    public void test7(){
        /*
                20
               /  \
              10  30
             /  \
            4    25
         */

        TreeNode root = new TreeNode(20);
        TreeNode nlr = new TreeNode(25);
        root.leftNode = new TreeNode(10);
        root.rightNode = new TreeNode(30);
        root.leftNode.leftNode = new TreeNode(4);
        root.leftNode.rightNode = nlr;
        assertEquals(root, Q4_6.getNextNode(root, nlr));
    }

    @Test
    public void test8(){
        /*
                20
               /  \
              10  30
                \
                25
         */

        TreeNode root = new TreeNode(20);
        TreeNode nlr = new TreeNode(25);
        root.leftNode = new TreeNode(10);
        root.rightNode = new TreeNode(30);
        root.leftNode.rightNode = nlr;
        assertEquals(root, Q4_6.getNextNode(root, nlr));
    }
}