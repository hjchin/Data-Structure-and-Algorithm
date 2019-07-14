package com.company.chapter3;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Q3_6Test {

    @Test(expected = NullPointerException.class)
    public void test(){
        Q3_6.AnimalShelter animalShelter = new Q3_6.AnimalShelter();
        animalShelter.enqueue(new Q3_6.Dog("dog1"));
        animalShelter.dequeueCat();
    }

    @Test(expected = NullPointerException.class)
    public void test2(){
        Q3_6.AnimalShelter animalShelter = new Q3_6.AnimalShelter();
        animalShelter.enqueue(new Q3_6.Cat("cat1"));
        animalShelter.dequeueDog();
    }

    @Test
    public void test3(){
        Q3_6.AnimalShelter animalShelter = new Q3_6.AnimalShelter();
        animalShelter.enqueue(new Q3_6.Cat("cat1"));
        animalShelter.enqueue(new Q3_6.Dog("dog1"));
        assertEquals("cat1",animalShelter.dequeueCat().name);
        assertEquals("dog1",animalShelter.dequeueAny().name);
        assertEquals(0,animalShelter.size());

        animalShelter.enqueue(new Q3_6.Cat("cat1"));
        animalShelter.enqueue(new Q3_6.Dog("dog1"));
        animalShelter.enqueue(new Q3_6.Cat("cat2"));
        animalShelter.enqueue(new Q3_6.Cat("cat3"));
        animalShelter.enqueue(new Q3_6.Dog("dog2"));
        animalShelter.enqueue(new Q3_6.Dog("dog3"));

        assertEquals(6,animalShelter.size());
        assertEquals("cat1",animalShelter.dequeueCat().name);
        assertEquals(5,animalShelter.size());
        assertEquals("cat2",animalShelter.dequeueCat().name);
        assertEquals("dog1",animalShelter.dequeueDog().name);
        assertEquals("cat3",animalShelter.dequeueAny().name);

    }
}