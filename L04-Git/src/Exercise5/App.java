package Exercise5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Jan Jensen", "Jens Hansen", "Leo Hansen", "Jens Jensen", "Jensine Larsen"));
        System.out.println(countDelStrengIteration(names, "Jens"));

    }

    public static int countDelStrengIteration(List<String> list, String sub){
        int count = 0;
        for (String s : list) {
            for (int i = 0; i < s.length() - sub.length(); i++) {
                String temp = s.substring(i, i + sub.length());
                if (temp.equals(sub)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countDelStrengRecursion(List<String> list, String sub){
        //TODO
        int count = 0;
        for (String s : list) {
            for (int i = 0; i < s.length() - sub.length(); i++) {
                String temp = s.substring(i, i + sub.length());
                if (temp.equals(sub)) {
                    count++;
                }
            }
        }
        return count;
    }
}
