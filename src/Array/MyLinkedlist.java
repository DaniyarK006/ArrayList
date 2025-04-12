package Array;

import java.util.Iterator;

// MyLinkedList class that extends MyLinkedList
public class MyLinkedlist<E> extends MyLinkedList<E> {

    // Default constructor
    public MyLinkedlist() {
        super(); // Call the constructor of the parent class
    }

    // Method to print all elements in the linked list
    public void printList() {
        Iterator<E> iterator = this.iterator();
        System.out.print("Elements in MyLinkedlist: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " "); // Print each element
        }
        System.out.println(); // New line after printing all elements
    }
}

/* # MyLinkedList Implementation

## Overview
`MyLinkedList` is an extension of the `MyLinkedList` class, providing additional functionality to print all elements in the linked list.

## Features
- Inherits all functionalities of `MyLinkedList`
- Method to print all elements in the linked list

## Usage
```java
MyLinkedList<String> linkedList = new MyLinkedList<>();
linkedList.add("A");
linkedList.add("B");
linkedList.printList(); // Outputs: Elements in MyLinkedList: A B

*/