package com.company.chapter6;

public class Q6_2 {

    /*

    Question:
    You have a basketball hoop and someone says that you can play one of two games.
    Game 1: You get one shot to make the hoop.
    Game 2: You get three shots and you have to make two of three shots.
    If p is the probability of making a particular shot, for which values of p should you pick one game
    or the other?

    1. we know that 0<= p <= 1.
    2. probability of winning Game 1 = p.
    3. probability of winning Game 2 = probability of shooting 2 or 3 balls.
                                     = p^3 + 3(p^2(1-p))
                                     = p^3 + 3(p^2-p^3)
                                     = p^3 + 3P^2 - 3p^3
                                     = 3P^2 - 2p^3
    4. for p = 0, p(Game1) = p(Game2) = 0. it doesn't matter if i play game 1 or game 2.
    6. for p = 0.5, p(Game1) = p(Game2) = 0.5. it doesn't matter if i play game 1 or game 2.
    7. for p = 1, p(Game1) = p(Game2) = 1. it doesn't matter if play game 1 or game 2.
    8. for p, 0<p<0.5, say p = 0.3, p(Game1) = 0.3, p(Game2) = 0.216, i play game 1.
    9. for p, 0.5<p<1, say p = 0.6, p(Game1) = 0.6, p(Game2) = 0.648, i play game 2.

    In other words, if i have poor skill, i go for game 1 and if I have better skill, i opt for 2/3.
    In my opinion, in reality, regardless what p is, we always go for Game 2 to have better chance.
    P is never a constant in all games.

     */
}
