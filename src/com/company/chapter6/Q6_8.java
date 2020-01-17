package com.company.chapter6;

public class Q6_8 {

    /*
    The Egg Drop Problem: There is a building of 100 floors. If an egg drops from the Nth floor or
    above, it will break. If it's dropped from any floor below, it will not break. You're given two eggs. Find
    N, while minimizing the number of drops for the worst case.

    Refined question:
    Suppose that we wish to know which stories in a 100-story building are safe to drop eggs from,
    and which will cause the eggs to break on landing. What strategy should be used to drop eggs such
    that total number of drops in worst case is minimized and we find the required floor.

    Drop    Floor
    #1      14
    #2      14+13 = 27
    #3      27+12 = 39
    #4      39+11 = 50
    #5      50+10 = 60
    #6      60+9  = 69
    #7      69+8  = 77
    #8      77+7  = 84
    #9      84+6  = 90
    #10     90+5  = 95
    #11     95+4  = 99
    #12     99+1  = 100

    n(n+1)/2 ~ 100
    n = 14

    Worst scenario happen when egg break at n = 14. it takes 1 + 13 = 14 steps to locate the 13th floor.



     */


}
