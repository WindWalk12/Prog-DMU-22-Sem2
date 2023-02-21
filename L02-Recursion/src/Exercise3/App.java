package Exercise3;

public class App {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println(binarySearch(numbers, 20));
    }

    public static boolean binarySearch(int [] arr, int number) {
        return binarySearch(arr, number, 0, arr.length - 1);
    }
    public static boolean binarySearch(int [] arr, int number, int left, int right) {
        int middle = left + (right - 1) / 2;
        if (left > right) {
            return false;
        } else if (arr[middle] == number) {
            return true;
        } else if (arr[middle] < number ) {
            left = middle + 1;
            return binarySearch(arr, number, left, right);
        } else {
            right = middle - 1;
            return binarySearch(arr, number, left, right);
        }
    }
}