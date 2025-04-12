import Array.MyLinkedList;

// MyQueue class that implements a queue using MyLinkedList
public class MyQueue<E> {
    private final MyLinkedList<E> linkedList; // The linked list to store queue elements

    // Default constructor
    public MyQueue() {
        linkedList = new MyLinkedList<>(); // Initialize the linked list
    }

    /**
     * Adds an element to the end of the queue.
     * @param element the element to be added
     */
    public void enqueue(E element) {
        linkedList.add(element); // Add the element to the linked list
    }

    /**
     * Removes and returns the element at the front of the queue.
     * @return the element that was removed
     * @throws IllegalStateException if the queue is empty
     */
    public E dequeue() {
        if (linkedList.isEmpty()) {
            throw new IllegalStateException("Queue is empty :) "); // Check if the queue is empty
        }
        E element = linkedList.get(0); // Get the front element
        linkedList.remove(element); // Remove the front element
        return element; // Return the removed element
    }

    /**
     * Retrieves, but does not remove, the element at the front of the queue.
     * @return the element at the front of the queue
     * @throws IllegalStateException if the queue is empty
     */
    public E peek() {
        if (linkedList.isEmpty()) {
            throw new IllegalStateException("Queue is empty :) "); // Check if the queue is empty
        }
        return linkedList.get(0); // Return the front element without removing it
    }

    /**
     * Checks if the queue is empty.
     * @return true if the queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return linkedList.isEmpty(); // Delegate to the linked list's isEmpty method
    }

    /**
     * Returns the number of elements in the queue.
     * @return the size of the queue
     */
    public int size() {
        return linkedList.size(); // Delegate to the linked list's size method
    }
}

/* # MyQueue Implementation

## Overview
`MyQueue` is a generic implementation of a queue data structure using `MyLinkedList`. It provides methods for adding, removing, and accessing elements in a FIFO (First In, First Out) manner.

## Features
- Add elements to the end of the queue (`enqueue`)
- Remove elements from the front of the queue (`dequeue`)
- Peek at the front element without removing it
- Check if the queue is empty
- Get the size of the queue

## Usage
```java
MyQueue<String> queue = new MyQueue<>();
queue.enqueue("A");
queue.enqueue("B");
String frontElement = queue.peek(); // Returns "A"
String removedElement = queue.dequeue(); // Removes "A"

*/