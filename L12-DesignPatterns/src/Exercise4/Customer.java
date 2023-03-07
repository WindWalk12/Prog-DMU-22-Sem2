package Exercise4;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<BookTitle> bookTitles = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public ArrayList<BookTitle> getBookTitles() {
        return new ArrayList<>(bookTitles);
    }

    public void addBookTitle (BookTitle bt) {
        if (!bookTitles.contains(bt)) {
            bookTitles.add(bt);
        }
    }

    public String getName() {
        return name;
    }
}
