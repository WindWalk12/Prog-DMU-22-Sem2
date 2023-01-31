package Exercise2;

public class App {
    public static void main(String[] args) {
        System.out.println(power(2,3));
        System.out.println(power2(2, 3));
    }

    public static int power(int n, int p) {
        int result;
        if (p == 0) {
            result = 1;
        } else {
            result = n*power(n, p - 1);
        }
        return result;
    }

    public static int power2(int n, int p) {
        int result;
        if (p == 0) {
            result = 1;
        } else {
            if (p%2 == 0) {
                result = power2(n*n, p/2);
            } else {
                result = n*power2(n, p - 1);
            }
        }
        return result;
    }
}
