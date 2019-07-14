package com.company.chapter4;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q4_1Test {

    @Test
    public void test(){
        GraphNode n1 = new GraphNode("n1");
        GraphNode n2 = new GraphNode("n2");
        assertFalse(Q4_1.isConnected(n1, n2));
    }

    @Test
    public void test1(){

        GraphNode n1 = new GraphNode("n1");
        n1.nodes = new GraphNode[]{
                new GraphNode("n3"),
                new GraphNode("n4")
        };

        GraphNode n2 = new GraphNode("n2");
        assertFalse(Q4_1.isConnected(n1, n2));
    }

    @Test
    public void test2(){

        GraphNode n1 = new GraphNode("n1");
        GraphNode n3 = new GraphNode("n3");

        n3.nodes = new GraphNode[]{
                new GraphNode("n5")
        };

        n1.nodes = new GraphNode[]{
                n3,
                new GraphNode("n4")
        };

        GraphNode n2 = new GraphNode("n2");
        assertFalse(Q4_1.isConnected(n1, n2));
    }

    @Test
    public void test3(){
        GraphNode n1 = new GraphNode("n1");
        GraphNode n2 = new GraphNode("n2");
        GraphNode n3 = new GraphNode("n3");

        n3.nodes = new GraphNode[]{
                new GraphNode("n5")
        };

        GraphNode n4 = new GraphNode("n4");
        n4.nodes = new GraphNode[]{
                new GraphNode("n6"),
                n2
        };

        n1.nodes = new GraphNode[]{
                n3,
                n4
        };

        assertTrue(Q4_1.isConnected(n1, n2));
    }
}