package Exercise2;

import java.util.NoSuchElementException;

public class DictionaryLinked<K, V> implements Dictionary<K, V> {

	private Node start;
	private int size;

	/**
	 * HashingMap constructor comment.
	 */

	public DictionaryLinked() {
		// Sentinel (tomt listehoved - der ikke indeholder data)
		start = new Node();
		size = 0;
	}

	@Override
	public V get(K key) {
		if (key != null) {
			Node tempNode = start;
			V value = null;
			while (tempNode.next != null && tempNode.key != key) {
				tempNode = tempNode.next;
			}
			if (tempNode.key == key) {
				value = tempNode.value;
			}
			return value;
		} else {
			throw new IllegalArgumentException("Missing key");
		}
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public V put(K key, V value) {
		if (key != null && value != null) {
			Node newNode = new Node();
			newNode.value = value;
			newNode.key = key;
			if (size == 0) {
				start.next = newNode;
			} else {
				Node tempNode = start.next;
				while (tempNode.next != null && !tempNode.key.equals(key)) {
					tempNode = tempNode.next;
				}
				if (tempNode.key.equals(key)) {
					V removedValue = tempNode.value;
					tempNode.value = value;
					return removedValue;
				} else {
					tempNode.next = newNode;
				}
			}
			size++;
			return value;
		} else {
			throw new IllegalArgumentException("Missing key or value");
		}
	}

	@Override
	public V remove(K key) {
		if (key != null) {
			if (isEmpty()) {
				throw new NoSuchElementException();
			} else {
				Node prevNode = start;
				boolean found = false;
				while (!found && prevNode.next != null) {
					if (prevNode.next.key.equals(key)) {
						found = true;
					} else {
						prevNode = prevNode.next;
					}
				}
				if (found) {
					Node tempNode = prevNode.next;
					prevNode.next = tempNode.next;
					size--;
					return tempNode.value;
				}
			}
			return null;
		} else {
			throw new IllegalArgumentException("Missing key");
		}
	}

	@Override
	public int size() {
		return size;
	}

	private class Node {
		Node next;
		K key;
		V value;
	}

}
