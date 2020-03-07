package com.company.chapter10;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q10_5Test {

    @Test
    public void search(){

        String[] strings = {"at","ball","car","dad"};
        assertEquals(0,Q10_5.search(strings, "at"));
        assertEquals(3,Q10_5.search(strings, "dad"));

        String[] strings2 = {"at","","","","ball","car","","","dad","",""};
        assertEquals(8,Q10_5.search(strings2, "dad"));
        assertEquals(0,Q10_5.search(strings2, "at"));
        assertEquals(5,Q10_5.search(strings2, "car"));
    }
}