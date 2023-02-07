package Exercise1;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        randomNumbers.add(3);
        randomNumbers.add(2);
        randomNumbers.add(6);
        randomNumbers.add(5);
        randomNumbers.add(8);
        System.out.println(ligeTal(randomNumbers));
        System.out.println(ligeTal2(randomNumbers));
    }

    // With helper method
    public static int ligeTal(ArrayList<Integer> list) {
       return ligeTal(list, 0);
    }

    private static int ligeTal(ArrayList<Integer> list, int index) {
        int result = 0;
        if (index == list.size()) {
            return 0;
        } else {
            if (list.get(index)%2 == 0) {
                result += 1;
                result = result + ligeTal(list, index + 1);
            } else {
                result = result + ligeTal(list, index + 1);
            }
        }
        return result;
    }

    // Without helper method
    public static int ligeTal2(ArrayList<Integer> list) {
        ArrayList<Integer> temp = list;
        int result = 0;
        if (temp.size() == 0) {
            return 0;
        } else {
            if (temp.get(0)%2 == 0) {
                temp.remove(0);
                result += 1;
                result = result + ligeTal2(temp);
            } else {
                temp.remove(0);
                result = result + ligeTal2(temp);
            }
        }
        return result;
    }
}
