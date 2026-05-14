package com.interview.daily;

import java.util.LinkedList;

/**
 * Interview Question:
 * What is the difference between `LinkedList` and `ArrayList`?
 *
 * Explanation:
 * - `LinkedList`: Doubly linked list. Fast insertion/deletion at both ends.
 * - `ArrayList`: Dynamic array. Fast random access. Slow insertion/deletion in the middle.
 */

abstract class Animal {
    private int order;
    protected String name;

    public Animal(String n) {
        name = n;
    }

    public void setOrder(int ord) {
        order = ord;
    }

    public int getOrder() {
        return order;
    }

    public boolean isOlderThan(Animal a) {
        return this.order < a.getOrder();
    }
}

class Dog extends Animal {
    public Dog(String n) {
        super(n);
    }
}

class Cat extends Animal {
    public Cat(String n) {
        super(n);
    }
}

public class Day49AnimalShelter {

    /**
     * Problem Description:
     * An animal shelter, which holds only dogs and cats, operates on a strictly "first in, first out" basis.
     * People must adopt either the "oldest" (based on arrival time) of all animals at the shelter,
     * or they can select whether they would prefer a dog or a cat (and will receive the oldest animal of that type).
     * They cannot select which specific animal they would like.
     * Create the data structures to maintain this system and implement operations such as enqueue, dequeueAny, dequeueDog, and dequeueCat.
     *
     * Example:
     * AnimalQueue queue = new AnimalQueue();
     * queue.enqueue(new Dog("Rex"));
     * queue.enqueue(new Cat("Whiskers"));
     * queue.dequeueAny(); // returns Rex
     * queue.dequeueCat(); // returns Whiskers
     */

    static class AnimalQueue {
        LinkedList<Dog> dogs = new LinkedList<>();
        LinkedList<Cat> cats = new LinkedList<>();
        private int order = 0; // Timestamp

        public void enqueue(Animal a) {
            // TODO: Implement this method
        }

        public Animal dequeueAny() {
            // TODO: Implement this method
            return null;
        }

        public Dog dequeueDog() {
            // TODO: Implement this method
            return null;
        }

        public Cat dequeueCat() {
            // TODO: Implement this method
            return null;
        }
    }

    public static void main(String[] args) {
        AnimalQueue queue = new AnimalQueue();
        queue.enqueue(new Dog("Rex"));
        queue.enqueue(new Cat("Whiskers"));
        queue.enqueue(new Dog("Buddy"));

        System.out.println("Dequeued Any: " + queue.dequeueAny().name);
        System.out.println("Dequeued Cat: " + queue.dequeueCat().name);
        System.out.println("Dequeued Dog: " + queue.dequeueDog().name);

        // Expected Output:
        // Dequeued Any: Rex
        // Dequeued Cat: Whiskers
        // Dequeued Dog: Buddy
    }
}

/*
// Solution Implementation

public void enqueue(Animal a) {
    a.setOrder(order);
    order++;
    if (a instanceof Dog) {
        dogs.addLast((Dog) a);
    } else if (a instanceof Cat) {
        cats.addLast((Cat) a);
    }
}

public Animal dequeueAny() {
    if (dogs.isEmpty()) {
        return dequeueCat();
    } else if (cats.isEmpty()) {
        return dequeueDog();
    }

    Dog dog = dogs.peek();
    Cat cat = cats.peek();

    if (dog.isOlderThan(cat)) {
        return dequeueDog();
    } else {
        return dequeueCat();
    }
}

public Dog dequeueDog() {
    return dogs.poll();
}

public Cat dequeueCat() {
    return cats.poll();
}
*/
