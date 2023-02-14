package Exercise4;

public class App {
    public static void main(String[] args) {
        System.out.println(ackermanFunction(1, 3));
    }

    public static int ackermanFunction(int x, int y) {
        if (x == 0) {
            return y + 1;
        } else if (y == 0) {
            return ackermanFunction(x -1, 1);
        } else {
            return ackermanFunction(x - 1, ackermanFunction(x, y - 1));
        }
    }
}
