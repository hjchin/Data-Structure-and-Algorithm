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
