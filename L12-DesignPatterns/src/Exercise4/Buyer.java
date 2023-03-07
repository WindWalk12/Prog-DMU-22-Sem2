package Exercise4;

import HandedCode.urobservablejava.SubjectUr;

import java.util.Observable;
import java.util.Observer;

public class Buyer implements Observer {
    private String name;

    public Buyer(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        String titel = ((BookTitle) o).getTitle();
        int inStorage = ((BookTitle) o).getQuantity();
        if (inStorage < 6) {
            System.out.println("The book " + titel + " is less than 6, 10 more is being bought");
            ((BookTitle) o).buyToStorage(10);
        }
    }
}
