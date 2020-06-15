package com.company.chapter6;

public class Q6_10 {

    /*
    You have 1000 bottles of soda, and exactly one is poisoned. You have 10 test strips which
    can be used to detect poison. A single drop of poison will turn the test strip positive permanently.
    You can put any number of drops on a test strip at once and you can reuse a test strip as many times
    as you'd like (as long as the results are negative). However, you can only run tests once per day and
    it takes seven days to return a result. How would you figure out the poisoned bottle in as few days
    as possible?


    1000 bottles
    10 test strips
    1 test per day
    7 days for testing result


    use binary value to represent the bottles. say starts with 10 bottles.

    b1 = 0001
    b2 = 0010
    b3 = 0011
    b4 = 0100 and say b4 is poisonous
    b5 = 0101
    b6 = 0110
    b7 = 0111
    b8 = 1000
    b9 = 1001
   b10 = 1010

    drop a bit of drink from each bottle into the tubes according to the binary value

     b10      0       b10     0
     b9       0       0       b9
     b8       0       0       0
     0        b7      b7      b7
     0        b6      b6      0
     0        b5      0       b5
     0        b4      0       0
     0        0       b3      b3
     0        0       b2      0
     0        0       0       b1
   tube1    tube2   tube3   tube4

   Strip tests all tube and tube2 turn out to be positive.

     0       1       0        0  = b4 is poisonous. Use the same approach for 1000 bottles and 10 strips.


     */

}
