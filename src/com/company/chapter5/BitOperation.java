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

    static int maskRight(int position){
        return (1<<position) -1;
    }

    static int maskLeft(int position){
        int val = ~0;
        return val << (position +1);
    }

    static int maskZeroInBetween(int i, int j){
        return maskLeft(j) | maskRight(i);
    }

    static String convertIntegerToBinary(int value){

        String binary = "";
        int remainder;
        int quotient = value;

        do{
            int temp = quotient;
            quotient = temp / 2;
            remainder = temp % 2;
            binary = remainder + binary;
        }while(quotient != 0);

        return binary;
    }

    static String convertDecimalToBinary(double value, int decimalLimit){

        StringBuilder binaryBuilder = new StringBuilder();
        binaryBuilder.append("0.");
        double next = value;

        while (binaryBuilder.toString().length()-2 < decimalLimit){
            next = next * 2;
            int integer = (int)next;

            if(integer == 1){
                binaryBuilder.append("1");
                next = next  - 1;
            }else{
                binaryBuilder.append("0");
            }

            if(next == 0 || next == 1){
                break;
            }
        }

        return binaryBuilder.toString();
    }

    static int convertBinaryToDecimal(String value){
        double sum = 0;

        for(int i=value.length()-1, j=0;i>-1;i--,j++){
            char c = value.charAt(i);
            if(c == '1'){
                sum += Math.pow(2,j);
            }
        }

        return (int)sum;
    }



    static double convertFractionalBinaryToDecimal(String value){

        String[] split = value.split("\\.");

        if(split.length != 2){
            return -1d;
        }

        String fractional = split[1];
        double acc = 0;
        for(int i = fractional.length()-1;i>-1;i--){
            acc = (Integer.parseInt(String.valueOf(fractional.charAt(i))) + acc)/2;
        }

        return acc;
    }


}
