package Exercise2;

public class DictionaryBST<K extends Comparable<K>, V> implements Dictionary<K, V> {

	private Node root;

	public DictionaryBST() {
		root = null;
	}

	@Override
	public V get(K key) {
		Node dataNode = find(key);
		if (dataNode != null) {
			return dataNode.value;
		} else {
			return null;
		}
	}

	private Node find(K key) {
		Node current = root;
		boolean found = false;
		while (!found && current != null) {
			int d = current.key.compareTo(key);
			if (d == 0) {
				found = true;
			} else if (d > 0) {
				current = current.left;
			} else {
				current = current.right;
			}
		}
		if (found) {
			return current;
		} else {
			return null;
		}

	}

	@Override
	public boolean isEmpty() {
		return root == null;
	}

	@Override
	public V put(K key, V value) {
		Node searchedNode = find(key);
		if (searchedNode == null) {
			Node newNode = new Node(key, value);
			if (root == null) {
				root = newNode;
			} else {
				root.addNode(newNode);
			}
			return newNode.value;
		} else {
			V oldValue = searchedNode.value;
			searchedNode.value = value;
			return oldValue;
		}
	}

	@Override
	public V remove(K key) {
		Node toBeRemoved = root;
		Node parent = null;
		V toReturn = null;
		boolean found = false;
		while (!found && toBeRemoved != null) {
			int d = toBeRemoved.key.compareTo(key);
			if (d == 0) {
				found = true;
				toReturn = toBeRemoved.value;
			} else {
				parent = toBeRemoved;
				if (d > 0) {
					toBeRemoved = toBeRemoved.left;
				} else {
					toBeRemoved = toBeRemoved.right;
				}
			}
		}

		if (found) {

			// toBeRemoved contains obj

			// If one of the children is empty, use the other

			if (toBeRemoved.left == null || toBeRemoved.right == null) {
				Node newChild;
				if (toBeRemoved.left == null) {
					newChild = toBeRemoved.right;
				} else {
					newChild = toBeRemoved.left;
				}

				if (parent == null) // Found in root
				{
					root = newChild;
				} else if (parent.left == toBeRemoved) {
					parent.left = newChild;
				} else {
					parent.right = newChild;
				}

			} else {

				// Neither subtree is empty

				// Find smallest element of the right subtree

				Node smallestParent = toBeRemoved;
				Node smallest = toBeRemoved.right;
				while (smallest.left != null) {
					smallestParent = smallest;
					smallest = smallest.left;
				}

				// smallest contains smallest child in right subtree

				// Move contents, unlink child

				toBeRemoved.key = smallest.key;
				toBeRemoved.value = smallest.value;
				if (smallestParent == toBeRemoved) {
					smallestParent.right = smallest.right;
				} else {
					smallestParent.left = smallest.right;
				}
			}
		}
		return toReturn;
	}

	@Override
	public int size() {
		return size(root);
	}

	private int size(Node n) {
		if (n == null) {
			return 0;
		} else {
			return size(n.left) + size(n.right) + 1;
		}
	}

	private class Node {
		private K key;
		private V value;
		private Node left;
		private Node right;

		public Node(K key, V value) {
			this.key = key;
			this.value = value;
			this.left = null;
			this.right = null;
		}

		/**
		 * Inserts a new node as a descendant of this node.
		 *
		 * @param newNode
		 *            the node to insert
		 */
		private void addNode(Node newNode) {
			int comp = newNode.key.compareTo(key);
			if (comp < 0) {
				if (left == null) {
					left = newNode;
				}
				else {
					left.addNode(newNode);
				}
			}
			else if (comp > 0) {
				if (right == null) {
					right = newNode;
				}
				else {
					right.addNode(newNode);
				}
			}
		}

	}

}
