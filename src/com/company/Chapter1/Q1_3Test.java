package com.company.Chapter1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q1_3Test {

    @Test
    public void test(){

        String result = Q1_3.replaceWhiteSpace("Mr John Smith     ",13);
        assertEquals(result,"Mr%20John%20Smith");

        String result2 = Q1_3.replaceWhiteSpace("   Mr John Smith",16);
        assertEquals(result2,"%20%20%20Mr%20John%20Smith");

        String result3 = Q1_3.replaceWhiteSpace("MrJohnSmith     ",16);
        assertEquals(result3,"MrJohnSmith%20%20%20%20%20");
    }

}