package com.company.chapter10;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q10_4Test {


    @Test
    public void search(){
        int[] array = {1,3};
        Q10_4.Listy list = new Q10_4.Listy(array);
        assertEquals(-1,Q10_4.search(list, 23));

        int[] array2 = {1,3};
        Q10_4.Listy list2 = new Q10_4.Listy(array2);
        assertEquals(0,Q10_4.search(list2, 1));

        int[] array3 = {1,3};
        Q10_4.Listy list3 = new Q10_4.Listy(array3);
        assertEquals(1,Q10_4.search(list3, 3));

        int[] array4 = {3,7,9,10,12,15,23,70};
        Q10_4.Listy list4 = new Q10_4.Listy(array4);
        assertEquals(6,Q10_4.search(list4, 23));
    }
}