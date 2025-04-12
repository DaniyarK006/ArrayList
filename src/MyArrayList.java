import java.util.Arrays; // Import Arrays for array operations

class MyArrayList<E> {
    private Object[] elements; // Array to hold the elements
    private int size; // Current size of the list
    public static final int DEFAULT_CAPACITY = 10; // Default capacity of the list

    // Constructor to initialize the array with default capacity
    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    // Method to add an element at the end of the list
    public void add(E element) {
        ensureCapacity(); // Ensure there is enough capacity
        elements[size++] = element; // Add the element and increment size
    }

    // Method to add an element at the beginning of the list
    public void addFirst(E element) {
        if (size == 0) {
            add(element); // If the list is empty, just add the element
        } else {
            ensureCapacity(); // Ensure there is enough capacity
            System.arraycopy(elements, 0, elements, 1, size); // Shift elements
            elements[0] = element; // Add the new first element
            size++;
        }
    }

    // Method to add an element at a specific index
    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        ensureCapacity(); // Ensure there is enough capacity
        System.arraycopy(elements, index, elements, index + 1, size - index); // Shift elements
        elements[index] = element; // Add the new element
        size++;
    }

    // Method to get an element at a specific index
    public E get(int index) {
        checkIndex(index); // Check if index is valid
        E element = (E) elements[index];
        return element; // Return the element at the index
    }

    // Method to remove the last element from the list
    public void removeLast() {
        if (size > 0) {
            elements[--size] = null; // Avoid memory leak
        }
    }

    // Method to return the current size of the list
    public int size() {
        return size; // Return the size of the list
    }

    // Method to ensure there is enough capacity in the array
    private void ensureCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2); // Double the capacity
        }
    }

    // Method to check if an index is valid
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    // Method to check if the list is empty
    public boolean isEmpty() {
        return size == 0; // Return true if size is 0
    }

    // Main method for testing
    public static void main(String[] args) {
        MyArrayList<String> arrayList = new MyArrayList<>();

        arrayList.add("5");
        arrayList.add("10");
        arrayList.addFirst("1");
        arrayList.add(1, "3");

        System.out.println("MyArrayList - Size: " + arrayList.size()); // Expected: 4
        System.out.println("Element at index 2: " + arrayList.get(2)); // Expected: 10
        arrayList.removeLast();
        System.out.println("After removeLast(), Size: " + arrayList.size()); // Expected: 3
    }
}

/*

# MyArrayList Implementation

## Overview
MyArrayList is a custom implementation of a dynamic array list in Java. It allows for the storage of elements, dynamic resizing, and basic list operations.

        ## Features
- Add elements to the end, beginning, or at a specific index
- Remove the last element
- Retrieve elements by index
- Check the size and whether the list is empty

## Usage
```java
MyArrayList<String> arrayList = new MyArrayList<>();
arrayList.add("Hello");
arrayList.addFirst("World");
String firstElement = arrayList.get(0); // Returns "World"

*/














