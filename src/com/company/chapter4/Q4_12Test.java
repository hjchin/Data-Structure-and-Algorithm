package com.company.chapter4;

import com.company.chapter4.tree.TreeNode;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Q4_12Test {


    public TreeNode createSampleTree(){
        TreeNode root = new TreeNode(10);
        TreeNode n5 = new TreeNode(5);
        TreeNode nN3 = new TreeNode(-3);
        TreeNode n3 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2);
        TreeNode n11 = new TreeNode(11);
        TreeNode n3_2 = new TreeNode(3);
        TreeNode nN2 = new TreeNode(-2);
        TreeNode n1 = new TreeNode(1);

        root.left = n5;
        root.right = nN3;
        n5.left = n3;
        n5.right = n2;
        nN3.right = n11;
        n3.left = n3_2;
        n3.right = nN2;
        n2.right = n1;

        return root;
    }

    @Test
    public void testCountPathsWithSum(){
        TreeNode tree = createSampleTree();
        Q4_12 q = new Q4_12();
        int value = q.countPathsWithSum(tree,8);
        System.out.println(value);
    }

    /*
    sum = 8

                    10                    10,-3,11
                  /   \                   10,5,3,3
                 5     -3                 10,5,3,-2
               /  \      \                10,5,2,1
              3    2      11
            /  \    \                     -3, 11        +
           3   -2    1
                                          5,3,3         +
                                          5,3,-2

                                          5,2,1         +

     */

    @Test
    public void testCountPath(){
        TreeNode tree = createSampleTree();
        Q4_12.countPath(tree, 8, 0);
        assertEquals(3, Q4_12.pathCount);
    }

    /*
                   1
                /     \
              3        -1
            /   \     /   \
           2     1   4     5
                /   / \     \
               1   1   2     6


     */
    public Q4_12.GFG.Node createSampleTree2(){
        Q4_12.GFG.Node root = new Q4_12.GFG.Node(1);
        Q4_12.GFG.Node n3 = new Q4_12.GFG.Node(3);
        Q4_12.GFG.Node nN1 = new Q4_12.GFG.Node(-1);
        Q4_12.GFG.Node n2 = new Q4_12.GFG.Node(2);
        Q4_12.GFG.Node n1 = new Q4_12.GFG.Node(1);
        Q4_12.GFG.Node n4 = new Q4_12.GFG.Node(4);
        Q4_12.GFG.Node n5 = new Q4_12.GFG.Node(5);
        Q4_12.GFG.Node n1_2 = new Q4_12.GFG.Node(1);
        Q4_12.GFG.Node n1_3 = new Q4_12.GFG.Node(1);
        Q4_12.GFG.Node n2_2 = new Q4_12.GFG.Node(2);
        Q4_12.GFG.Node n6 = new Q4_12.GFG.Node(6);

        root.left = n3;
        root.right = nN1;
        n3.left = n2;
        n3.right = n1;
        nN1.left = n4;
        nN1.right = n5;
        n1.left = n1_2;
        n4.left = n1_3;
        n4.right = n2_2;
        n5.right = n6;

        return root;
    }

    @Test
    public void testGFG(){
        Q4_12.GFG.Node tree = createSampleTree2();
        Q4_12.GFG.printKPath(tree, 5);
    }

}
