package Exercise5;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        ObservableBag ob = new ObservableBag();

        ObserverOfBags oob = new ObserverOfBags();

        ob.registerObserver(oob);

        String s1 = "Hola hoop";
        String s2 = "Holly";
        String s3 = "Hola hoop";
        String s4 = "Holly";

        ob.add(s1);
        ob.add(s2);
        ob.add(s3);
        ob.add(s4);
        System.out.println();

        ob.remove(s2);
        ob.remove(s4);
        System.out.println();

        ob.add(s2);
        System.out.println();

        ob.forEach(s -> {
            System.out.println(s);
        });

    }
}
