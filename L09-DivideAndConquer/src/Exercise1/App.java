package Exercise1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        System.out.println(sumAllNumbers(numbers, 0 , numbers.size() - 1));
    }

    public static int sumAllNumbers(ArrayList<Integer> list, int l, int h) {
        if (l == h) {
            return list.get(l);
        } else {
            int m = (l + h) / 2;
            int num1 = sumAllNumbers(list, l, m);
            int num2 = sumAllNumbers(list, m + 1, h);
            return num1 + num2;
        }
    }
}
