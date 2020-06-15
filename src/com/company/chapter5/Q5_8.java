package com.company.chapter5;

/*
    Draw Line: A monochrome screen is stored as a single array of bytes, allowing eight consecutive
    pixels to be stored in one byte. The screen has width w, where w is divisible by 8 (that is, no byte will
    be split across rows). The height of the screen, of course, can be derived from the length of the array
    and the width. Implement a function that draws a horizontal line from ( xl, y) to ( x2, y).
    The method signature should look something like:
    drawline(byte[] screen, int width, int xl, int x2, int y)
 */
public class Q5_8 {

    //screen pixel go from bottom to top
    public static void drawLine(byte[] screen, int width, int x1, int x2, int y) {
        int pos = getRowStartPosition(width, y);
        int len = x2 - x1 + 1;
        int start = pos + x1;
        System.out.println("start = " + start);
        while (len > 0) {
            screen[start] = 1;
            start++;
            len--;
        }
    }

    public static int getRowStartPosition(int width, int y) {
        if (y == 0) return 0;
        return (width * y);
    }

}
