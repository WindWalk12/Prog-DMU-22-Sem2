package Exercise5;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        char[] characters = {'G', 'R', 'S', 'G', 'G', 'R', 'S', 'R', 'G', 'G', 'R', 'S', 'G'};
        System.out.println(characters);
        belgisk_flag(characters);
        System.out.println(characters);
    }

    public static void belgisk_flag(char[] belgisk_flag) {
        int s = 0;
        int g = 0;
        int r = 0;
        for (char c :belgisk_flag) {
            if (c == 'S') {
                s++;
            } else if (c == 'G') {
                g++;
            } else {
                r++;
            }
        }
        int max = Math.max(s, Math.max(g, r));
        for (int i = 0; i < max; i++) {
            if (s > i) {
                belgisk_flag[i] = 'S';
            }
            if (g > i) {
                belgisk_flag[i + s] = 'G';
            }
            if (r > i) {
                belgisk_flag[i + s + g] = 'R';
            }
        }
    }
}
