package Exercise3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Customer c1 = new Customer("Anne", 29845716);
        Customer c2 = new Customer("Bob", 27827501);
        Customer c3 = new Customer("Johnny", 98472672);
        Customer c4 = new Customer("Lise", 95849383);
        ArrayList<Customer> customers = new ArrayList<>(List.of(c2, c3, c1, c4));

        System.out.println(customers);
        Collections.sort(customers);
        System.out.println(customers);

        for (Customer c :customers) {
            c.setSort(new Customer.sortByNumber());
        }

        Collections.sort(customers);
        System.out.println(customers);

    }
}
