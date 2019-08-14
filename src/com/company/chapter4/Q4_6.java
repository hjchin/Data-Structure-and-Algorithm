package com.company.chapter4;

import java.util.ArrayList;

import static java.util.Objects.isNull;

public class Q4_6 {

    public static TreeNode getNextNode(TreeNode root, TreeNode target){
        ArrayList<TreeNode> parents = new ArrayList<>();
        parents.add(null);
        return traverse(parents,root,target);
    }

    public static TreeNode traverse(ArrayList<TreeNode> parents, TreeNode node, TreeNode target){

        if(isNull(node)) return null;

        TreeNode parent = getParentOf(parents, node);

        if(!isNull(node.leftNode) && !node.leftNode.visited){
            if(node.leftNode.compare(target)){
                return node;
            }

            node.leftNode.visited = true;

            if(!isNull(node.leftNode.leftNode) && !node.leftNode.leftNode.visited){
                parents.add(node);
                return traverse(parents, node.leftNode, target);
            }else if(!isNull(node.leftNode.rightNode)){
                parents.add(node);
                return traverse(parents, node.leftNode, target);
            }else{
                return traverse(parents, node, target);
            }
        }

        if(node.compare(target)){
            return parent;
        }

        if(!isNull(node.rightNode) && !node.rightNode.visited){
            node.visited = true;
            if(node.rightNode.compare(target)){
                return getParentOf(parents, node);
            }else{
                TreeNode pp = getParentOf(parents, parent);
                return traverse(parents, pp, target);
            }
        }

        return null;
    }

    private static TreeNode getParentOf(ArrayList<TreeNode> parents, TreeNode node){

        for(int i=0;i<parents.size();i++){
            if(!isNull(parents.get(i)) && parents.get(i).compare(node)){
                int j = i - 1;
                if(j<parents.size()){
                    return parents.get(j);
                }
                return null;
            }
        }

        if(parents.size()-1 >= 0){
            return parents.get(parents.size()-1);
        }else
            return null;
    }


}
