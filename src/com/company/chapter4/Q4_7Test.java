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