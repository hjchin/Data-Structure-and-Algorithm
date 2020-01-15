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
}
