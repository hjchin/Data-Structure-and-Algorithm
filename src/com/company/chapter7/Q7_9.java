package com.company.chapter7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Q7_9 {

    /*
    Circular Array: Implement a CircularArray class that supports an array-like data structure which
    can be efficiently rotated. If possible, the class should use a generic type (also called a template), and
    should support iteration via the standard f or (Obj o : circularArray) notation.
     */

    public static class CircularArray<T> implements Iterable<T>{

        ArrayList<T> storage;

        CircularArray(int size){
            storage = new ArrayList<>(size);
        }

        T get(int index){

            int newIndex = getNewIndex(index);
            return storage.get(newIndex);
        }

        public void set(int index, T object){
            int newIndex = getNewIndex(index);
            storage.set(newIndex, object);
        }

        private int getNewIndex(int index){
            int newIndex = index;
            if(index>storage.size()-1){
                newIndex = index%storage.size();
            }
            return newIndex;
        }


        @Override
        public Iterator<T> iterator() {
            return new CircularArrayIterator<T>(this);
        }

        private class CircularArrayIterator<K> implements Iterator<K>{

            private CircularArray<K> array;
            private int counter = 0;

            CircularArrayIterator(CircularArray array){
                this.array = array;
            }

            @Override
            public boolean hasNext() {
                return counter < array.storage.size();
            }

            @Override
            public K next() {
                K o = array.storage.get(counter);
                counter++;
                return o;
            }
        }
    }
}
