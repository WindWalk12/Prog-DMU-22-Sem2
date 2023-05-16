package Exercise2;

import java.util.NoSuchElementException;

public class LinkedList<E> implements Bag<E>{
    public Node first;
    public int maxCapacity;

    public LinkedList(int maxCapacity) {
        first = null;
        this.maxCapacity = maxCapacity;
    }

    @Override
    public int getCurrentSize() {
        int size = 0;
        Node indexNode = first;
        while (indexNode != null) {
            size++;
            indexNode = indexNode.next;
        }
        return size;
    }

    @Override
    public boolean isFull() {
        return getCurrentSize() == maxCapacity;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public boolean add(E newEntry) {
        Node newNode = new Node();
        newNode.data = newEntry;
        if (isFull()) {
            System.out.println("List is full");
            return false;
        } else if (first == null) {
            first = newNode;
            return true;
        } else {
            Node indexNode = first;
            while (indexNode.next != null) {
                indexNode = indexNode.next;
            }
            indexNode.next = newNode;
            return true;
        }
    }

    @Override
    public E remove() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else if (getCurrentSize() == 1) {
            E nodeData = first.data;
            first = null;
            return nodeData;
        } else {
            Node indexNode = first;
            while (indexNode.next.next != null) {
                indexNode = indexNode.next;
            }
            E nodeData = indexNode.next.data;
            indexNode.next = null;
            return nodeData;
        }
    }

    @Override
    public boolean remove(E anEntry) {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            Node indexNode = first;
            while (indexNode.next != null) {
                if (indexNode.next.data == anEntry) {
                    if (indexNode.next.next != null) {
                        indexNode.next = indexNode.next.next;
                    } else {
                        indexNode.next = null;
                    }
                    return true;
                }
                indexNode = indexNode.next;
            }
            return false;
        }
    }

    @Override
    public void clear() {
        first = null;
    }

    @Override
    public int getFrequencyOf(E anEntry) {
        int frequency = 0;
        Node indexNode = first;
        while (indexNode != null) {
            if (indexNode.data == anEntry) {
                frequency++;
            }
            indexNode = indexNode.next;
        }
        return frequency;
    }

    @Override
    public boolean contains(E anEntry) {
        Node indexNode = first;
        while (indexNode != null) {
            if (indexNode.data == anEntry) {
                return true;
            }
            indexNode = indexNode.next;
        }
        return false;
    }

    @Override
    public E[] toArray() {
        E[] newArray = (E[]) new Object[getCurrentSize()];
        int index = 0;
        Node indexNode = first;
        while (indexNode != null) {
            newArray[index] = indexNode.data;
            indexNode = indexNode.next;
        }
        return newArray;
    }

    private class Node {
        public  E data;
        public Node next;
    }
}
