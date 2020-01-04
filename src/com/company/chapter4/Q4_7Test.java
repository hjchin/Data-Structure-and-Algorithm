package com.company.chapter4;

import javafx.util.Pair;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class Q4_7Test {

    /*
            dependency graph

                   f
                 / |
                a  b
                | /
                d
                |
                c

           Input:
            projects: a, b, c, d, e, f
            dependencies: (a, d), (f, b), (b, d), (f, a), (d, c)

           Output: f,e,a,b,d,c

         */



//    public GraphNode buildDependencyTree(){
//        GraphNode f = new GraphNode("f");
//        GraphNode a = new GraphNode("a");
//        GraphNode d = new GraphNode("d");
//        GraphNode b = new GraphNode("b");
//        GraphNode c = new GraphNode("c");
//        d.nodes = new GraphNode[]{c};
//        a.nodes = new GraphNode[]{d};
//        b.nodes = new GraphNode[]{d};
//        f.nodes = new GraphNode[]{a,b};
//        return f;
//    }
//
//    @Test
//    public void testGetDepedency(){
//        GraphNode deps = buildDependencyTree();
//        Q4_7 Q4_7 = new Q4_7();
//        assertNull(Q4_7.getDependency("f", deps));
//
//        assertEquals("d",Q4_7.getDependency("c", deps));
//    }
//
//    @Test
//    public void testGetRemainingProjects(){
//        Q4_7 Q4_7 = new Q4_7();
//        ArrayList<String> buildOrder = new ArrayList<>();
//        buildOrder.add("e");
//        buildOrder.add("f");
//        ArrayList<String> projects = Q4_7.getRemainingProject(new String[]{"a","b","c","d","e","f"}, buildOrder);
//        assertEquals(4,projects.size());
//        assertEquals("a",projects.get(0));
//        assertEquals("b",projects.get(1));
//        assertEquals("c",projects.get(2));
//        assertEquals("d",projects.get(3));
//    }
//
//    @Test
//    public void testGetNoDependencyNode(){
//        GraphNode deps = buildDependencyTree();
//        String[] projects = new String[]{"a","b","c","d","e","f"};
//        Q4_7 Q4_7 = new Q4_7();
//        try{
//            String[] buildOrder = Q4_7.createBuildOrder(projects, deps);
//            assertEquals(2, buildOrder.length);
//            assertEquals("e",buildOrder[0]);
//            assertEquals("f",buildOrder[1]);
//        }catch (Exception e){
//
//        }
//    }
//
//    @Test
//    public void testSearchDFS(){
//        GraphNode deps = buildDependencyTree();
//        Q4_7.searchDFS(deps);
//        assertTrue(true);
//    }
//
//    @Test
//    public void testGetNodesFromGraph(){
//        GraphNode deps = buildDependencyTree();
//        Q4_7 Q4_7 = new Q4_7();
//        ArrayList<GraphNode> nodesList = Q4_7.getNodesFromGraph(deps);
//        assertEquals(5, nodesList.size());
//
//        for(GraphNode node: nodesList){
//            node.visited = false;
//        }
//
//        ArrayList<GraphNode> nodesList2 = Q4_7.getNodesFromGraph(deps);
//        assertEquals(5, nodesList2.size());
//    }

    @Test
    public void testBuildDepMap(){
        ArrayList<Pair<String, String>> depList = Q4_7.buildDepList();
        String[] project = {"a","b","c","d","e","f"};
        HashMap<String, List<String>> dep = Q4_7.buildDepMap(project, depList);
        Iterator it = dep.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry<String, List<String>> entry = (Map.Entry<String, List<String>>) it.next();
            System.out.print(entry.getKey() + "->");
            for(String v : entry.getValue()){
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void testConstructBuildOrder(){
        String[] project = {"a","b","c","d","e","f"};

        try {
            String[] buildOrder = Q4_7.constructBuildOrder(project,Q4_7.buildDepList());
            String answer = "";
            for(String b: buildOrder){
                System.out.print(b + " ");
                answer += b;
            }
            assertEquals("efabdc",answer);

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            String[] buildOrder = Q4_7.constructBuildOrder(project,Q4_7.buildAdditionalDepList());
            String answer = "";
            for(String b: buildOrder){
                System.out.print(b + " ");
                answer += b;
            }
            fail();
        } catch (Exception e) {
            assertTrue(true);
        }
    }
}