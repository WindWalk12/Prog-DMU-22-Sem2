package Exercise3;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        Name n1 = new Name("Klaes", "Mendes");
        Person<String> p1 = new Person<>("Hanne Jensen");
        Person<Name> p2 = new Person<>(n1);

        System.out.println(p1.getName());
        System.out.println();
        System.out.println(p2.getName());
        System.out.println();

        Name n2 = new Name("Andreas", "Mendes");
        Person<Name> p3 = new Person<>(n2);
        Name n3 = new Name("Andreas", "Andes");
        Person<Name> p4 = new Person<>(n3);
        Name n4 = new Name("Klaes", "Andes");
        Person<Name> p5 = new Person<>(n4);

        ArrayList<Person<Name>> persons = new ArrayList<>();
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        persons.add(p5);

        for (Person p : persons) {
            System.out.println(p.getName());
        }
        Collections.sort(persons);
        System.out.println();
        for (Person p : persons) {
            System.out.println(p.getName());
        }
        System.out.println();
    }
}
