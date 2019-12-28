package com.company.chapter5;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q5_8Test {

    @Test
    public void testGetRowStartPosition(){
        int pos = Q5_8.getRowStartPosition(8,0);
        assertEquals(pos,0);
        assertEquals(8,Q5_8.getRowStartPosition(8,1));
        assertEquals(16,Q5_8.getRowStartPosition(8,2));
        assertEquals(56,Q5_8.getRowStartPosition(8,7));
    }

    @Test
    public void testDrawline(){
        byte[] screen = new byte[64];
        Q5_8.drawLine(screen, 8, 0, 3, 7);

        //upside down screen.
        int width = 0;
        for(int i=0;i<screen.length;i++){
            System.out.print(screen[i]);
            width++;
            if(width == 8){
                System.out.println();
                width = 0;
            }
        }
    }
}