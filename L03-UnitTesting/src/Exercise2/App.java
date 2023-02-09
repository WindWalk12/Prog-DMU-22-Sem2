package Exercise2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class App {
    /*
     * Returnerer størrelsen af bøden beregnet i henhold til skemaet
     * ovenfor
     * krav: beregnetDato og faktiskDato indeholder lovlige datoer og
     *       beregnetDato < faktiskDato
     *      (beregnetDato er forventet afleveringsdato og
     *       faktiskDato er den dag bogen blev afleveret; voksen er
     *       sand, hvis det er en voksen og falsk ellers)
     */
    public int beregnBøde(LocalDate beregnetDato, LocalDate faktiskDato, boolean voksen) {
        long days = ChronoUnit.DAYS.between(beregnetDato, faktiskDato);
        int bøde = days > 0 ? days > 7 ? days > 14 ? 45 : 30 : 10 : 0;
        return voksen ? 2*bøde : bøde;
    }
}
