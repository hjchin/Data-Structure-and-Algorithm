package com.company.chapter4.graph;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GraphSearchTest {


    /*
                n1
              /    \
            n2      n3
          /   \    /  \
         n4   n5  n6   n7
     */

    public GraphNode createSampleGraph(){
        GraphNode n1 = new GraphNode("n1");
        GraphNode n2 = new GraphNode("n2");
        GraphNode n3 = new GraphNode("n3");
        GraphNode n4 = new GraphNode("n4");
        GraphNode n5 = new GraphNode("n5");
        GraphNode n6 = new GraphNode("n6");
        GraphNode n7 = new GraphNode("n7");

        n1.nodes = new GraphNode[]{n2, n3};
        n2.nodes = new GraphNode[]{n4, n5};
        n3.nodes = new GraphNode[]{n6, n7};

        return n1;
    }

    @Test
    public void testDFS(){
        GraphNode n = createSampleGraph();
        GraphSearch search = new GraphSearch();
        search.depthFirstSearch(n);
        assertEquals("n1n2n4n5n3n6n7", String.join("",search.visitSequence));
    }

    @Test
    public void testBFS(){
        GraphNode n = createSampleGraph();
        GraphSearch search = new GraphSearch();
        search.breathFirstSearch(n);
        assertEquals("n1n2n3n4n5n6n7", String.join("",search.visitSequence));
    }
}
