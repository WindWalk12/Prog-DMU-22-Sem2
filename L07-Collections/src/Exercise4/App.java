package Exercise4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("L07-Collections/src/Exercise4/movies.txt");
        Scanner sc = new Scanner(file);
        List<Map<String, Integer>> maps = new ArrayList<>();
        maps.add(new HashMap<>());

        while (sc.hasNext()) {
            String name = sc.nextLine();
            int score = Integer.parseInt(sc.nextLine());
            boolean putInto = false;
            for (int i = 0; i < maps.size(); i++) {
                if (!maps.get(i).containsKey(name) && !putInto) {
                    maps.get(i).put(name, score);
                    putInto = true;
                }
            }
            if (!putInto) {
                maps.add(new HashMap<>());
                maps.get(maps.size() - 1).put(name, score);
            }
        }

        for (Map.Entry<String, Integer> pair : maps.get(0).entrySet()) {
            int antalKarakterer = 1;
            int samletKarakterer = pair.getValue();
            for (int i = 1; i < maps.size(); i++) {
                for (Map.Entry<String, Integer> pair2 : maps.get(i).entrySet()) {
                    if (pair.getKey().equals(pair2.getKey())) {
                        samletKarakterer += pair2.getValue();
                        antalKarakterer++;
                    }
                }
            }
            System.out.println(antalKarakterer);
            System.out.println(samletKarakterer);
            double gennemsnit = (double)samletKarakterer/(double)antalKarakterer;
            System.out.println(pair.getKey() + ": " + antalKarakterer + " karakter" + ", " + "gennemsnit " + gennemsnit);
        }

    }
}
