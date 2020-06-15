package com.company.chapter5;

/*
    Insertion: You are given two 32-bit numbers, N and M, and two bit positions, i and
    j. Write a method to insert M into N such that M starts at bit j and ends at bit i. You
    can assume that the bits j through i have enough space to fit all of M. That is, if
    M = 10011, you can assume that there are at least 5 bits between j and i. You would not, for
    example, have j = 3 and i = 2, because M could not fully fit between bit 3 and bit 2.
 */
public class Q5_1 {

    /*
        N = 10000000, M = 10011, i=2, j=6
        Output: N = 10001001100
    */
    public static int insert(int n, int m, int i, int j) {
        int leftMask = BitOperation.maskLeft(j);
        int rightMask = BitOperation.maskRight(i);
        int mask = leftMask | rightMask;
        int cleared = n & mask;
        int shifted_m = m << i;
        return cleared | shifted_m;
    }
}
