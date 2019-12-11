package com.company.chapter5;

public class BitOperation {

    /*
        bit position = position from the right. It starts from 0
     */

    static int getBit(int value, int position){
        int mask = 1 << position;
        return (value & mask) != 0 ? 1: 0;
    }

    static int setBit(int num, int position){
        int mask = 1 << position;
        return num | mask;
    }

    static int clearBit(int num, int position){
        int mask = ~(1 << position);
        return num & mask;
    }

    static int updateBit(int num, int position, boolean isBit){
        int mask =  1 << position;
        if(isBit){
            return num | mask;
        }else{
            mask = ~mask;
            return num & mask;
        }
    }

}
