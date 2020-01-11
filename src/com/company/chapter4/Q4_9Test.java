package com.company.chapter4;

import com.company.chapter4.tree.TreeNode;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Q4_9Test {

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
    public void testWeaveArray(){
        TreeNode tree = createSampleTree();
        ArrayList<Integer> sequence = Q4_9.weaveArray(tree);
        String result = "";
        for(Integer i: sequence){
            System.out.print(i + " ");
            result += i +" ";
        }
        assertEquals("50 20 10 1 15 30 25 35 60 55 52 56 90 ", result);
    }


    @Test
    public void testWeaveArrays(){
        TreeNode tree = createSampleTree();
        ArrayList<ArrayList<Integer>> rs = Q4_9.weaveArrays(tree);

        for(ArrayList<Integer> lst : rs){
            for(Integer v: lst){
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void testAddSuffix(){
        ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> l1 = new ArrayList<>(); l1.add(10);
        ArrayList<Integer> l2 = new ArrayList<>(); l2.add(20);
        ArrayList<Integer> l3 = new ArrayList<>(); l3.add(30);

        lists.add(l1);
        lists.add(l2);
        lists.add(l3);

        ArrayList<ArrayList<Integer>> mList = Q4_9.addSuffix(0, lists);
        for(ArrayList<Integer> l : mList){
            System.out.println(l.get(0)+" "+l.get(1));
            assertEquals(0,(int)l.get(0));
        }
    }

    @Test
    public void testAddSuffix2(){
        ArrayList<ArrayList<Integer>> mList = Q4_9.addSuffix(0, null);
        for(ArrayList<Integer> l : mList){
            System.out.println(l.get(0));
            assertEquals(0,(int)l.get(0));
        }
    }

    @Test
    public void testMerge(){
        ArrayList<Integer> l1 = new ArrayList<>(); l1.add(1);
        ArrayList<Integer> l2 = new ArrayList<>(); l2.add(15);
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>(); list1.add(l1);
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>(); list2.add(l2);
        ArrayList<ArrayList<Integer>> rs = Q4_9.merge(list1, list2);

        for(ArrayList<Integer> lst : rs){
            for(Integer v: lst){
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void testMerge2(){
        ArrayList<Integer> l1 = new ArrayList<>(); l1.add(10);l1.add(1);l1.add(15);
        ArrayList<Integer> l2 = new ArrayList<>(); l2.add(10);l2.add(15);l2.add(1);
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>(); list1.add(l1);list1.add(l2);

        ArrayList<Integer> l3 = new ArrayList<>(); l3.add(30);l3.add(25);l3.add(35);
        ArrayList<Integer> l4 = new ArrayList<>(); l4.add(30);l4.add(35);l4.add(25);
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();list2.add(l3);list2.add(l4);
        ArrayList<ArrayList<Integer>> rs = Q4_9.merge(list1, list2);

        for(ArrayList<Integer> lst : rs){
            for(Integer v: lst){
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void testMergeNPrepandList(){
        ArrayList<ArrayList<Integer>> l1 = null;
        ArrayList<ArrayList<Integer>> l2 = null;
        ArrayList<ArrayList<Integer>> rs = Q4_9.merge(l1, l2);

//        for(ArrayList<Integer> lst : rs){
//            for(Integer v: lst){
//                System.out.print(v + " v");
//            }
//            System.out.println("j");
//        }

        ArrayList<ArrayList<Integer>> data = Q4_9.addSuffix(1, rs);
        for(ArrayList<Integer> i: data){
            for(Integer j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}