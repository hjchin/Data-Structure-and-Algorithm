package com.company.chapter5;

public class Q5_8 {

    //screen pixel go from bottom to top
    public static void drawLine(byte[] screen, int width, int x1, int x2, int y){
        int pos = getRowStartPosition(width, y);
        int len = x2 - x1 + 1;
        int start = pos + x1;
        System.out.println("start = "+start);
        while(len > 0){
            screen[start] = 1;
            start++;
            len--;
        }
    }

    public static int getRowStartPosition(int width, int y){
        if (y==0) return 0;
        return (width * y);
    }

}
