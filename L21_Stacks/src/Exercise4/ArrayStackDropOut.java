package Exercise4;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayStackDropOut implements Stack {
    private Object[] stackArray = new Object[5];
    private int top = 0;

    @Override
    public void push(Object element) {
        if (top < stackArray.length) {
            stackArray[top] = element;
            top++;
        } else {
            top = 0;
            stackArray[top] = element;
            top++;
        }
    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            Object o = stackArray[top - 1];
            stackArray[top - 1] = null;
            top--;
            return o;
        }
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            return stackArray[top - 1];
        }
    }

    @Override
    public boolean isEmpty() {
        return size() < 0;
    }

    @Override
    public int size() {
        int size = 0;
        for (Object o : stackArray) {
            if (o != null) {
                size++;
            }
        }
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(stackArray);
    }
}
