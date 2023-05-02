package Exercise2;

public class App {
    public static void main(String[] args) {
        NodeStack ns = new NodeStack();

        ns.push("E");
        System.out.println(ns.peek());
        System.out.println();
        ns.push(1);
        System.out.println(ns.peek());
        System.out.println();
        System.out.println(ns.pop());
        System.out.println();
        System.out.println(ns.peek());
    }
}
