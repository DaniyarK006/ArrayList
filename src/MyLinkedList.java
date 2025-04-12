import java.util.Iterator;

public class MyLinkedList<E> implements MyList<E> {
    private MyNode head; // Head of the list
    private MyNode tail; // Tail of the list
    private int size; // Current size of the list

    // Node class representing each element in the linked list
    private class MyNode {
        E element; // The element stored in the node
        MyNode next; // Reference to the next node
        MyNode prev; // Reference to the previous node

        MyNode(E element) {
            this.element = element; // Initialize the element
        }
    }

    // Constructor to initialize the linked list
    public MyLinkedList() {
        head = null; // Initialize head
        tail = null; // Initialize tail
        size = 0; // Initialize size
    }

    // Method to add an element at the end of the list
    @Override
    public void add(E element) {
        MyNode newNode = new MyNode(element); // Create a new node
        if (isEmpty()) {
            head = tail = newNode; // If the list is empty, set head and tail to the new node
        } else {
            tail.next = newNode; // Link the current tail to the new node
            newNode.prev = tail; // Link the new node back to the current tail
            tail = newNode; // Update the tail to the new node
        }
        size++; // Increment the size of the list
    }

    // Method to add an element at the beginning of the list
    public void addFirst(E element) {
        MyNode newNode = new MyNode(element); // Create a new node
        if (isEmpty()) {
            head = tail = newNode; // If the list is empty, set head and tail to the new node
        } else {
            newNode.next = head; // Link the new node to the current head
            head.prev = newNode; // Link the current head back to the new node
            head = newNode; // Update head to the new node
        }
        size++; // Increment the size of the list
    }

    // Method to remove a specific element from the list
    @Override
    public void remove(E element) {
        MyNode current = head; // Start from the head
        while (current != null) {
            if (current.element.equals(element)) { // Check if the current node contains the element
                if (current.prev != null) {
                    current.prev.next = current.next; // Bypass the current node
                } else {
                    head = current.next; // Update head if needed
                }
                if (current.next != null) {
                    current.next.prev = current.prev; // Bypass the current node
                } else {
                    tail = current.prev; // Update tail if needed
                }
                size--; // Decrement the size
                return; // Element found and removed
            }
            current = current.next; // Move to the next node
        }
    }

    // Method to retrieve an element by index
    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size); // Check index bounds
        }
        MyNode current = head; // Start from the head
        for (int i = 0; i < index; i++) {
            current = current.next; // Move to the specified index
        }
        return current.element; // Return the element at the index
    }

    // Method to return the current size of the list
    @Override
    public int size() {
        return size; // Return the size
    }

    // Method to check if the list is empty
    @Override
    public boolean isEmpty() {
        return size == 0; // Return true if size is 0
    }

    // Method to clear the list
    @Override
    public void clear() {
        head = tail = null; // Clear head and tail
        size = 0; // Reset size
    }

    // Method to return an iterator for the list
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private MyNode currentNode = head; // Start from the head

            @Override
            public boolean hasNext() {
                return currentNode != null; // Return true if there is a next node
            }

            @Override
            public E next() {
                E element = currentNode.element; // Get the current element
                currentNode = currentNode.next; // Move to the next node
                return element; // Return the element
            }
        };
    }
}

/* # MyLinkedList Implementation

## Overview
MyLinkedList is a custom implementation of a doubly linked list in Java. It allows for the storage of elements, dynamic resizing, and basic list operations.

## Features
- Add elements to the end or beginning of the list
- Remove specific elements
- Retrieve elements by index
- Check the size and whether the list is empty
- Clear the list
- Iterator support for traversing the list

## Usage
```java
MyLinkedList<String> linkedList = new MyLinkedList<>();
linkedList.add("A");
linkedList.addFirst("B");
String firstElement = linkedList.get(0); // Returns "B"

*/