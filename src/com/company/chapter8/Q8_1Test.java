package com.company.chapter8;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q8_1Test {

    @Test
    public void testGetStep(){
        int step = Q8_1.getStep(4);
        System.out.println(step);
        Assert.assertEquals(7,step);
    }

    @Test
    public void testGetStepWithCache(){
        int step = Q8_1.getStepWithCache(4);
        System.out.println(step);
        Assert.assertEquals(7,step);
    }
}