package Exercise2;

public class App {
    public static void main(String[] args) {
        System.out.println(Counter.getInstance().getValue());
        Counter.getInstance().count();
        System.out.println(Counter.getInstance().getValue());
        Counter.getInstance().times2();
        System.out.println(Counter.getInstance().getValue());
        Counter.getInstance().zero();
        System.out.println(Counter.getInstance().getValue());
    }
}
