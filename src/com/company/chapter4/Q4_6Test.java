package com.company.chapter4;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;


public class Q4_6Test {

    @Test
    public void testInOrderTraverse(){
        TreeNode root = new TreeNode(10);
        Q4_6.inOrderTraverse(root);
        assertTrue(true);
    }

    @Test
    public void testInOrderTraverse1(){
        TreeNode root = new TreeNode(10);
        root.leftNode = new TreeNode(8);
        root.rightNode = new TreeNode(20);
        Q4_6.inOrderTraverse(root);
        assertTrue(true);
    }

    @Test
    public void testInOrderTraverse2(){
        TreeNode root = new TreeNode(10);
        root.leftNode = new TreeNode(8);
        root.leftNode.leftNode = new TreeNode(7);
        root.leftNode.rightNode = new TreeNode(9);
        root.rightNode = new TreeNode(20);
        Q4_6.inOrderTraverse(root);
        assertTrue(true);
    }


    @Test
    public void testNextNode(){
        TreeNode root = new TreeNode(10);
        Q4_6 Q4_6 = new Q4_6();
        Q4_6.searchNextNode(root, root);
        assertEquals(null, Q4_6.getNextNode());
    }



    @Test
    public void testNextNode1(){

        /*
         *       10
         *      /
         *     8
         * */

        TreeNode root = new TreeNode(10);
        TreeNode nl = new TreeNode(8);
        root.leftNode = nl;

        Q4_6 Q4_6 = new Q4_6();
        Q4_6.searchNextNode(root, nl);
        assertEquals(root,Q4_6.getNextNode());

        Q4_6.searchNextNode(root, root);
        assertEquals(null,Q4_6.getNextNode());
    }

    @Test
    public void testNextNode2(){

        /*
         *       10
         *      /  \
         *     8   20
         * */

        TreeNode root = new TreeNode(10);
        TreeNode nl = new TreeNode(8);
        TreeNode nr = new TreeNode(20);
        root.leftNode = nl;
        root.rightNode = nr;

        Q4_6 Q4_6 = new Q4_6();
        Q4_6.searchNextNode(root, root);
        assertEquals(nr,Q4_6.getNextNode());
    }

    @Test
    public void testNextNode3(){

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

        Q4_6 Q4_6 = new Q4_6();
        Q4_6.searchNextNode(root, nll);
        assertEquals(nl,Q4_6.getNextNode());

        Q4_6.searchNextNode(root, nl);
        assertEquals(root,Q4_6.getNextNode());

        Q4_6.searchNextNode(root, nr);
        assertEquals(null,Q4_6.getNextNode());
    }

    @Test
    public void testNextNode4(){

        /*
                20
               /  \
              10  30
             /  \
            4    12
         */

        TreeNode root = new TreeNode(20);
        TreeNode nl = new TreeNode(10);
        TreeNode nr = new TreeNode(30);
        TreeNode nll = new TreeNode(4);
        TreeNode nlr = new TreeNode(12);
        root.leftNode = nl;
        root.rightNode = nr;
        root.leftNode.leftNode = nll;
        root.leftNode.rightNode = nlr;
        Q4_6 Q4_6 = new Q4_6();
        Q4_6.searchNextNode(root, root.leftNode.rightNode);
        assertEquals(root, Q4_6.getNextNode());
    }

    @Test
    public void testNextNode5(){

        /*
                20
               /  \
              10  30
               \
                12
         */

        TreeNode root = new TreeNode(20);
        TreeNode nl = new TreeNode(10);
        TreeNode nr = new TreeNode(30);
        TreeNode nlr = new TreeNode(12);
        root.leftNode = nl;
        root.rightNode = nr;
        root.leftNode.rightNode = nlr;
        Q4_6 Q4_6 = new Q4_6();
        Q4_6.searchNextNode(root, root.leftNode.rightNode);
        assertEquals(root, Q4_6.getNextNode());

        Q4_6.searchNextNode(root, nr);
        assertEquals(null, Q4_6.getNextNode());
    }

    @Test
    public void testNextNode6(){

        /*
                20
               /   \
              10   30
                  /
                 29
         */

        TreeNode root = new TreeNode(20);
        TreeNode nl = new TreeNode(10);
        TreeNode nr = new TreeNode(30);
        TreeNode nrl = new TreeNode(29);
        root.leftNode = nl;
        root.rightNode = nr;
        root.rightNode.leftNode = nrl;
        Q4_6 Q4_6 = new Q4_6();
        Q4_6.searchNextNode(root, nrl);
        assertEquals(nr, Q4_6.getNextNode());

        Q4_6.searchNextNode(root, nr);
        assertEquals(null, Q4_6.getNextNode());
    }

    @Test
    public void testNextNode7(){

        /*
                20
               /   \
              10   30
                  /  \
                 29   35
         */

        TreeNode root = new TreeNode(20);
        TreeNode nl = new TreeNode(10);
        TreeNode nr = new TreeNode(30);
        TreeNode nrl = new TreeNode(29);
        TreeNode nrr = new TreeNode(35);
        root.leftNode = nl;
        root.rightNode = nr;
        root.rightNode.leftNode = nrl;
        root.rightNode.rightNode = nrr;

        Q4_6 Q4_6 = new Q4_6();

        Q4_6.searchNextNode(root, nr);
        assertEquals(nrr, Q4_6.getNextNode());

        Q4_6.searchNextNode(root, nrr);
        assertEquals(null, Q4_6.getNextNode());
    }

    @Test
    public void testNextNode8(){

        /*
                20
               /   \
              10   30
                     \
                     35
         */

        TreeNode root = new TreeNode(20);
        TreeNode nl = new TreeNode(10);
        TreeNode nr = new TreeNode(30);
        TreeNode nrr = new TreeNode(35);
        root.leftNode = nl;
        root.rightNode = nr;
        root.rightNode.rightNode = nrr;

        Q4_6 Q4_6 = new Q4_6();

        Q4_6.searchNextNode(root, nr);
        assertEquals(nrr, Q4_6.getNextNode());

        Q4_6.searchNextNode(root, nrr);
        assertEquals(null, Q4_6.getNextNode());
    }
}