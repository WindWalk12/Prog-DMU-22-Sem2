package Exercise1;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayStack implements Stack{
    private Object[] stackArray = new Object[5];

    @Override
    public void push(Object element) {
        if (size() < stackArray.length) {
            stackArray[size()] = element;
        } else {
            stackArray = Arrays.copyOf(stackArray, stackArray.length + 2);
            stackArray[size()] = element;
        }
    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            Object o = stackArray[size() - 1];
            stackArray[size() - 1] = null;
            return o;
        }
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            return stackArray[size() - 1];
        }
    }

    @Override
    public boolean isEmpty() {
        return size() < 1;
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
