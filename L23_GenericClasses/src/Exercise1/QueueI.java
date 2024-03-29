package Exercise1;

/**
 * An interface of a queue
 */
public interface QueueI<T> {

	/**
	 * Checks whether this queue is empty.
	 *
	 * @return true if this queue is empty
	 */
	public boolean isEmpty();

	/**
	 * Adds an element to the tail of this queue.
	 *
	 * @param newElement
	 *            the element to add
	 */
	public void enqueue(T newElement);

	/**
	 * Removes an element from the head of this queue.
	 *
	 * @return the removed element
	 */
	public T dequeue();

	/**
	 * Returns the head of this queue. The queue is unchanged.
	 *
	 * @return the head element
	 */
	public T getFront();

	/**
	 * The number of elements on the queue.
	 *
	 * @return the number of elements on the queue
	 */
	public int size();

}
