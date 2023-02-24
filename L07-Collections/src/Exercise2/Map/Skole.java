package Exercise2.Map;

import java.util.HashMap;
import java.util.Map;

public class Skole {
    private String navn;
    private Map<Integer, Studerende> studenter;

    public Skole(String navn) {
        this.navn = navn;
        this.studenter = new HashMap<>();
    }

    public String getNavn() {
        return navn;
    }

    public void addStuderende(int studieNr, Studerende studerende) {
            studenter.put(studieNr, studerende);
    }

    public void removeStuderende(int studieNr) {
            studenter.remove(studieNr);
    }

    public double gennemsnit() {
        int alleKarakterer = 0;
        int antalKarakterer = 0;
        for (Map.Entry<Integer, Studerende> pair : studenter.entrySet()) {
            for (Integer i : pair.getValue().getKarakterer()) {
                alleKarakterer += i;
                antalKarakterer++;
            }
        }
        return (double)alleKarakterer/antalKarakterer;
    }

    public Studerende findStuderende(int studieNr) {
        for (Map.Entry<Integer, Studerende> pair : studenter.entrySet()) {
            if (studieNr == pair.getValue().getStudieNr()) {
                return pair.getValue();
            }
        }
        return null;
    }
}
