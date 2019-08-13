package com.company.chapter4;

import java.util.ArrayList;

import static java.util.Objects.isNull;

public class Q4_6 {

    public static TreeNode getNextNode(TreeNode root, TreeNode target){
        ArrayList<TreeNode> tracker = new ArrayList<>();
        tracker.add(root);
        return traverse(tracker,root,target);
    }

    public static TreeNode traverse(ArrayList<TreeNode> tracker, TreeNode node, TreeNode target){

        if(isNull(node)) return null;

        TreeNode parent = getParentOf(tracker, node);

        if(!isNull(node.leftNode) && !node.leftNode.visited){
            if(node.leftNode.compare(target)){
                return node;
            }

            node.leftNode.visited = true;

            if(!isNull(node.leftNode.leftNode) && !node.leftNode.leftNode.visited){
                tracker.add(node.leftNode);
                return traverse(tracker, node.leftNode, target);
            }else{
                stepBack(tracker);
                return traverse(tracker, parent, target);
            }
        }

        if(node.compare(target)){
            return parent;
        }

        if(!isNull(node.rightNode) && !node.rightNode.visited){
            node.visited = true;
            if(node.rightNode.compare(target)){
                return getParentOf(tracker, parent);
            }else{
                TreeNode pp = getParentOf(tracker, parent);
                stepBack(tracker);
                return traverse(tracker, pp, target);
            }
        }

        return null;
    }

    private static void stepBack(ArrayList<TreeNode> list){
        if(list.size()>0){
            list.remove(list.size()-1);
        }
    }

    private static TreeNode getParentOf(ArrayList<TreeNode> list, TreeNode node){
        for(int i=0;i<list.size();i++){
            if(list.get(i).compare(node)){
                if(list.size() < i-1)
                    return list.get(i-1);
                else
                    return null;
            }
        }
        return null;
    }


}
