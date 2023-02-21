package Exercise2.Set;

import java.util.HashSet;
import java.util.Set;

public class Skole {
    private String navn;
    private Set<Studerende> studenter;

    public Skole(String navn) {
        this.navn = navn;
        this.studenter = new HashSet<>();
    }

    public String getNavn() {
        return navn;
    }

    public void addStuderende(Studerende studerende) {
            studenter.add(studerende);
    }

    public void removeStuderende(Studerende studerende) {
            studenter.remove(studerende);
    }

    public double gennemsnit() {
        int alleKarakterer = 0;
        int antalKarakterer = 0;
        for (Studerende s : studenter) {
            for (Integer i : s.getKarakterer()) {
                alleKarakterer += i;
                antalKarakterer++;
            }
        }
        return alleKarakterer/antalKarakterer;
    }

    public Studerende findStuderende(int studieNr) {
        for (Studerende s :studenter) {
            if (studieNr == s.getStudieNr()) {
                return s;
            }
        }
        return null;
    }
}
