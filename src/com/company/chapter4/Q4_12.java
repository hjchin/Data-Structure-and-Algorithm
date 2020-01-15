package com.company.chapter4;

import com.company.chapter4.tree.TreeNode;

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
}
