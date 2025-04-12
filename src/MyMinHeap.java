public class MyMinHeap<E extends Comparable<E>> {
    private final MyArrayList<E> arrayList; // Internal array list to store heap elements

    // Constructor to initialize the min-heap
    public MyMinHeap() {
        arrayList = new MyArrayList<>(); // Initialize MyArrayList
    }

    /**
     * Inserts an element into the heap.
     * @param element the element to be inserted
     */
    public void insert(E element) {
        arrayList.add(element); // Add the element to the end of the array list
        bubbleUp(arrayList.size() - 1); // Restore heap property
    }

    /**
     * Removes and returns the minimum element from the heap.
     * @return the minimum element
     * @throws IllegalStateException if the heap is empty
     */
    public E removeMin() {
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("Heap is empty :) "); // Check if the heap is empty
        }
        E min = arrayList.get(0); // Get the minimum element
        arrayList.set(0, arrayList.get(arrayList.size() - 1)); // Move the last element to the root
        arrayList.remove(arrayList.size() - 1); // Remove the last element
        bubbleDown(0); // Restore heap property
        return min; // Return the minimum element
    }

    /**
     * Retrieves the minimum element without removing it.
     * @return the minimum element
     * @throws IllegalStateException if the heap is empty
     */
    public E getMin() {
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("Heap is empty :) "); // Check if the heap is empty
        }
        return arrayList.get(0); // Return the minimum element
    }

    // Restores the heap property by moving the element at the given index up
    private void bubbleUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (arrayList.get(index).compareTo(arrayList.get(parentIndex)) < 0) {
                swap(index, parentIndex); // Swap if the current element is smaller than its parent
                index = parentIndex; // Move up to the parent's index
            } else {
                break; // Heap property is satisfied
            }
        }
    }

    // Restores the heap property by moving the element at the given index down
    private void bubbleDown(int index) {
        int lastIndex = arrayList.size() - 1;
        while (index <= lastIndex) {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = 2 * index + 2;
            int smallestIndex = index;

            // Check if left child exists and is smaller than the current smallest
            if (leftChildIndex <= lastIndex && arrayList.get(leftChildIndex).compareTo(arrayList.get(smallestIndex)) < 0) {
                smallestIndex = leftChildIndex;
            }
            // Check if right child exists and is smaller than the current smallest
            if (rightChildIndex <= lastIndex && arrayList.get(rightChildIndex).compareTo(arrayList.get(smallestIndex)) < 0) {
                smallestIndex = rightChildIndex;
            }
            // If the smallest index is still the current index, the heap property is satisfied
            if (smallestIndex == index) {
                break;
            }
            swap(index, smallestIndex); // Swap with the smallest child
            index = smallestIndex; // Move down to the smallest child's index
        }
    }

    // Swaps two elements in the array list
    private void swap(int index1, int index2) {
        E temp = arrayList.get(index1); // Temporary storage for the first element
        arrayList.set(index1, arrayList.get(index2)); // Set the first index to the second element
        arrayList.set(index2, temp); // Set the second index to the temporary value
    }
}


/* # MyMinHeap Implementation

## Overview
`MyMinHeap` is a generic implementation of a minimum heap data structure using `MyArrayList`. It provides methods for inserting elements, removing the minimum element, and retrieving the minimum element efficiently.

        ## Features
- Insert elements into the heap (`insert`)
- Remove the minimum element from the heap (`removeMin`)
- Retrieve the minimum element without removing it (`getMin`)

## Usage
```java
MyMinHeap<Integer> minHeap = new MyMinHeap<>();
minHeap.insert(10);
minHeap.insert(5);
minHeap.insert(20);
int minElement = minHeap.getMin(); // Returns 5
int removedElement = minHeap.removeMin(); // Removes 5

*/
 */