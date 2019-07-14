package com.company.chapter3;

import java.util.LinkedList;

public class Q3_6 {

    public static class AnimalShelter{

        private LinkedList<Animal> list = new LinkedList<>();

        public void enqueue(Animal animal){
            list.add(animal);
        }

        public Animal dequeueAny(){
            return list.removeFirst();
        }

        public int size(){
            return list.size();
        }

        public Dog dequeueDog(){

            Dog dequeueDog = null;

            for(Animal animal: list){
                if(animal instanceof Dog){
                    dequeueDog = (Dog)animal;
                    break;
                }
            }

            if(dequeueDog == null){
                throw new NullPointerException("");
            }

            list.remove(dequeueDog);
            return dequeueDog;
        }

        public Cat dequeueCat(){
            Cat dequeueCat = null;

            for(Animal animal: list){
                if(animal instanceof Cat){
                    dequeueCat = (Cat)animal;
                    break;
                }
            }

            if(dequeueCat == null){
                throw new NullPointerException("");
            }

            list.remove(dequeueCat);
            return dequeueCat;
        }

        private <T> T dequeueAnimal(T animalType){

            T dequeueAnimal = null;
            for(Animal animal: list){
                if(animal.getClass().getName().equals(animalType.toString())){
                    dequeueAnimal = (T)animal;
                    break;
                }
            }

            if(dequeueAnimal == null){
                throw new NullPointerException("");
            }

            list.remove(dequeueAnimal);
            return dequeueAnimal;
        }
    }

    static abstract class Animal{
        String name;
        Animal(String name){
            this.name = name;
        }
    }

    public static class Dog extends Animal{
        public Dog(String name){
            super(name);
        }
    }

    public static class Cat extends Animal{
        public Cat(String name){
            super(name);
        }
    }
}
