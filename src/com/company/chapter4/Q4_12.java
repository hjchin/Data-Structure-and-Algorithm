package com.company.chapter4;

import com.company.chapter4.tree.TreeNode;

import java.util.Vector;

public class Q4_12 {

    int countPathsWithSum(TreeNode root, int targetSum) {
        if (root == null) return 0;

        /* Count paths with sum starting from the root. */
        int pathsFromRoot = countPathsWithSumFromNode(root, targetSum, 0);
        /* Try the nodes on the left and right. */
        int pathsOnLeft = countPathsWithSum(root.left, targetSum);
        int pathsOnRight = countPathsWithSum(root.right, targetSum);

        return pathsFromRoot + pathsOnLeft + pathsOnRight;
    }

    int countPathsWithSumFromNode(TreeNode node, int targetSum, int currentSum) {
        if (node == null) return 0;

        currentSum += node.value;

        int totalPaths = 0;
        if (currentSum == targetSum) { // Found a path from the root
            totalPaths++;
        }

        totalPaths += countPathsWithSumFromNode(node.left, targetSum, currentSum);
        totalPaths += countPathsWithSumFromNode(node.right, targetSum, currentSum);
        return totalPaths;
    }


    static int pathCount = 0;

    static void countPath(TreeNode node, int sum, int currentSum){
        if(node == null) return;

        currentSum += node.value;
        System.out.println("visit node "+node.value+", currentSum "+currentSum+", pathCount "+pathCount);

        if(currentSum == sum){
            pathCount++;
        }

        countPath(node.left, sum, currentSum);
        countPath(node.right, sum, currentSum);

        countPathFromNode(node, sum, 0);
    }

    static void countPathFromNode(TreeNode node, int sum, int currentSum){
        if(node == null) return;

        currentSum += node.value;
        System.out.println(" visit node "+node.value+", currentSum "+currentSum+", pathCount "+pathCount);

        if(currentSum == sum){
            pathCount++;
        }

        countPathFromNode(node.left, sum, currentSum);
        countPathFromNode(node.right, sum, currentSum);
    }

    static class GFG{

        static void printVector(Vector<Integer> v, int i){
            for (int j = i; j < v.size(); j++)
                System.out.print( v.get(j) + " ");
            System.out.println();
        }

        // binary tree node
        static class Node
        {
            int data;
            Node left,right;
            Node(int x)
            {
                data = x;
                left = right = null;
            }
        };
        static Vector<Integer> path = new Vector<Integer>();

        // This function prints all paths that have sum k
        static void printKPathUtil(Node root, int k){
            // empty node
            if (root == null)
                return;

            // add current node to the path
            System.out.println("visit node "+root.data) ;
            path.add(root.data);

            // check if there's any k sum path
            // in the left sub-tree.
            printKPathUtil(root.left, k);

            // check if there's any k sum path
            // in the right sub-tree.
            printKPathUtil(root.right, k);

            // check if there's any k sum path that
            // terminates at this node
            // Traverse the entire path as
            // there can be negative elements too
            int f = 0;
            for (int j = path.size() - 1; j >= 0; j--)
            {
                f += path.get(j);

                // If path sum is k, print the path
                if (f == k)
                    printVector(path, j);
            }

            // Remove the current element from the path
            path.remove(path.size() - 1);
        }

        // A wrapper over printKPathUtil()
        static void printKPath(Node root, int k){
            path = new Vector<Integer>();
            printKPathUtil(root, k);
        }
    }

}
