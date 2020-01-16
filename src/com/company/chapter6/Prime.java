package com.company.chapter6;

public class Prime {

    static boolean isPrime(int n){
        if (n < 2) return false;
        int sqrt= (int) Math.sqrt(n);
        System.out.println("sqrt = "+sqrt);
        for (int i= 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
