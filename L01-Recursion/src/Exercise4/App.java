package Exercise4;

public class App {
    public static void main(String[] args) {
        System.out.println(reverse("RANSLIRPA"));
    }

    public static String reverse(String s) {
        String result;
        if (s.length() == 1) {
            result = s.substring(0, 1);
        } else {
            result = s.substring(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
        }
        return result;
    }
}
