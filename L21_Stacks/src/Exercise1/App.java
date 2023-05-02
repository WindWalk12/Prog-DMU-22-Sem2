package Exercise1;

public class App {
    public static void main(String[] args) {
        ArrayStack as = new ArrayStack();

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
        as.push("E");
        as.push("E");
        as.push("E");
        as.push("E");
        as.push("E");
        System.out.println(as.size());
    }


}
