package Exercise2;

import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        Person p1 = new Person("Bo");
        Person p2 = new Person("Bent");
        Person p3 = new Person("Anders");
        Person p4 = new Person("Hans");

        PersonCollection pc = new PersonCollection();

        pc.add(p1);
        pc.add(p2);
        pc.add(p3);
        pc.add(p4);

        pc.forEach(person -> System.out.println(person));
        System.out.println();

        Iterator<Person> iterator = pc.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
