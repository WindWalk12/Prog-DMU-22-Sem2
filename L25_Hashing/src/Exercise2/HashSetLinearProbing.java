package Exercise2;

/**
 * This class implements a hash set using separate chaining.
 */
public class HashSetLinearProbing {
	private Object[] buckets;
	private int currentSize;
	private static final String DELETED = "DELETED";

	/**
	 * Constructs a hash table.
	 *
	 * @param bucketsLength
	 *            the length of the buckets array
	 */
	public HashSetLinearProbing(int bucketsLength) {
		buckets = new Object[bucketsLength];
		currentSize = 0;
	}

	/**
	 * Tests for set membership.
	 *
	 * @param x
	 *            an object
	 * @return true if x is an element of this set
	 */
	public boolean contains(Object x) {
		for (Object bucket : buckets) {
			if (bucket == x) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Adds an element to this set.
	 *
	 * @param x
	 *            an object
	 * @return true if x is a new object, false if x was already in the set
	 */
	public boolean add(Object x) {
		int h = hashValue(x);
		if (buckets[h] == null || buckets[h] == DELETED) {
			buckets[h] = x;
			currentSize++;
			return true;
		} else {
			int index = h + 1;
			for (int i = 0; i < buckets.length - 1; i++) {
				if (index == buckets.length) {
					index = 0;
				}
				if (buckets[index] == null || buckets[index] == DELETED) {
					buckets[index] = x;
					currentSize++;
					return true;
				}
				index++;
			}
		}
		return false;
	}

	/**
	 * Removes an object from this set.
	 *
	 * @param x
	 *            an object
	 * @return true if x was removed from this set, false if x was not an
	 *         element of this set
	 */
	public boolean remove(Object x) {
		for (int i = 0; i < buckets.length; i++) {
			if (buckets[i] == x) {
				buckets[i] = DELETED;
				currentSize--;
				return true;
			}
		}
		return false;
	}

	/**
	 * Gets the number of elements in this set.
	 *
	 * @return the number of elements
	 */
	public int size() {
		return currentSize;
	}

	private int hashValue(Object x) {
		int h = x.hashCode();
		if (h < 0) {
			h = -h;
		}
		h = h % buckets.length;
		return h;
	}

	// method only for test purpose
	public void writeOut() {
		for (int i = 0; i < buckets.length; i++) {
			System.out.println(i + "\t" + buckets[i]);
		}
	}

}
