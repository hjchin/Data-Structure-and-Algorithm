package com.company.chapter10;

/*
    Missing Int: Given an input file with four billion non-negative integers, provide an algorithm to
    generate an integer that is not contained in the file. Assume you have 1 GB of memory available for
    this task.
    FOLLOW UP
    What if you have only 10 MB of memory? Assume that all the values are distinct and we now have
    no more than one billion non-negative integers.
 */
public class Q10_7 {


    public static void findOpenNumner() {

        long numberOflnts = ((long) Integer.MAX_VALUE) + 1;
        byte[] bitfield = new byte[(int) (numberOflnts / 8)];

        int[] array = {0, 1, 2, 3, 4, 7, 8};
        for (int i = 0; i < array.length; i++) {
            int n = array[i];
            int moveLeft = n%8;
            int index = n /8;
            System.out.println("value="+n+", index="+index+", position="+(moveLeft));
            bitfield[n / 8] |= 1 << (n % 8);
        }

        for (int i = 0; i < bitfield.length; i++) {
            for (int j = 0; j < 8; j++) {
                if ((bitfield[i] & (1 << j)) == 0) {
                    System.out.println(i * 8 + j);
                    return;
                }
            }
        }
    }
}
