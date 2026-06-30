package com.interview.daily

import java.util.LinkedList

/**
 * Interview Question:
 * What is the difference between `LinkedList` and `ArrayList`?
 *
 * Explanation:
 * - `LinkedList`: Doubly linked list. Fast insertion/deletion at both ends.
 * - `ArrayList`: Dynamic array. Fast random access. Slow insertion/deletion in the middle.
 */

abstract class Animal(protected val name: String) {
    private var order: Int = 0

    fun setOrder(ord: Int) {
        order = ord
    }

    fun getOrder(): Int = order

    fun isOlderThan(a: Animal): Boolean = this.order < a.getOrder()
}

class Dog(name: String) : Animal(name)

class Cat(name: String) : Animal(name)

/**
 * Problem Description:
 * An animal shelter, which holds only dogs and cats, operates on a strictly "first in, first out" basis.
 * People must adopt either the "oldest" (based on arrival time) of all animals at the shelter,
 * or they can select whether they would prefer a dog or a cat (and will receive the oldest animal of that type).
 * They cannot select which specific animal they would like.
 * Create the data structures to maintain this system and implement operations such as enqueue, dequeueAny, dequeueDog, and dequeueCat.
 *
 * Example:
 * val queue = AnimalQueue()
 * queue.enqueue(Dog("Rex"))
 * queue.enqueue(Cat("Whiskers"))
 * queue.dequeueAny() // returns Rex
 * queue.dequeueCat() // returns Whiskers
 */

class AnimalQueue {
    val dogs: LinkedList<Dog> = LinkedList()
    val cats: LinkedList<Cat> = LinkedList()
    private var order: Int = 0

    fun enqueue(a: Animal) {
        TODO("Implement this method")
    }

    fun dequeueAny(): Animal? {
        TODO("Implement this method")
    }

    fun dequeueDog(): Dog? {
        TODO("Implement this method")
    }

    fun dequeueCat(): Cat? {
        TODO("Implement this method")
    }
}

fun main() {
    val queue = AnimalQueue()
    queue.enqueue(Dog("Rex"))
    queue.enqueue(Cat("Whiskers"))
    queue.enqueue(Dog("Buddy"))

    println("Dequeued Any: " + queue.dequeueAny()?.name)
    println("Dequeued Cat: " + queue.dequeueCat()?.name)
    println("Dequeued Dog: " + queue.dequeueDog()?.name)

    // Expected Output:
    // Dequeued Any: Rex
    // Dequeued Cat: Whiskers
    // Dequeued Dog: Buddy
}

/*
// Solution Implementation

fun enqueue(a: Animal) {
    a.setOrder(order)
    order++
    when (a) {
        is Dog -> dogs.addLast(a)
        is Cat -> cats.addLast(a)
    }
}

fun dequeueAny(): Animal? {
    if (dogs.isEmpty()) return dequeueCat()
    if (cats.isEmpty()) return dequeueDog()

    val dog = dogs.peek()
    val cat = cats.peek()

    return if (dog != null && cat != null && dog.isOlderThan(cat)) {
        dequeueDog()
    } else {
        dequeueCat()
    }
}

fun dequeueDog(): Dog? = dogs.poll()

fun dequeueCat(): Cat? = cats.poll()
*/
