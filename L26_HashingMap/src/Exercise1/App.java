package Exercise1;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        HashSet<Bil> biler = new HashSet<>();

        Bil b1 = new Bil("GH726FA", "Opel", "GT-7", "Sort");
        Bil b2 = new Bil("JA817HK", "Ford", "JS", "Rød");
        Bil b3 = new Bil("KJ738GF", "Opel", "GT-6", "Gul");
        Bil b4 = new Bil("GH726FA", "Opel", "GT-7", "Sort");

        biler.add(b1);
        biler.add(b2);
        biler.add(b3);
        biler.add(b4);

        for (Bil bil : biler) {
            System.out.println(bil);
        }
    }
}
