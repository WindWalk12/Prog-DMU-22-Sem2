package Exercise4;

import java.util.ArrayList;
import java.util.Observable;

public class BookTitle extends Observable {
    private String title;
    private int quantity;
    private ArrayList<Customer> customers = new ArrayList<>();

    public BookTitle(String title, int quantity) {
        this.title = title;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void buyToStorage (int quantity) {
        this.quantity += quantity;
    }

    public void addCustomer (Customer c) {
        if (!customers.contains(c)) {
            customers.add(c);
        }
    }

    public ArrayList<Customer> getCustomers() {
        return new ArrayList<>(customers);
    }

    public void bought (Customer c) {
        System.out.println("The book with the title: " + this.title + " gets bought by " + c.getName());
        quantity--;
        addCustomer(c);
        c.addBookTitle(this);
        setChanged();
        notifyObservers();
    }
}
