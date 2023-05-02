package Exercise4;

public interface Stack {

    /** Adds one element to the top of this stack. */
    void push(Object element);
    /** Removes and returns the top element from this stack. */
    Object pop();
    /** Returns without removing the top element of this stack. */
    Object peek();
    /** Returns true if this stack contains no elements. */
    boolean isEmpty();
    /** Returns the number of elements in this stack. */
    int size();
    /** Returns a string representation of this stack. */
    @Override
    String toString();
}
