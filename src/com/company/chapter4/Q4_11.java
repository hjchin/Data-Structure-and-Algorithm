package com.company.chapter4;

import com.company.chapter4.tree.TreeNode;

import java.util.ArrayList;
import java.util.Random;

public class Q4_11 {


    public static class BinarySearchTree {

        private TreeNode root;
        private int size = 0;
        private ArrayList<TreeNode> nodeList = new ArrayList<>();

        public int getSize(){
            return size;
        }

        public BinarySearchTree(TreeNode root){
            this.root = root;
            addNode(root);
        }

        public void insert(TreeNode node){
            insertNewNode(root, node);
            size++;
        }

        public TreeNode find(TreeNode node){
            searchNode = null;
            searchNode(root, node);
            return searchNode;
        }

        public void delete(TreeNode node){

            searchNode = null;
            searchNodeParent = null;

            searchNode(root, node);
            if(searchNode == null){
                return;
            }

            if(searchNode.left == null && searchNode.right == null){
                if(searchNodeParent.left != null && searchNodeParent.left.value == node.value){
                    nodeList.remove(searchNodeParent.left);
                    searchNodeParent.left = null;
                    size--;
                }

                if(searchNodeParent.right != null && searchNodeParent.right.value == node.value){
                    nodeList.remove(searchNodeParent.right);
                    searchNodeParent.right = null;
                    size--;
                }
                return;
            }

            if(searchNode.left != null){
                getNextMax(searchNode.left);
                if(nextMaxNodeParent != null){
                    searchNode.value = nextMaxNodeParent.right.value;
                    nodeList.remove(nextMaxNodeParent.right);
                    nextMaxNodeParent.right = null;
                }else{
                    searchNode.value = searchNode.left.value;
                    nodeList.remove(searchNode.left);
                    searchNode.left = null;
                }
                size--;
                return;
            }

            if(searchNode.right != null){
                if(searchNodeParent.left.value == node.value){
                    searchNodeParent.left = searchNode.right;
                    nodeList.remove(searchNodeParent.left.right);
                    searchNodeParent.left.right = null;
                }

                if(searchNodeParent.right.value == node.value){
                    searchNodeParent.right = searchNode.right;
                    nodeList.remove(searchNodeParent.right);
                    searchNodeParent.right.right = null;
                }

                size--;
            }
        }

        public static void getNextMax(TreeNode node){
            if(node == null) return;
            if(node.right != null){
                nextMaxNodeParent = node;
                getNextMax(node.right);
            }
        }

        static TreeNode nextMaxNodeParent;

        public TreeNode getRandomNode(){
            Random r = new Random();
            int index = r.nextInt(nodeList.size());
            return nodeList.get(index);
        }

        public static void searchNode(TreeNode node, TreeNode target){
            if(node == null) return;

            if(node.value == target.value){
                searchNode = node;
                return;
            }

            TreeNode sideNode;
            if(target.value > node.value){
                searchNodeParent = node;
                sideNode = node.right;
            }else {
                searchNodeParent = node;
                sideNode = node.left;
            }

            searchNode(sideNode, target);
        }

        static TreeNode searchNodeParent;
        static TreeNode searchNode;

        public static void insertNewNode(TreeNode node, TreeNode newNode){
            lastParentNode = null;
            traverse(node, newNode);
            if(newNode.value > lastParentNode.value){
                lastParentNode.right = newNode;
            }else{
                lastParentNode.left = newNode;
            }
        }

        public static void traverse(TreeNode node, TreeNode newNode){
            if(node == null) return;
            if(newNode.value > node.value){
                lastParentNode = node;
                insertNewNode(node.right, newNode);
            }else{
                lastParentNode = node;
                insertNewNode(node.left, newNode);
            }
        }

        private void addNode(TreeNode node){
            if(node == null) return;
            size++;
            nodeList.add(node);
            addNode(node.left);
            addNode(node.right);
        }

        private static TreeNode lastParentNode;
    }

}
