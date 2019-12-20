package com.company.chapter5;

public class Q5_4 {

    public void nextNunmber(int number){

        String binary = BitOperation.convertIntegerToBinary(number);




    }

    public static int nextBiggerNumber(int number){
        String binary = BitOperation.convertIntegerToBinary(number);

        int rightMostBitPosition = -1;
        StringBuilder newValue = new StringBuilder(binary);

        for(int i=binary.length()-1;i>-1;i--){
            if(binary.charAt(i) == '1' && rightMostBitPosition ==-1){
                rightMostBitPosition = i;
            }

            if(binary.charAt(i) == '0' && rightMostBitPosition != -1){
                newValue.setCharAt(rightMostBitPosition, '0');
                newValue.setCharAt(i, '1');
                break;
            }
        }

        System.out.println("before "+binary);
        System.out.println("after "+newValue.toString());
        System.out.println("Integer "+BitOperation.convertBinaryToDecimal(newValue.toString()));

        return BitOperation.convertBinaryToDecimal(newValue.toString());
    }

    public static int nextSmallerNumber(int number){
        String binary = BitOperation.convertIntegerToBinary(number);
        int rightMostZeroBitPosition = -1;
        StringBuilder newValue = new StringBuilder(binary);

        for(int i=binary.length()-1;i>-1;i--){
            if(binary.charAt(i) == '0'){
                rightMostZeroBitPosition = i;
            }

            if(rightMostZeroBitPosition != -1 && binary.charAt(i) == '1'){
                newValue.setCharAt(rightMostZeroBitPosition,'1');
                newValue.setCharAt(i,'0');
                break;
            }
        }

        System.out.println("before "+binary);
        System.out.println("after "+newValue.toString());
        System.out.println("Integer "+BitOperation.convertBinaryToDecimal(newValue.toString()));


        return BitOperation.convertBinaryToDecimal(newValue.toString());

    }
}
