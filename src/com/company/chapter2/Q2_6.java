package com.company.chapter2;

import java.util.Stack;

public class Q2_6 {

    /*
    Palindrome: Implement a function to check if a linked list is a palindrome.
     */
    public static boolean checkPalindrome(LinkedList list) {

        Stack<Node> stack = new Stack<>();

        Node cNode = list.head;
        while (cNode != null) {
            stack.push(cNode);
            cNode = cNode.next;
        }

        cNode = list.head;
        while (cNode != null) {
            if (stack.pop().value != cNode.value) {
                return false;
            }
            cNode = cNode.next;
        }

        return true;
    }
}
