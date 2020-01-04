package com.company.chapter4;

import javafx.util.Pair;

import javax.swing.text.html.HTMLDocument;
import java.lang.reflect.Array;
import java.util.*;

import static java.util.Objects.isNull;

public class Q4_7 {

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

//    private String currentProject = "";
//    private boolean found = false;
//    private ArrayList<GraphNode> depNodes = new ArrayList<>();
//    private String parent;
//
//    public String[] createBuildOrder(String[] projects, GraphNode dependencies) throws Exception{
//        if(isNull(dependencies)) throw new NullPointerException("dependencies are null");
//        depNodes = getNodesFromGraph(dependencies);
//        ArrayList<String> buildOrder = getNoDependencyNode(dependencies,projects);
//        ArrayList<String> remainingProjects = getRemainingProject(projects, buildOrder);
//
//        while(remainingProjects.size() > 0){
//            String proj = remainingProjects.get(0);
//            String dep = getDependency(proj, dependencies);
//
//            if(isNull(dep)){
//                break;
//            }else if(buildOrder.contains(dep)){
//                buildOrder.add(proj);
//                remainingProjects.remove(0);
//            }else{
//                remainingProjects.add(proj);
//                remainingProjects.remove(0);
//            }
//        }
//
//        if(remainingProjects.size() == 0){
//            return buildOrder.toArray(new String[buildOrder.size()]);
//        }
//
//        throw new Exception("Build chain is not complete");
//    }
//
//    public String getDependency(String project, GraphNode deps){
//        if(deps.name.equals(project)) return null;
//        parent = null;
//        currentProject = project;
//        found = false;
//        resetVisit();
//        searchDeps(deps);
//        return parent;
//    }
//
//    private void searchDeps(GraphNode node){
//        if(node == null || found) return;
//
//        System.out.println(node.name);
//
//        if(currentProject.equals(node.name)){
//            found = true;
//            return;
//        }
//
//        node.visited = true;
//
//        if(!isNull(node.nodes)){
//            for(GraphNode n : node.nodes){
//                parent = node.name;
//                if(!n.visited){
//                    searchDeps(n);
//                }
//            }
//        }
//    }
//
//    private ArrayList<String> getNoDependencyNode(GraphNode dependencies,String[] proj) {
//        ArrayList<String> list = new ArrayList<>();
//        for(String p: proj){
//            if(!hasDependency(p, dependencies)){
//                list.add(p);
//            }
//        }
//        return list;
//    }
//
//    private void resetVisit(){
//        for(GraphNode node: depNodes){
//            node.visited = false;
//        }
//    }
//
//    private boolean hasDependency(String project, GraphNode deps){
//        if(deps.name.equals(project)) return false;
//        currentProject = project;
//        found = false;
//        resetVisit();
//        search(deps);
//        return found;
//    }
//
//    private void traverseDFS(ArrayList<GraphNode> nodesList, GraphNode node){
//        if(node == null) return;
//        nodesList.add(node);
//        node.visited = true;
//        if(!isNull(node.nodes)){
//            for(GraphNode n : node.nodes){
//                if(!n.visited){
//                    traverseDFS(nodesList, n);
//                }
//            }
//        }
//    }
//
//    private void search(GraphNode node){
//        if(node == null || found) return;
//
//        System.out.println(node.name);
//
//        if(currentProject.equals(node.name)){
//            found = true;
//            return;
//        }
//
//        node.visited = true;
//        if(!isNull(node.nodes)){
//            for(GraphNode n : node.nodes){
//                if(!n.visited){
//                    search(n);
//                }
//            }
//        }
//    }
//
//    public ArrayList<String> getRemainingProject(String[] projects, ArrayList<String> buildOrder) {
//        ArrayList<String> remainingProjects = new ArrayList<>();
//        for(String proj: projects){
//            if(!buildOrder.contains(proj)){
//                remainingProjects.add(proj);
//            }
//        }
//        return remainingProjects;
//    }
//
//    public ArrayList<GraphNode> getNodesFromGraph(GraphNode node){
//        ArrayList<GraphNode> nodesList = new ArrayList<>();
//        traverseDFS(nodesList, node);
//        return nodesList;
//    }
//
//    public static void searchDFS(GraphNode node){
//        if(node == null) return;
//        System.out.println(node.name);
//        node.visited = true;
//        if(!isNull(node.nodes)){
//            for(GraphNode n : node.nodes){
//                if(!n.visited){
//                    searchDFS(n);
//                }
//            }
//        }
//    }

    public static String[] constructBuildOrder(String[] proj, ArrayList<Pair<String, String>> depList) throws Exception {
        HashMap<String, List<String>> depMap = buildDepMap(proj, depList);
        ArrayList<String> order = new ArrayList<>();
        int loopWithoutRemove = 0;

        while(depMap.size() > 0){

            ArrayList<String> removedProj = new ArrayList<>();

            for(Map.Entry<String, List<String>> entry : depMap.entrySet()){
                List<String> list = entry.getValue();
                if(list.size() == 0){
                    order.add(entry.getKey());
                    removedProj.add(entry.getKey());
                    loopWithoutRemove = 0;
                }
            }

            if(removedProj.size() == 0){
                loopWithoutRemove++;
                if(loopWithoutRemove == 2) throw new Exception("cannot construct build order");
            }

            for(String p :removedProj){
                depMap.remove(p);
            }

            for(Map.Entry<String, List<String>> dep : depMap.entrySet()){
                dep.getValue().removeAll(removedProj);
            }
        }

        return order.toArray(new String[order.size()]);
    }

    public static HashMap<String, List<String>> buildDepMap(String[] proj, ArrayList<Pair<String, String>> depList){
        HashMap<String, List<String>> depMap = new HashMap<>();
        for(String p : proj){
            List<String> pList = new ArrayList<>();
            for(Pair<String, String> d: depList){
                if(d.getValue().equals(p)){
                    pList.add(d.getKey());
                }
            }
            depMap.put(p, pList);
        }
        return depMap;
    }

    public static ArrayList<Pair<String, String>> buildDepList(){
        ArrayList<Pair<String, String>> pairs = new ArrayList<>();
        pairs.add(new Pair<String, String>("a", "d"));
        pairs.add(new Pair<String, String>("f", "b"));
        pairs.add(new Pair<String, String>("b", "d"));
        pairs.add(new Pair<String, String>("f", "a"));
        pairs.add(new Pair<String, String>("d", "c"));
        return pairs;
    }

    public static ArrayList<Pair<String, String>> buildAdditionalDepList(){
        ArrayList<Pair<String, String>> pairs = new ArrayList<>();
        pairs.add(new Pair<String, String>("a", "d"));
        pairs.add(new Pair<String, String>("f", "b"));
        pairs.add(new Pair<String, String>("b", "d"));
        pairs.add(new Pair<String, String>("f", "a"));
        pairs.add(new Pair<String, String>("d", "c"));
        pairs.add(new Pair<String, String>("g", "f"));
        return pairs;
    }

}
