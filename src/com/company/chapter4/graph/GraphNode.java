package com.company.chapter4.graph;

public class GraphNode {

    public String name;
    public GraphNode[] nodes;
    public boolean isVisited;

    public GraphNode(String name){
        this.name = name;
    }
}
