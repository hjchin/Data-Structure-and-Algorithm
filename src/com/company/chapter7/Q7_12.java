package com.company.chapter7;

import com.company.chapter2.LinkedList;

import java.util.ArrayList;

public class Q7_12 {


    static class HashTable<K, T>{

        private static class LinkedNode<K, T>{
            Entry<K, T> entry;
            LinkedNode<K, T> next;

            LinkedNode(Entry<K,T> entry){
                this.entry = entry;
            }
        }

        private static class Entry<K, T>{
            K key;
            T value;

            K getKey(){
                return key;
            }

            T getValue(){
                return value;
            }

            Entry(K key, T value){
                this.key = key;
                this.value = value;
            }
        }

        int size = 100;
        ArrayList<LinkedNode<K, T>> hashTable = new ArrayList<>(size);

        private int getHashKey(K key){
            return key.hashCode()%size;
        }

        private void insert(int hashTableIndex, Entry<K,T> entry){
            LinkedNode node = hashTable.get(hashTableIndex);
            if(node == null){
                LinkedNode<K, T> newNode = new LinkedNode<>(entry);
                hashTable.set(hashTableIndex, newNode);
                return;
            }

            LinkedNode pointer = node;
            while(node.next != null){
                pointer = node.next;
            }
            pointer.next = new LinkedNode<K, T>(entry);
        }

        private Entry<K,T> retrieve(int hashTableIndex, K key){
            LinkedNode<K,T> linkedNode = hashTable.get(hashTableIndex);

            while(linkedNode != null){
                if(linkedNode.entry.key == key){
                    return linkedNode.entry;
                }
                linkedNode = linkedNode.next;
            }

            return null;
        }

        void put(K key, T value){
            int index = getHashKey(key);
            insert(index, new Entry<K,T>(key, value));
        }

        Entry<K,T> get(K key){
            int index = getHashKey(key);
            return retrieve(index, key);
        }

        K[] getKeys(){
            //To be implemented
            return null;
        }

        T[] getValues(){
            //To be implemented
            return null;
        }
    }


}
