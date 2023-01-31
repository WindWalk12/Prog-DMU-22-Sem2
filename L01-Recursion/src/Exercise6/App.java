package Exercise6;

public class App {
    public static void main(String[] args) {
        System.out.println(domino(4));
    }

    public static int domino(int n) {
        int result;
        if (n <= 2) {
            result = n;
        } else {
            result = domino(n - 1) + domino(n - 2);
        }
        return result;
    }
}
