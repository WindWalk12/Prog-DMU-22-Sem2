package Exercise3;

public class App {
    public static void main(String[] args) {
        System.out.println(product(2, 3));
        System.out.println(productRus(2, 3));
    }

    public static int product(int a, int b) {
        int result;
        if (a == 0) {
            result = 0;
        } else {
            result = product(a - 1, b) + b;
        }
        return  result;
    }

    public static int productRus(int a, int b) {
        int result;
        if (a == 0) {
            result = 0;
        } else {
            if (a%2 == 0) {
                result = productRus(a/2, b*2);
            } else {
                result = product(a - 1, b) + b;
            }
        }
        return result;
    }
}
