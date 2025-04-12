public class MyStack<E> {
    private final MyArrayList<E> arrayList; // Declare an instance of MyArrayList

    // Constructor to initialize the stack
    public MyStack() {
        arrayList = new MyArrayList<>(); // Initialize MyArrayList
    }

    // Method to add an element to the top of the stack
    public void push(E element) {
        arrayList.add(element); // Add element to the stack
    }

    // Method to remove and return the top element of the stack
    public E pop() {
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("Stack is empty"); // Handle error if stack is empty
        }
        E element = arrayList.get(arrayList.size() - 1); // Get the top element
        arrayList.removeLast(elements); // Remove the top element
        return element; // Return the removed element
    }

    // Method to return the top element without removing it
    public E peek() {
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("Stack is empty"); // Handle error if stack is empty
        }
        return arrayList.get(arrayList.size() - 1); // Return the top element
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return arrayList.isEmpty(); // Check if the stack is empty
    }

    // Method to return the number of elements in the stack
    public int size() {
        return arrayList.size(); // Return the size of the stack
    }
}

/* # MyStack Implementation

## Overview
`MyStack` is a generic implementation of a stack data structure using `MyArrayList`. It provides methods for adding, removing, and accessing elements in a LIFO (Last In, First Out) manner.

## Features
- Add elements to the top of the stack (`push`)
- Remove the top element from the stack (`pop`)
- Peek at the top element without removing it (`peek`)
- Check if the stack is empty
- Get the size of the stack

## Usage
```java
MyStack<Integer> stack = new MyStack<>();
stack.push(10);
stack.push(20);
int topElement = stack.peek(); // Returns 20
int removedElement = stack.pop(); // Removes 20

*/