package com.company.chapter4;

public class Node {
    public String name;
    public Node next;

    public Node(String name){
        this.name = name;
    }

    public Boolean equals(Node node){
        return this.name.equals(node.name);
    }
}
