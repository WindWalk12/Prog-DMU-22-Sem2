package Exercise2.List;

import java.util.ArrayList;
import java.util.List;

public class Skole {
    private String navn;
    private List<Studerende> studenter;

    public Skole(String navn) {
        this.navn = navn;
        this.studenter = new ArrayList<>();
    }

    public String getNavn() {
        return navn;
    }

    public void addStuderende(Studerende studerende) {
        if (!studenter.contains(studerende)) {
            studenter.add(studerende);
        }
    }

    public void removeStuderende(Studerende studerende) {
        if (studenter.contains(studerende)) {
            studenter.remove(studerende);
        }
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
