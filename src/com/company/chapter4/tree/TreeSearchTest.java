package com.company.chapter4.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TreeSearchTest {

    /*
            1
          /   \
         2     3
       /  \   /  \
      4   5  6    7

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
    public void testInOrderSearch(){
        TreeNode nodes = createSampleTree();
        TreeSearch ts = new TreeSearch();
        String order = "";
        ts.inOrderSearch(nodes);
        for(TreeNode n: ts.visitOrder){
            System.out.print(n.value+" ");
            order += n.value;
        }
        assertEquals("4251637",order);
    }

    @Test
    public void testPreOrderSearch(){
        TreeNode nodes = createSampleTree();
        TreeSearch ts = new TreeSearch();
        String order = "";
        ts.preOrderSearch(nodes);
        for(TreeNode n: ts.visitOrder){
            System.out.print(n.value+" ");
            order += n.value;
        }
        assertEquals("1245367",order);
    }

    @Test
    public void testPostOrderSearch(){
        TreeNode nodes = createSampleTree();
        TreeSearch ts = new TreeSearch();
        String order = "";
        ts.postOrderSearch(nodes);
        for(TreeNode n: ts.visitOrder){
            System.out.print(n.value+" ");
            order += n.value;
        }
        assertEquals("4526731",order);
    }
}