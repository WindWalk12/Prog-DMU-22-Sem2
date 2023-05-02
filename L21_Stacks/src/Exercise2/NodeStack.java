package Exercise2;

import java.util.NoSuchElementException;

public class NodeStack implements Stack{
    private Node first;

    @Override
    public void push(Object element) {
        if (first == null) {
            Node newNode = new Node();
            newNode.data = element;
            first = newNode;
        } else {
            Node newNode = new Node();
            newNode.data = element;
            newNode.next = first;
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

    private class Node {
        public Object data;
        public Node next;
    }
}
