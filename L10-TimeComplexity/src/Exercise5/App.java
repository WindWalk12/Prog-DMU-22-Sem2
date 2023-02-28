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
        mergesort(belgisk_flag, 0, belgisk_flag.length - 1);
    }

    private static void mergesort(char[] list, int l, int h) {
        if (l < h) {
            int m = (l + h) / 2;
            mergesort(list, l, m);
            mergesort(list, m + 1, h);
            merge(list, l, m, h);
        }
    }

    private static void merge(char[] list, int low, int middle, int high) {
        ArrayList<Character> temp = new ArrayList<Character>();

        int leftIndex = low;
        int rightIndex = middle + 1;

        while (leftIndex <= middle && rightIndex <= high) {
            if (list[leftIndex] <= list[rightIndex]) {
                temp.add(list[leftIndex]);
                leftIndex++;
            } else {
                temp.add(list[rightIndex]);
                rightIndex++;
            }
        }
        while (leftIndex <= middle) {
            temp.add(list[leftIndex]);
            leftIndex++;
        }
        while (rightIndex <= high) {
            temp.add(list[rightIndex]);
            rightIndex++;
        }

        int i = 0;
        int j = low;
        while (i < temp.size()) {
            list[j] = temp.get(i++);
            j++;
        }
    }
}
