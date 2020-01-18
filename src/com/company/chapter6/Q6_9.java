package com.company.chapter6;

public class Q6_9 {
    /*

    Question:
    100 Lockers: There are 100 closed lockers in a hallway. A man begins by opening all 100 lockers.
    Next, he closes every second locker. Then, on his third pass, he toggles every third locker (closes it if
    it is open or opens it if it is closed). This process continues for 100 passes, such that on each pass i,
    the man toggles every ith locker. After his 100th pass in the hallway, in which he toggles only locker
    #100, how many lockers are open?

    Refined question:
    You are standing in a school hallway lined with 100 closed lockers. You then open all 100 lockers.
    After this, you then close every 2nd locker (so the 2nd, 4th, 6th…98th and 100th are all closed).
    Then, you go to every third locker and open it if it is closed or close it if it is open (let’s call this toggling the locker for our discussion).
    You proceed to toggle every nth locker on pass number n. So, for example, on pass number 16 – you will toggle every 16th locker.
    After your hundredth pass of the hallway, in which you toggle only locker number 100, how many lockers are now open?

    let's start with 10 lockers.
    1 = open
    0 = closed

      p1  p2  p3  p4  p5  p6  p7  p8  p9  p10...p100

    1: 1  1   1   1   1   1   1   1   1   1
    2: 1  0   0   0   0   0   0   0   0   0
    3: 1  1   0   0   0   0   0   0   0   0
    4: 1  0   0   1   1   1   1   1   1   1
    5: 1  1   1   1   0   0   0   0   0   0
    6: 1  0   1   1   1   0   0   0   0   0
    7: 1  1   1   1   1   1   0   0   0   0
    8: 1  0   0   1   1   1   1   0   0   0
    9: 1  1   0   0   0   0   0   0   1   1
   10: 1  0   0   0   1   1   1   1   1   0

    1: 1 flip, o = 1
    2: 2 flips, o = 0
    3: 2 flips, o = 0
    4: 3 flip3, o = 1
    5: 2 flip2, o = 0
    6: 3 flips, o = 0

   number of flip for locker l is numbers of factors of l.
   finding the odd number of factors for number between 1-100 solves the problem.


     */

}
