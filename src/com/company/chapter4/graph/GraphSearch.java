package com.company.chapter4.graph;

import sun.misc.Queue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GraphSearch {

    public ArrayList<String> visitSequence = new ArrayList<>();

    public void depthFirstSearch(GraphNode node){
        if(node == null) return;
        visit(node);
        if(node.nodes != null){
            for(GraphNode n : node.nodes){
                depthFirstSearch(n);
            }
        }
    }

    public void visit(GraphNode node){
        System.out.println(node.name);
        visitSequence.add(node.name);
    }

    public void breathFirstSearch(GraphNode node){
        Queue<GraphNode> q = new Queue<>();
        q.enqueue(node);

        while(!q.isEmpty()){
            try {
                GraphNode gn = q.dequeue();
                visit(gn);
                if(gn.nodes != null){
                    for(GraphNode n : gn.nodes){
                        q.enqueue(n);
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
