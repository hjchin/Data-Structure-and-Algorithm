package com.company.chapter4;

import static java.util.Objects.isNull;

public class Q4_6 {

    public static void inOrderTraverse(TreeNode node){
        if(isNull(node)) return;
        inOrderTraverse(node.left);
        System.out.println("node "+node.value);
        inOrderTraverse(node.right);
    }

    private Boolean found = false;
    private TreeNode nextNode = null;
    private TreeNode target = null;

    public void searchNextNode(TreeNode node, TreeNode target){
       found = false;
       this.target = target;
       nextNode = null;
       searchInOrder(node);
    }

    private void searchInOrder(TreeNode node){
        if(isNull(node) || !isNull(nextNode)) return;

        searchInOrder(node.left);

        System.out.println("node "+node.value);

        if(node.compare(target)){
            found = true;
        }else if(found){
            System.out.println("next node found "+node.value);
            if(isNull(nextNode)) nextNode = node;
        }

        searchInOrder(node.right);
    }

    public TreeNode getNextNode(){
        return nextNode;
    }



}
