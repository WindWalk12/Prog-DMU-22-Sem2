package Exercise3;

import java.util.NoSuchElementException;
import java.util.Random;

public class CircularCannibalMeal {
    private Node head;
    private int size = 0;
    private int index = 0;

    public CircularCannibalMeal() {
    }

    // Adds person to the cannibal dance meal
    public void addPerson(Person p) {
        Node newNode = new Node();
        newNode.data = p;
        if (head == null) {
            head = newNode;
        } else if (size() == 1) {
            head.next = newNode;
        } else {
            Node tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
        size++;
    }

    // Removes random person from the cannibal dance
    public Person eatRandomPerson() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Random rand = new Random();
        index = rand.nextInt(size);
        Node tempNode = head;
        Node prevNode = tempNode;
        for (int i = 0; i < index; i++) {
            prevNode = tempNode;
            tempNode = tempNode.next;
        }
        if (index == 0) {
            head = head.next;
        } else {
            prevNode.next = tempNode.next;
        }
        size--;
        return tempNode.data;
    }

    // Removes person "count" places from the last eaten
    public Person eatNextPerson(int count) {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Node tempNode = head;
        Node prevNode = tempNode;
        for (int i = 0; i < index; i++) {
            tempNode = tempNode.next;
        }
        for (int i = 0; i < count; i++) {
            if (index >= size() - 1) {
                index = 0;
                tempNode = head;
            } else {
                prevNode = tempNode;
                tempNode = tempNode.next;
                index++;
            }
        }
        if (index == 0) {
            head = head.next;
        } else {
            prevNode.next = tempNode.next;
        }
        size--;
        return tempNode.data;
    }

    // Prints all persons waiting to be served
    public void printPersons() {
        if (head == null) {
            System.out.println("No people dancing");
        } else {
            Node tempNode = head;
            while (tempNode != null) {
                System.out.print(tempNode.data.getName() + " ");
                tempNode = tempNode.next;
            }
            System.out.println();
        }
    }

    public void danceMacabre() {
        System.out.println("Let the dance begin!");
        eatRandomPerson();
        while (!isEmpty()) {
            eatNextPerson(5);
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean contains(Person p) {
        Node tempNode = head;
        while (tempNode != null) {
            if (tempNode.data.equals(p)) {
                return true;
            }
            tempNode = tempNode.next;
        }
        return false;
    }

    private class Node {
        public Person data;
        public Node next;
    }
}
