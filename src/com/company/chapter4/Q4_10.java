package com.company.chapter4;

import com.company.chapter4.tree.TreeNode;

/*
    Check Subtree: Tl and T2 are two very large binary trees, with Tl much bigger than T2. Create an
    algorithm to determine if T2 is a subtree of Tl.
    A tree T2 is a subtree of Tl if there exists a node n in Tl such that the subtree of n is identical to T2.
    That is, if you cut off the tree at node n, the two trees would be identical.
 */
public class Q4_10 {

    public TreeNode node;

    public static boolean checkSubTree(TreeNode bigTree, TreeNode subTree) {
        SearchResult searchResult = new SearchResult();
        search(bigTree, subTree, searchResult);
        if (searchResult.node == null) {
            return false;
        }

        StringBuilder bigTreeSequence = new StringBuilder();
        traverse(searchResult.node, bigTreeSequence);
        StringBuilder subTreeSequence = new StringBuilder();
        traverse(subTree, subTreeSequence);
        return bigTreeSequence.toString().equals(subTreeSequence.toString());
    }

    public static void traverse(TreeNode tree, StringBuilder sequence) {
        if (tree == null) return;
        traverse(tree.left, sequence);
        System.out.println("visit node " + tree.value);
        sequence.append(tree.value);
        traverse(tree.right, sequence);
    }

    public static void search(TreeNode tree, TreeNode target, SearchResult result) {
        if (tree == null) return;
        search(tree.left, target, result);
        if (tree.value == target.value) {
            result.node = tree;
        }
        search(tree.right, target, result);
    }

    public static void assign(TreeNode tree, SearchResult result) {
        result.node = tree;
    }

    public static class SearchResult {
        public TreeNode node;

    }


}
