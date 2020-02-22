package com.company.chapter8;

import java.util.Stack;

public class Q8_6 {

    /*
    Towers of Hanoi: In the classic problem of the Towers of Hanoi, you have 3 towers and N disks of
    different sizes which can slide onto any tower. The puzzle starts with disks sorted in ascending order
    of size from top to bottom (i.e., each disk sits on top of an even larger one). You have the following
    constraints:
    (1) Only one disk can be moved at a time.
    (2) A disk is slid off the top of one tower onto another tower.
    (3) A disk cannot be placed on top of a smaller disk.
    Write a program to move the disks from the first tower to the last using stacks.
     */
    public static <T> void hanoi(int disk, Tower<T> fromTower, Tower<T> toTower, Tower<T> bufferTower){

        String logText = "move disk " + disk + " from tower " + fromTower.toString() + " to tower " + toTower.toString();

        if(disk == 1){
            System.out.println(logText);
            toTower.push(fromTower.pop());
        }else{
            hanoi(disk-1, fromTower, bufferTower, toTower);
            System.out.println(logText);
            toTower.push(fromTower.pop());
            hanoi(disk-1, bufferTower, toTower, fromTower);
        }
    }

    public static class Tower<T>{

        Stack<T> stack = new Stack<>();
        String name;

        Tower(String name){
            this.name = name;
        }

        void push(T value){
            stack.push(value);
        }

        T pop(){
            return stack.pop();
        }

        int size(){
            return stack.size();
        }

        void clear(){
            stack.clear();
        }

        @Override
        public String toString(){
            return name;
        }
    }
}
