package Exercise5;

import java.util.*;
import java.util.function.Consumer;

public class ObservableBag implements Bag, Iterable<String>, Observable {
    private Map<String, Integer> strings = new HashMap<>();
    private Set<Observer> observers = new HashSet<>();
    public ObservableBag() {
    }

    @Override
    public void add(String s) {
        if (strings.containsKey(s)) {
            strings.put(s, strings.get(s) + 1);
        } else {
            strings.put(s, 1);
        }
        notifyObservers(s, strings.get(s));
    }

    @Override
    public void remove(String s) {
        if (strings.containsKey(s)) {
            strings.put(s, strings.get(s) - 1);
            notifyObservers(s, strings.get(s));
        } else if (strings.get(s) == 1) {
            strings.remove(s);
            notifyObservers(s, 0);
        }
    }

    @Override
    public int getCount(String s) {
        return strings.get(s);
    }

    @Override
    public Iterator<String> iterator() {
        Iterator<String> it = new Iterator<String>() {
            private int currentIndex = 0;
            final String[] arrayString = strings.keySet().toArray(new String[strings.keySet().size()]);
            @Override
            public boolean hasNext() {
                return currentIndex < strings.keySet().size() && !strings.isEmpty();
            }

            @Override
            public String next() {
                return arrayString[currentIndex++];
            }
        };
        return it;
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    private void notifyObservers(String s, int amount) {
        for (Observer o :observers) {
            o.update(s, amount);
        }

    }
}
