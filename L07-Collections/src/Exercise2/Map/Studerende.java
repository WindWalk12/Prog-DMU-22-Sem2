package Exercise2.Map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Studerende {
    private int studieNr;
    private String navn;
    private Set<Integer> karakterer;

    public Studerende(int studieNr, String navn, List<Integer> karakterer) {
        this.studieNr = studieNr;
        this.navn = navn;
        this.karakterer = new HashSet<>();
    }

    public int getStudieNr() {
        return studieNr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void addKarakter(int karakter) {
        karakterer.add(karakter);
    }

    public List<Integer> getKarakterer() {
        return new ArrayList<>(karakterer);
    }

    @Override
    public String toString() {
        return "Studerende{" +
                "studieNr=" + studieNr +
                ", navn='" + navn + '\'' +
                '}';
    }
}
