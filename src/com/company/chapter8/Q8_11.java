package com.company.chapter8;

import java.util.ArrayList;
import java.util.HashMap;

public class Q8_11 {

    /*

    Coins: Given an infinite number of quarters (25 cents), dimes (10 cents), nickels (5 cents), and
    pennies (1 cent), write code to calculate the number of ways of representing n cents.

    0 = 25(0)+10(0)+5(0)+1(0)
    1 = 25(0)+10(0)+5(0)+1(1)
    2 = 25(0)+10(0)+5(0)+1(2)

    5 = 25(0)+10(0)+5(1)+1(0)
      = 25(0)+10(0)+5(0)+1(5)
    6 = 25(0)+10(0)+5(1)+1(1)
      = 25(0)+10(0)+5(0)+1(6)

    10 = 25(0)+10(1)+5(0)+1(0)
       = 25(0)+10(0)+5(2)+1(0)
       = 25(0)+10(0)+5(1)+1(5)
       = 25(0)+10(0)+5(0)+1(10)

    11 = 25(0)+10(1)+5(0)+1(1)
       = 25(0)+10(0)+5(2)+1(1)
       = 25(0)+10(0)+5(1)+1(6)
       = 25(0)+10(0)+5(0)+1(11)

    25 = 25(1)+10(0)+5(0)+1(0)
       = 25(0)+10(2)+5(1)+1(0)
       = 25(0)+10(2)+5(0)+1(5)
       = 25(0)+10(1)+5(3)+1(0)
       = 25(0)+10(1)+5(2)+1(5)
       = 25(0)+10(1)+5(1)+1(10)
       = 25(0)+10(1)+5(0)+1(15)
       = 25(0)+10(0)+5(5)+1(0)
       = 25(0)+10(0)+5(4)+1(5)
       = 25(0)+10(0)+5(3)+1(10)
       = 25(0)+10(0)+5(2)+1(15)
       = 25(0)+10(0)+5(1)+1(20)
       = 25(0)+10(0)+5(0)+1(25)
    */

    public static ArrayList<String> getCombination(int amount){
        ArrayList<String> combination = new ArrayList<>();
        int coin = 1;
        int coinCount = amount;

        if(amount>= 25){
            coin = 25;
            coinCount = amount/25;
        }else if(amount >=10){
            coin = 10;
            coinCount = amount/10;
        }else if(amount >= 5){
            coin = 5;
            coinCount = amount/5;
        }

        HashMap<Integer, Integer> map = getCombinationMap(amount,coin,coinCount);
        String str = getCombinationString(map);
        System.out.println(str);
        combination.add(str);
        transform(map, combination);
        return combination;
    }

    public static void transform(HashMap<Integer, Integer> map, ArrayList<String> result){
        int count25 = map.get(25);
        int count10 = map.get(10);
        int count5 = map.get(5);
        int count1 = map.get(1);

        if(count5 > 0){

            shiftRight(map, 5);
            String str = getCombinationString(map);
            System.out.println(str);
            result.add(str);

            transform(map, result);
            return;
        }

        if(count10 > 0){
            shiftRight(map, 10);
            String str = getCombinationString(map);
            System.out.println(str);
            result.add(str);

            transform(map, result);
            return;
        }

        if(count25>0){
            shiftRight(map, 25);
            String str = getCombinationString(map);
            System.out.println(str);
            result.add(str);

            transform(map, result);
            return;
        }
    }

    public static void shiftRight(HashMap<Integer, Integer> map, int coin){
        int amount = map.get(25)*25 + map.get(10)*10 + map.get(5)*5 + map.get(1);
        int nextCount = map.get(coin)-1;

        if(coin == 25){
            int leftBalance = 25*nextCount;
            int balance = amount - leftBalance;
            int count10 = balance/10;
            balance = balance - 10*count10;
            int count5 = balance/5;
            int count1 = balance-5*count5;
            map.put(25, nextCount);
            map.put(10,count10);
            map.put(5, count5);
            map.put(1, count1);
        }

        if(coin == 10){
            int leftBalance = map.get(25)*25+10*nextCount;
            int rightBalance = amount - leftBalance;
            int count5 = rightBalance/5;
            int balance = rightBalance - count5*5;
            map.put(10,nextCount);
            map.put(5, count5);
            map.put(1,balance);
        }

        if(coin == 5){
            int leftBalance = map.get(25)*25+map.get(10)*10+5*nextCount;
            int rightBalance = amount - leftBalance;
            map.put(5, nextCount);
            map.put(1, rightBalance);
        }
    }


    public static String getCombinationString(HashMap<Integer,Integer> map){
        return "25("+map.get(25)+")+10("+map.get(10)+")+5("+map.get(5)+")+1("+map.get(1)+")";
    }

    public static HashMap<Integer, Integer> getCombinationMap(int amount, int startCoin, int coinCount){

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(25,0);
        map.put(10,0);
        map.put(5,0);
        map.put(1,0);

        int balance = amount;

        if(startCoin == 25){
            map.put(25,coinCount);
            balance = amount - (coinCount * 25);
        }

        if(startCoin >= 10){
            int count10 = startCoin == 10 ? coinCount : balance/10;
            map.put(10,count10);
            balance = balance-(count10*10);
        }

        if(startCoin >= 5){
            int count5 = startCoin == 5 ? coinCount: balance/5;
            map.put(5, count5);
            balance = balance-(count5 * 5);
        }

        map.put(1,balance);
        return map;
    }

    public static int makeChange(int n) {
        int[] denoms = {25, 10, 5, 1};
        int[][] map = new int[n + 1][denoms.length]; // precomputed vals
        return makeChange(n, denoms, 0, map);
    }

    public static int makeChange(int amount, int[] denoms, int index, int[][] map) {
        if (map[amount][index] > 0) {//retrieve value
            return map[amount][index];
        }

        if (index >= denoms.length - 1) return 1; // one denom remaining
        int denomAmount = denoms[index];
        int ways = 0;
        for (int i= 0; i * denomAmount <= amount; i++) {
            //go to next denom, assuming i coins of denomAmount
            int amountRemaining = amount - i * denomAmount;
            ways += makeChange(amountRemaining, denoms, index + 1, map);
        }
        map[amount][index] = ways;
        return ways;
    }
}
