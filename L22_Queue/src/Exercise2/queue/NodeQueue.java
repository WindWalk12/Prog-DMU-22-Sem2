package Exercise2.queue;

import java.util.NoSuchElementException;

/**
 * An implementation of a queue as a linked list.
 */
public class NodeQueue implements QueueI
{
    private Node head;
    private int size;
    public NodeQueue() {
        head = null;
    }

    @Override
    public void enqueue(Object element) {
        Node newNode = new Node();
        if (head == null) {
            newNode.data = element;
            head = newNode;
        } else if (size() == 1) {
            newNode.data = element;
            head.next = newNode;
        } else {
            Node tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            newNode.data = element;
            tempNode.next = newNode;
        }
        size++;
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            Node tempNode = head;
            head = head.next;
            size--;
            return tempNode.data;
        }
    }

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public boolean isEmpty()
    {
        return head == null;
    }

    private class Node {
        public Object data;
        public Node next;
    }
}
