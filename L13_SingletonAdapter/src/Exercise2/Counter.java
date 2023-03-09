package Exercise2;

public class Counter {
    private static Counter uniqueCounter;
    private int value;
    private Counter() {this.value = 0;}

    public static Counter getInstance() {
        if (uniqueCounter == null) {
            uniqueCounter = new Counter();
        }
        return uniqueCounter;
    }

    public void count() {
        this.value++;
    }

    public void times2() {
        this.value *= 2;
    }

    public void zero() {
        this.value = 0;
    }

    public int getValue() {
        return this.value;
    }

}
