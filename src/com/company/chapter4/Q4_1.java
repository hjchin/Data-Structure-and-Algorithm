package com.company.chapter4;

public class Q4_1 {

    public static boolean isConnected(GraphNode n1, GraphNode n2){

        if(n1.nodes == null){
            return false;
        }

        for(GraphNode node: n1.nodes){
            if(node.name.equals(n2.name)){
                return true;
            }
        }

        boolean found = false;
        for(GraphNode node: n1.nodes){
            found |= isConnected(node, n2);
        }

        return found;
    }
}
