package Exercise3;

import Exercise2.SortedLinkedList;

import java.util.NoSuchElementException;

public class SortedLinkedListDouble {
    private Node first;
	private Node last;
	private int size;

	public SortedLinkedListDouble() {
		first = new Node();
		last = new Node();
		first.next = last;
		last.prev = first;
		size = 0;
	}

	/**
	 * Tilføjer e til listen, så listen fortsat er sorteret i henhold til den
	 * naturlige ordning på elementerne
	 */
	public void addElement(String e) {
        if (size == 0) {
            Node newNode = new Node();
            newNode.data = e;
            newNode.next = last;
            newNode.prev = first;
            first.next = newNode;
            last.prev = newNode;
        } else if (e.compareTo(first.next.data) < 0) {
            Node newNode = new Node();
            newNode.data = e;
            newNode.next = first.next;
            newNode.prev = first;
			first.next.prev = newNode;
            first.next = newNode;
        } else {
            Node previous = first;
            Node next = first.next;
			boolean found = false;
			while (!found && !next.equals(last)) {
				if (next.data.compareTo(e) > 0) {
					found = true;
				} else {
					previous = previous.next;
                    next = previous.next;
				}
			}
                Node newNode = new Node();
                newNode.data = e;
                newNode.next = next;
				newNode.prev = previous;
                next.prev = newNode;
				previous.next = newNode;
        }
        size++;
    }

	/**
	 * Fjerner den første forekomst af e i listen. Listen skal fortsat være
	 * sorteret i henhold til den naturlige ordning på elementerne.
	 *
	 * @return true hvis e blev fjernet fra listen ellers returneres false.
	 */
	public boolean removeElement(String e) {
		if (size == 0) {
			throw new NoSuchElementException();
		} else if (size == 1) {
			first.next = null;
			last.prev = null;
			size--;
			return true;
		} else {
			Node prevNode = first;
			boolean found = false;
			while (!found && !prevNode.next.equals(last)) {
				if (prevNode.next.data.equals(e)) {
					found = true;
				} else {
					prevNode = prevNode.next;
				}
			}
			if (found) {
				Node tempNode = prevNode.next;
				prevNode.next = tempNode.next;
				tempNode.next.prev = prevNode;
				return true;
			}
		}
		return false;
	}

	/**
	 * Udskriver elementerne fra listen i sorteret rækkefølge
	 */
	public void udskrivElements() {
		Node tempNode = first.next;
		while (!tempNode.equals(last)) {
			System.out.println(tempNode.data);
			tempNode = tempNode.next;
		}
	}

	/**
	 * Udskriver elementerne fra listen i sorteret rækkefølge bagfra
	 */
	public void udskrivBagfra() {
		Node tempNode = last.prev;
		while (!tempNode.equals(first)) {
			System.out.println(tempNode.data);
			tempNode = tempNode.prev;
		}
	}

	/**
	 * Returnerer antallet af elementer i listen
	 */
	public int countElements() {
		return size;
	}

	// Privat indre klasse der modellerer en node i en dobbeltkædet liste
	class Node {
		public String data;
		public Node next;
		public Node prev;
	}
}
