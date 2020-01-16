package com.company.chapter6;

public class Q6_4 {

    /*

    Question:
    There are three ants on different vertices of a triangle. What is the probability of
    collision (between any two or all of them) if they start walking on the sides of the triangle? Assume
    that each ant randomly picks a direction, with either direction being equally likely to be chosen, and
    that they walk at the same speed.
    Similarly, find the probability of collision with n ants on an n-vertex polygon.


            X
           /_\
          Y   Z

          P(collision) = p(collision of 2 ants) + p(collision of 3 ants)
                       = p(2n) + p(3n)

          p(2n) = p(x & y) + p(x & z) + p(y & z)
                = 1/2 * 1/2 + 1/2 * 1/2 + 1/2 * 1/2
                = 3/4

          p(3n) = p(x & y & z)
                = 1/2 * 1/2 * 1/2 = 1/6

          p(2n) + p(3n) = 3/4 + 1/6 = 18+4/24 = 22/24 = 11/12

          Generalization:
          p(2n) = (1/4)N
          p(Alln) = (1/2)^N
          p(2n) + p(alln) = (1/4)N + (1/2)^N

     */
}
