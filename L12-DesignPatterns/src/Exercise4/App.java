package Exercise4;

public class App {
    public static void main(String[] args) {
        BookTitle bt1 = new BookTitle("Anders And", 7);
        BookTitle bt2 = new BookTitle("Java 8", 10);
        Salesman s1 = new Salesman("Hansen");
        bt1.addObserver(s1);
        bt2.addObserver(s1);
        Buyer b1 = new Buyer("Jensen");
        bt1.addObserver(b1);
        bt2.addObserver(b1);

        Customer c1 = new Customer("Læsehest1");
        Customer c2 = new Customer("Læsehest2");
        Customer c3 = new Customer("Læsehest3");

        bt1.bought(c1);
        System.out.println();
        bt1.bought(c2);
        System.out.println();
        bt2.bought(c3);
        System.out.println();
        bt2.bought(c1);
        System.out.println();
        bt2.bought(c2);
        System.out.println();
        bt1.bought(c3);
        System.out.println();
    }
}
