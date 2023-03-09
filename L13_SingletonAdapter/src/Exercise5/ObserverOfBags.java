package Exercise5;

public class ObserverOfBags implements Observer {
    public ObserverOfBags() {
    }

    @Override
    public void update(String s, int amount) {
        if(amount == 0) {
            System.out.println("The string " + s + " has been removed");
        } else {
            System.out.println("There is " + amount + " of " + s + " in the bag");
        }
    }
}
