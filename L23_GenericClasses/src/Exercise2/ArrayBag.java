package Exercise2;import java.util.Arrays;import java.util.NoSuchElementException;public class ArrayBag<T> implements Bag<T> {    private T[] array;    private int index = 0;    public ArrayBag(int size) {        this.array = (T[]) new Object[size];    }    @Override    public int getCurrentSize() {        int currentSize = 0;        for (int i = 0; i < array.length; i++) {            if (array[i] != null) {                currentSize++;            }        }        return currentSize;    }    @Override    public boolean isFull() {        return getCurrentSize() == array.length;    }    @Override    public boolean isEmpty() {        for (int i = 0; i < array.length; i++) {            if (array[i] != null) {                return false;            }        }        return true;    }    @Override    public boolean add(T newEntry) {        if (isFull()) {            System.out.println("Array is full");            return false;        } else {            array[index] = newEntry;            index++;            return true;        }    }    @Override    public T remove() {        if (isEmpty()) {            throw new NoSuchElementException();        } else {            index--;            T removed = array[index];            array[index] = null;            return removed;        }    }    @Override    public boolean remove(T anEntry) {        if (isEmpty()) {            throw new NoSuchElementException();        } else {            for (int i = 0; i < array.length; i++) {                if (array[i] == anEntry) {                    array[i] = null;                    return true;                }            }            return false;        }    }    @Override    public void clear() {        Arrays.fill(array, null);    }    @Override    public int getFrequencyOf(T anEntry) {        int frequency = 0;        for (int i = 0; i < array.length; i++) {            if (array[i] == anEntry) {                frequency++;            }        }        return frequency;    }    @Override    public boolean contains(T anEntry) {        boolean found = false;        for (int i = 0; i < array.length; i++) {            if (array[i] == anEntry) {                found = true;                break;            }        }        return found;    }    @Override    public T[] toArray() {        T[] newArray = (T[]) new Object[getCurrentSize()];        int index = 0;        for (int i = 0; i < array.length; i++) {            if (array[i] != null) {                newArray[index] = array[i];                index++;            }        }        return newArray;    }}