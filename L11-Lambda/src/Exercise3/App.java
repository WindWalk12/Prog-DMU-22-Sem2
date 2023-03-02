package Exercise3;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(3, 4, 12, 50, 1, 8, 110, 54));
        ListIterator<Integer> iterator = numbers.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        Map<Integer, Integer> numbersMap = new HashMap<>();
        numbersMap.put(2,4);
        numbersMap.put(3,9);
        numbersMap.put(4,16);
        numbersMap.put(5,25);
        numbersMap.put(6,36);

        Iterator<Map.Entry<Integer, Integer>> mapIterator = numbersMap.entrySet().iterator();
        while (mapIterator.hasNext()) {
            int key = mapIterator.next().getKey();
            int value = numbersMap.get(key);
            System.out.println("Key: " + key + " Value: " + value);
        }
    }
}
