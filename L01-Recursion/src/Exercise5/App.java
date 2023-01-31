package Exercise5;

public class App {
    public static void main(String[] args) {
        System.out.println(sfd(4, 6));
    }

    public static int sfd(int a, int b) {
        int result;
        if (b <= a && a%b == 0) {
            result = b;
        } else {
            if (a < b) {
                result = sfd(b, a);
            } else {
                result = sfd(b, a%b);
            }
        }
        return result;
    }
}
