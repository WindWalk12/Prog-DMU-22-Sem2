package Exercise2;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(0);
        numbers.add(3);
        numbers.add(0);
        numbers.add(5);
        numbers.add(0);

        System.out.println(findAllZeros(numbers, 0 , numbers.size() - 1));
    }

    public static int findAllZeros(ArrayList<Integer> list, int l, int h) {
        if (l == h) {
            if (list.get(l) == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            int m = (l + h) / 2;
            int num1 = findAllZeros(list, l, m);
            int num2 = findAllZeros(list, m + 1, h);
            return num1 + num2;
        }
    }
}
