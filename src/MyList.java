import java.util.Iterator;

// MyList interface for a generic list structure
public interface MyList<E> {

    /**
     * Adds an element to the list.
     * @param element the element to be added
     */
    void add(E element);

    /**
     * Removes an element from the list.
     * @param element the element to be removed
     */
    void remove(E element);

    /**
     * Retrieves an element at a given index.
     * @param index the index of the element to retrieve
     * @return the element at the specified index
     */
    E get(int index);

    /**
     * Returns the number of elements in the list.
     * @return the size of the list
     */
    int size();

    /**
     * Checks if the list is empty.
     * @return true if the list is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Removes all elements from the list.
     */
    void clear();

    /**
     * Returns an iterator to traverse through the elements of the list.
     * @return an iterator for the list
     */
    Iterator<E> iterator();
}
