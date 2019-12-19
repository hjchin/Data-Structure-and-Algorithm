package com.company.chapter5;

public class Q5_1 {

    /*
        N = 10000000, M = 10011, i=2, j=6
        Output: N = 10001001100
    */
    public static int insert(int n, int m, int i, int j){
        int leftMask = BitOperation.maskLeft(j);
        int rightMask = BitOperation.maskRight(i);
        int mask = leftMask | rightMask;
        int cleared = n & mask;
        int shifted_m = m << i;
        return cleared | shifted_m;
    }
}
