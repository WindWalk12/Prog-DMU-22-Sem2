package Exercise3;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] tal = {5, 10, 5, 6, 4, 9, 8};
        System.out.println(Arrays.toString(prefixAverage(tal)));
    }

    public static double[] prefixAverage(int[] inputTal) {
        double[] averageNumbers = new double[inputTal.length];
        int counter = 1;
        int sum = 0;
        for (int i = 0; i < averageNumbers.length; i++) {
            sum += inputTal[i];
            averageNumbers[i] = (double)sum/counter;
            counter++;
        }
        return averageNumbers;
    }
}
