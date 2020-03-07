package com.company.chapter10;

/*
    Sparse Search: Given a sorted array of strings that is interspersed with empty strings, write a
    method to find the location of a given string.
    EXAMPLE
    Input: ball, {"at","","","","ball","car","","","dad","",""}
    Output: 4

 */
public class Q10_5 {

    public static int search(String[] strings, String search){
        return search(strings, search, 0, strings.length-1, 0);
    }

    public static int search(String[] strings, String search, int start, int end, int direction){

        if(start<0 || end > strings.length-1){
            return -1;
        }

        int mid = (start+end)/2;

        if(strings[mid].equals("") && direction > 0){
            return search(strings, search, mid+1, end, 1);
        }

        if(strings[mid].equals("") && direction < 0){
            return search(strings, search, start, mid-1, 0);
        }

        if(strings[mid].equals("") && direction == 0){
            int d = getDirection(strings, search, mid);
            int s,e;
            if(d > 0){
                s = mid+1;
                e = end;
            }else{
                s = start;
                e = mid-1;
            }
            return search(strings, search, s, e, d);
        }

        if(strings[mid].compareTo(search) > 0){
            if((mid+1+end)/2  == mid) return -1;
            return search(strings, search, start, mid-1, direction);
        }else if(strings[mid].compareTo(search) < 0){
            if((start+mid-1)/2  == mid) return -1;
            return search(strings, search, mid+1, end, direction);
        }else{
            return mid;
        }
    }

    public static int getDirection(String[] strings, String search, int currentIndex){

        int rightIndex = currentIndex;
        while(!strings[rightIndex].equals("") && rightIndex < strings.length){
            rightIndex++;
        }

        if(strings[rightIndex].compareTo(search) >= 0){
            return 1;
        }

        return -1;
    }
}
