package com.company.chapter6;

public class Q6_1 {

    /*


     Question: You have 20 bottles of pills. 19 bottles have 1.0 gram pills, but one has pills of weight 1.1 grams.
     Given a scale that provides an exact measurement, how would you find the heavy bottle? You can only use the scale once.

     1. There are 20 bottles. take 1 pill from bottle 1, 2 from bottle 2, so on and so forth.
        in total, there are n = 20 (1+21)/2 = 210gram for 1.0 gram pill

     2. weigh the all 210 pills on the scale, w.
     3. delta = w - n = d. The d is contributed by the 1.1gram pill.
     4. d = number of pill in the collection x 0.1. And Number of pill represent the bottle number.

     */
}
