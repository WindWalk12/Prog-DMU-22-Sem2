package Exercise2.deque;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class CircularArrayDeque implements DequeI{

    private Object[] elements;
    private int currentSize;
    private int head;
    private int tail;

    public CircularArrayDeque(int size) {
        elements = new Object[size];
        currentSize = 0;
        head = 0;
        tail = 0;
    }

    @Override
    public void addFirst(Object element) {
        growIfNecessary();
        currentSize++;
        head = ((head - 1) % elements.length + elements.length) % elements.length;
        elements[head] = element;
    }

    @Override
    public void addLast(Object element) {
        growIfNecessary();
        currentSize++;
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
    }

    @Override
    public Object removeFirst() {
        if (currentSize == 0)
        {
            throw new NoSuchElementException();
        }
        Object removed = elements[head];
        head = (head + 1) % elements.length;
        currentSize--;
        return removed;
    }

    @Override
    public Object removeLast() {
        if (currentSize == 0)
        {
            throw new NoSuchElementException();
        }
        Object removed = elements[tail - 1];
        tail = (tail - 1) % elements.length;
        currentSize--;
        return removed;
    }

    @Override
    public Object getFirst() {
        return elements[head];
    }

    @Override
    public Object getLast() {
        return elements[tail];
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        return currentSize < 1;
    }

    private void growIfNecessary() {
        if (currentSize == elements.length)
        {
            Object[] newElements = new Object[2 * elements.length];
            for (int i = 0; i < elements.length; i++)
            {
                newElements[i] = elements[(head + i) % elements.length];
            }
            elements = newElements;
            head = 0;
            tail = currentSize;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
