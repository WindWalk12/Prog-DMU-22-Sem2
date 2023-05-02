package Exercise4;

import Exercise2.Stack;

import java.util.NoSuchElementException;

public class NodeStackDropOutDouble implements Stack {
    private Node first;
    private Node tail;
    private int maxSize;

    public NodeStackDropOutDouble(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public void push(Object element) {
        if (first == null) {
            Node newNode = new Node();
            newNode.data = element;
            first = newNode;
            tail = newNode;
        } else if (size() == maxSize) {
            Node newNode = new Node();
            newNode.data = element;
            newNode.next = first;
            first = newNode;
            tail = tail.previous;
            tail.next = null;
        } else {
            Node newNode = new Node();
            newNode.data = element;
            newNode.next = first;
            first.previous = newNode;
            first = newNode;
        }
    }

    @Override
    public Object pop() {
        if (first == null) {
            throw new NoSuchElementException();
        } else {
            Node tempNode = first;
            first = first.next;
            return tempNode.data;
        }
    }

    @Override
    public Object peek() {
        return first.data;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        int size = 0;
        Node tempNode = first;
        while (tempNode != null) {
            size++;
            tempNode = tempNode.next;
        }
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node tempNode = first;
        while (tempNode != null) {
            sb.append(tempNode.data);
            sb.append(" ");
            tempNode = tempNode.next;
        }
        return sb.toString();
    }

    private class Node {
        public Object data;
        public Node next;
        public Node previous;
    }
}
