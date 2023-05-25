package Exercise2;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        Dictionary<Bil, Integer> biler = new DictionaryLinked<>();

        Bil b1 = new Bil("GH726FA", "Opel", "GT-7", "Sort");
        Bil b2 = new Bil("JA817HK", "Ford", "JS", "Rød");
        Bil b3 = new Bil("KJ738GF", "Opel", "GT-6", "Gul");

        biler.put(b1, 3);
        biler.put(b2, 0);
        biler.put(b3, 4);

        System.out.println("Bil 1 har været på værksted " + biler.get(b1) + " Gange");
        System.out.println("Bil 2 har været på værksted " + biler.get(b2) + " Gange");
        System.out.println("Bil 3 har været på værksted " + biler.get(b3) + " Gange");
    }
}
