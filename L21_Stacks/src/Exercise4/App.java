package Exercise4;

public class App {
    public static void main(String[] args) {
        ArrayStackDropOut as = new ArrayStackDropOut();
        as.push("E");
        as.push(1);
        as.push("A");
        as.push("B");
        as.push("C");
        as.push("D");
        as.push("H");
        as.push("I");
        System.out.println();
        System.out.println(as);
        as.pop();
        System.out.println(as);
        as.pop();
        System.out.println(as);
        as.pop();
        System.out.println(as);
        as.pop();
        System.out.println(as);
        as.pop();
        System.out.println(as);
        as.push("I");
        System.out.println(as);
    }
}
