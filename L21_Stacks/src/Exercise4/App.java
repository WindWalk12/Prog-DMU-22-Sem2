package Exercise4;

public class App {
    public static void main(String[] args) {
        NodeStackDropOutDouble as = new NodeStackDropOutDouble(5);

        as.push("E");
        System.out.println(as.peek());
        System.out.println(as.size());
        System.out.println();
        as.push(1);
        System.out.println(as.peek());
        System.out.println(as.size());
        System.out.println(as.pop());
        System.out.println();
        System.out.println(as.peek());
        System.out.println(as.size());
        as.push("A");
        as.push("B");
        as.push("C");
        as.push("D");
        as.push("H");
        as.push("I");
        System.out.println(as.size());
        System.out.println();
        System.out.println(as);
        System.out.println(as.peek());
    }
}
