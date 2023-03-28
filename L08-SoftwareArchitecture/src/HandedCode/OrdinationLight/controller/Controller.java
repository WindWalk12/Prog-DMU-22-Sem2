package HandedCode.OrdinationLight.controller;

import HandedCode.OrdinationLight.ordination.*;
import HandedCode.OrdinationLight.storage.*;

public class Controller {
    private Storage storage;
    private static Controller controller;

    private Controller() {
        storage = new Storage();
    }

    public static Controller getController() {
        if (controller == null) {
            controller = new Controller();
        }
        return controller;
    }

    /**
     * For et givent vægtinterval og et givent lægemiddel, hentes antallet af
     * ordinationer.
     * Pre: laegemiddel er ikke null
     */
    public int antalOrdinationerPrVægtPrLægemiddel(double vægtStart, double vægtSlut, Laegemiddel laegemiddel) {
        int antal = 0;
        for (Patient patient : storage.getAllPatienter()) {
            if (patient.getVaegt() >= vægtStart && patient.getVaegt() <= vægtSlut) {
                for (Ordination ordination : patient.getOrdinationer()) {
                    if (ordination.getLaegemiddel().equals(laegemiddel)) {
                        antal++;
                    }
                }
            }
        }
        return antal;
    }
}
