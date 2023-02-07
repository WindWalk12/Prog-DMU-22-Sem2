package Exercise2;

public class App {
    public static void main(String[] args) {
        System.out.println(palindrom("radar"));

    }

    public static boolean palindrom(String s) {
        return palindrom(s, 0, s.length() - 1);
    }

    private static boolean palindrom(String s, int left, int right) {
        if (left >= right) {
            return true;
        } else {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
        }
        return palindrom(s, left + 1, right - 1);
    }
}
