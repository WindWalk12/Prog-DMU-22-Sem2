package Exercise4;

import java.util.*;

public class Salesman implements Observer {
    private String name;

    public Salesman(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Set<BookTitle> bookTitles = new HashSet<>();
        for (Customer c :((BookTitle) o).getCustomers()) {
            for (BookTitle bt :c.getBookTitles()) {
                if (!((BookTitle) o).getTitle().equals(bt.getTitle())) {
                    bookTitles.add(bt);
                }
            }

        }
        if (bookTitles.size() > 0) {
            System.out.print("Customers has also bought the books: ");
            for (BookTitle bt : bookTitles) {
                System.out.print(bt.getTitle() + " ");
            }
            System.out.println();
        }
    }
}
