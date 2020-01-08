package com.company.chapter4;

import com.company.chapter4.tree.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q4_8Test {

    /*
                1
              /   \
            2      3
          /   \   /  \
         4    5  6    7
     */

    public TreeNode createSampleTree(){
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;

        return n1;
    }

    @Test
    public void testGetCommonAncestor(){
        TreeNode sample = createSampleTree();
        TreeNode ancestor = Q4_8.getCommonAncestor(sample, sample.left, sample.right);
        assertEquals(1, ancestor.value);

        ancestor = Q4_8.getCommonAncestor(sample, sample.left.left, sample.left.right);
        assertEquals(2, ancestor.value);

        ancestor = Q4_8.getCommonAncestor(sample, sample.right.left, sample.right.right);
        assertEquals(3, ancestor.value);

        ancestor = Q4_8.getCommonAncestor(sample, sample.left.left, sample.right.right);
        assertEquals(1, ancestor.value);
    }

    @Test
    public void testCover() {
        TreeNode sample = createSampleTree();
        assertTrue(Q4_8.cover(sample, sample.left));
        assertTrue(Q4_8.cover(sample, sample.right));
        assertFalse(Q4_8.cover(sample, new TreeNode(10)));
        assertTrue(Q4_8.cover(sample, sample.right.left));
        assertTrue(Q4_8.cover(sample, sample.right.right));
    }

}