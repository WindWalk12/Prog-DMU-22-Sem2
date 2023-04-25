package Exercise2;

import java.util.NoSuchElementException;

public class SortedLinkedList {

	private Node first;

	public SortedLinkedList() {
		first = null;
	}

	/**
	 * Tilføjer e til listen, så listen fortsat er sorteret i henhold til den
	 * naturlige ordning på elementerne
	 */
	public void addElement(String e) {
		if (first == null) {
			addFirst(e);
		} else if (e.compareTo(first.data) < 0) {
			addFirst(e);
		} else {
			Node previous = first;
			boolean found = false;
			while (!found && previous.next != null) {
				if (previous.next.data.compareTo(e) > 0) {
					found = true;
				} else {
					previous = previous.next;
				}
			}
			Node newNode = new Node();
			newNode.data = e;
			newNode.next = previous.next;
			previous.next = newNode;
		}
	}

	public void addFirst(String e) {
		Node newNode = new Node();
		newNode.data = e;
		newNode.next = first;
		first = newNode;
	}

	/**
	 * Udskriver elementerne fra listen i sorteret rækkefølge
	 */
	public void udskrivElements() {
		Node tempNode = first;
		while (tempNode != null) {
			System.out.println(tempNode.data);
			tempNode = tempNode.next;
		}
	}
	
	/**
	 * Returnerer antallet af elementer i listen
	 */
	public int countElements() {
		int count = 0;
		Node tempNode = first;
		while (tempNode != null) {
			count++;
			tempNode = tempNode.next;
		}
		return count;
	}

	
	/**
	 * Fjerner det sidste (altså det største) element i listen. Listen skal fortsat være
	 * sorteret i henhold til den naturlige ordning på elementerne.
	 *
	 * @return true hvis der blev fjernet fra listen ellers returneres false.
	 */
	public boolean removeLast() {
		if (first == null) {
			throw new NoSuchElementException();
		} else if (first.next == null) {
			first = null;
			return true;
		} else {
			Node tempNode = first;
			Node prevNode = null;
			while (tempNode.next != null) {
				prevNode = tempNode;
				tempNode = tempNode.next;
			}
			prevNode.next = null;
			return true;
		}
	}
	
	/**
	 * Fjerner den første forekomst af e i listen. Listen skal fortsat være
	 * sorteret i henhold til den naturlige ordning på elementerne.
	 *
	 * @return true hvis e blev fjernet fra listen ellers returneres false.
	 */
	public boolean removeElement(String e) {
		if (first == null) {
			throw new NoSuchElementException();
		} else if (first.data.equals(e)) {
			first = first.next;
			return true;
		} else {
			Node prevNode = first;
			boolean found = false;
			while (!found && prevNode.next != null) {
				if (prevNode.next.data.equals(e)) {
					found = true;
				} else {
					prevNode = prevNode.next;
				}
			}
			if (found) {
				Node tempNode = prevNode.next;
				prevNode.next = tempNode.next;
				return true;
			}
		}
		return false;
	}

	// Privat indre klasse der modellerer en node i listen
	private class Node {
		public String data;
		public Node next;
	}
}
